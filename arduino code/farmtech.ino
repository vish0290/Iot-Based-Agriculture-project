#include <MQ135.h>
#include <DHT.h>
#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>                 
 
#define FIREBASE_HOST "farm-tech-2020.firebaseio.com"      
#define FIREBASE_AUTH "JAmW8IpCaB6Grt8fRtCf1ybJ1JreC2OoyGAyKGRB"            
#define WIFI_SSID "hack if you can"                                  
#define WIFI_PASSWORD "hellothere"            
 
#define DHTPIN D2
const int sensor_pin = A0;                                            
//#define airpin A0
//MQ135 gasSensor=MQ135(A0);
//int air_val;
#define DHTTYPE DHT11                                        // Initialize dht type as DHT 11
DHT dht(DHTPIN, DHTTYPE);                                                    
 
void setup() 
{
  Serial.begin(115200);
  dht.begin();                                                  //reads dht sensor data 
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);                                  
  Serial.print("Connecting to ");
  Serial.print(WIFI_SSID);
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
 
  Serial.println();
  Serial.print("Connected");
  Serial.print("IP Address: ");
  Serial.println(WiFi.localIP());                               //prints local IP address
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);                 // connect to the firebase
 
}
 
void loop() 
{
  int h = dht.readHumidity();                                 // Read Humidity
  float t = dht.readTemperature();                            // Read temperature
  /*air_val=analogRead(airpin);                              Shut down cause of lack of analog pins
  float ppm=gasSensor.getPPM();
  Serial.print("AirQuality=");
  Serial.print(air_val,DEC);
  Serial.print("ppm \n");
  String airq= String(ppm)+String("ppm");
  */
  float moist_percentage=(100-((analogRead(sensor_pin)/1023.00)*100));
  String moist_val=String(moist_percentage)+String("%");
  Serial.print("Soil Moisture(in Percentage) = ");
  Serial.print(moist_percentage);
  Serial.println("%");
  if (isnan(h) || isnan(t))                                     // Checking sensor working
  {                                   
    Serial.println(F("Failed to read from DHT sensor!"));
    return;
  } 
  Serial.print("Humidity: ");  
  Serial.print(h);
  Serial.print("%  Temperature: ");  
  Serial.print(t);  
  Serial.println("°C ");
  delay(5000);
  Firebase.setFloat("arduino/temp",t);
  Firebase.setInt("arduino/hum",h);
  //Firebase.setFloat("arduino/air",ppm); stopped because of 1 analog pin in Nodemcu 
  Firebase.setString("arduino/moisture/val",moist_val);
    if (Firebase.failed()) 
    {
 
      Serial.print("pushing /logs failed:");
      Serial.println(Firebase.error()); 
      return;
  }
}
