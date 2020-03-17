#define pin A0
float val=0;
void setup() {
  Serial.begin(9600);
}
void loop() {
 for(int i=0;i<100;i++)
 {
  val=val+analogRead(pin);
  delay(1);
  } 
  val=val/100.0;
  Serial.println(val);
  delay(100);

}
