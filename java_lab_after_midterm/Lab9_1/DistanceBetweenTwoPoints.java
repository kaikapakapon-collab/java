package Lab9_1;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point1 coords");// รับค่าพิกัดของจุดที่ 1
        System.out.print("x1: "); // รับค่า x1
        double x1 = sc.nextDouble(); // รับค่า x1
        System.out.print("y1: ");// รับค่า y1
        double y1 = sc.nextDouble();// รับค่า y1
        System.out.println("Enter point2 coords");// รับค่าพิกัดของจุดที่ 2
        System.out.print("x2: ");// รับค่า x2
        double x2 = sc.nextDouble();// รับค่า x2
        System.out.print("y2: ");// รับค่า y2
        double y2 = sc.nextDouble();// รับค่า y2

        System.out.println("The distance between point1 and point2 is " + distance(x1, x2, y1, y2)); // แสดงผลลัพธ์ระยะห่างระหว่างจุดที่ 1 และ จุดที่ 2
    }

    public static double distance(double x1, double x2, double y1, double y2){ // ฟังก์ชันคำนวณระยะห่างระหว่างจุดที่ 1 และ จุดที่ 2
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2)); // ใช้สูตรระยะห่างระหว่างจุดสองจุด
    }
}