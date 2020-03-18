#include<dht.h>
#define d_pin A0
#define a_pin A1

dht DHT;
#define pin A2
int aval;
float val=0;
void setup() {
  Serial.begin(9600);
  delay(500);
  Serial.println("Sensors are activated");
  delay(500);

}

void loop() {
  
   for(int i=0;i<100;i++)
 {
  val=val+analogRead(pin);
  delay(1);
  } 
  val=val/100.0;
  Serial.println("Moisture=");
  Serial.println(val);
  delay(100);
  Serial.print("\n");
 aval=analogRead(a_pin);
  Serial.print("AirQua=");
  Serial.print(aval,DEC);
  Serial.print(" ppm \n");
  delay(500);
  Serial.print("\n");
  DHT.read11(d_pin);
  Serial.print("Current Humidity= ");
  Serial.print(DHT.humidity);
  Serial.print("%");
  Serial.print("\n");
  Serial.print("Current Temperature= ");
  Serial.print(DHT.temperature);
  Serial.print("C");
  Serial.print("\n");
  delay(500);


}
