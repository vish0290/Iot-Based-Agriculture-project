#include<dht.h>
#define dht_apin A0
dht DHT;
void setup() {
 Serial.begin(9600);
 delay(500);
 Serial.println("Sensor is active\n\n");
 delay(1000);
}

void loop() {
  DHT.read11(dht_apin);
  Serial.print("Current Humidity= ");
  Serial.print(DHT.humidity);
  Serial.print("%");
  Serial.print("Current Temperature= ");
  Serial.print(DHT.temperature);
  Serial.print("C");
  Serial.print("\n");
  delay(500);

}
