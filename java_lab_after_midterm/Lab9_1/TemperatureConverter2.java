package Lab9_1;
import java.util.Scanner;

public class TemperatureConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char conversionMode;
        do { // ทำจนกว่าจะเลือกโหมด 'e' เพื่อออกจากโปรแกรม
            conversionMode = promptUserInput(input); // รับโหมดการแปลงจากผู้ใช้
            if (conversionMode == 'c') { // ถ้าเลือกโหมด 'c' ให้แปลงจากฟาเรนไฮต์เป็นเซลเซียส
                System.out.print("Enter temperature in Fahrenheit: "); // รับค่าอุณหภูมิเป็นฟาเรนไฮต์
                double tempInF = input.nextDouble(); // รับค่าอุณหภูมิเป็นฟาเรนไฮต์
                System.out.println("Temperature in Celsius = " + FTOC(tempInF)); // แสดงผลลัพธ์อุณหภูมิเป็นเซลเซียส
            } else if (conversionMode == 'f') { // ถ้าเลือกโหมด 'f' ให้แปลงจากเซลเซียสเป็นฟาเรนไฮต์
                System.out.print("Enter temperature in Celsius: "); // รับค่าอุณหภูมิเป็นเซลเซียส
                double tempInC = input.nextDouble(); // รับค่าอุณหภูมิเป็นเซลเซียส
                System.out.println("Temperature in Fahrenheit = " + CTOF(tempInC)); // แสดงผลลัพธ์อุณหภูมิเป็นฟาเรนไฮต์
            } else if (conversionMode != 'e') { // ถ้าไม่ใช่ 'c', 'f', หรือ 'e' ให้แสดงข้อความว่าโหมดไม่ถูกต้อง
                System.out.println("Invalid mode"); // แสดงข้อความว่าโหมดไม่ถูกต้อง
            }
        } while (conversionMode != 'e'); // ทำจนกว่าจะเลือกโหมด 'e' เพื่อออกจากโปรแกรม
        System.out.println("Exit the program..."); // แสดงข้อความว่าออกจากโปรแกรม
    }
 
    public static char promptUserInput(Scanner input) { // ฟังก์ชันรับโหมดการแปลงจากผู้ใช้
        System.out.print("Select conversion mode (C for Celsius to Fahrenheit, F for Fahrenheit to Celsius): "); // แสดงข้อความให้ผู้ใช้เลือกโหมดการแปลง
        String mode = input.next(); // รับค่าโหมดการแปลงจากผู้ใช้

        return mode.toLowerCase().charAt(0); // แปลงเป็นตัวพิมพ์เล็กและคืนค่าตัวอักษรตัวแรก
    }

    public static double FTOC(double tf) { // ฟังก์ชันแปลงจากฟาเรนไฮต์เป็นเซลเซียส
        return (tf - 32) * (5.0 / 9);
    }
    public static double CTOF(double tc) { // ฟังก์ชันแปลงจากเซลเซียสเป็นฟาเรนไฮต์
        return (tc * (9.0 / 5)) + 32;
    }
}