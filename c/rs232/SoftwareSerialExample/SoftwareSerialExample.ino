/*
  Software serial multple serial test

 Receives from the hardware serial, sends to software serial.
 Receives from software serial, sends to hardware serial.

 The circuit:
 * RX is digital pin 10 (connect to TX of other device)
 * TX is digital pin 11 (connect to RX of other device)

 Note:
 Not all pins on the Mega and Mega 2560 support change interrupts,
 so only the following can be used for RX:
 10, 11, 12, 13, 50, 51, 52, 53, 62, 63, 64, 65, 66, 67, 68, 69

 Not all pins on the Leonardo and Micro support change interrupts,
 so only the following can be used for RX:
 8, 9, 10, 11, 14 (MISO), 15 (SCK), 16 (MOSI).

 created back in the mists of time
 modified 25 May 2012
 by Tom Igoe
 based on Mikal Hart's example

 This example code is in the public domain.

 */
#include <DHT.h>
#include <SoftwareSerial.h>
#include <Servo.h>

#define SERVO_PIN 2
#define DHT_PIN 3
#define DHTTYPE DHT22

SoftwareSerial mySerial(10, 11); // RX, TX
String usbIn = "";
String rs232In = "";

Servo myServo;
DHT dht(DHT_PIN, DHTTYPE);

void setup() {
    // Open serial communications and wait for port to open:
    Serial.begin(115200);
    while (!Serial) {
        ; // wait for serial port to connect. Needed for native USB port only
    }
    Serial.println("This is usb serial.");
    Serial.println("Feature:\n    servo [pos] : Set servo degree.\n    temperature : See current temperature.\n    humidity : See current humidity.");
    
    // set the data rate for the SoftwareSerial port
    mySerial.begin(115200);
    while (!mySerial) {
        ; // wait for serial port to connect. Needed for native USB port only
    }
    mySerial.println("This is RS232 serial.");
    mySerial.println("Feature:\n    servo [pos] : Set servo degree.\n    temperature : See current temperature.\n    humidity : See current humidity.");

    dht.begin();
    myServo.attach(SERVO_PIN);
    myServo.write(0);
}

void loop() { // run over and over
    // rs232 in.
    if (mySerial.available()) {
        char c = mySerial.read();
        mySerial.write(c);
        rs232In += c;
        if (c == '\r') {  // 'enter' char
            Serial.print(rs232In);
            process_string(rs232In);
            rs232In = "";
        }
    }
    
    // usb in.
    if (Serial.available()) {
        char c = Serial.read();
        Serial.write(c);
        usbIn += c;
        if (c == '\r') {  // 'enter' char
            mySerial.print(usbIn);
            process_string(usbIn);
            usbIn = "";
        }
    }
}

void process_string(String str) {
    str.trim();
    str.toLowerCase();
    if (str.startsWith("servo")) {
        str = str.substring(5);
        str.trim();
        int pos = str.toInt();
        set_servo(pos);
    } else if (str.startsWith("temperature")) {
        float temp = dht.readTemperature();
        Serial.println(temp);
        mySerial.println(temp);
    } else if (str.startsWith("humidity")) {
        float hum = dht.readHumidity();
        Serial.println(hum);
        mySerial.println(hum);
    }
}

void set_servo(int pos) {
    myServo.write(pos);
}
