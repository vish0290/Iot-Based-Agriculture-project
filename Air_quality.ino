#define apin A0
int val;
void setup() {
  Serial.begin(9600);
}
void loop() {
  val=analogRead(apin);
  Serial.print("AirQua=");
  Serial.print(val,DEC);
  Serial.print(" ppm \n");
  delay(1000);

}
