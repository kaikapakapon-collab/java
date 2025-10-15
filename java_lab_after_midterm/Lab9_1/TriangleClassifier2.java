package Lab9_1;
import java.util.Scanner;

public class TriangleClassifier2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter length of side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter length of side 3: ");
        double side3 = input.nextDouble();

        int triangleType = classifyTriangle(side1, side2, side3); // เรียกใช้ฟังก์ชัน classifyTriangle เพื่อหาประเภทของสามเหลี่ยม

        switch (triangleType) { // ตรวจสอบประเภทของสามเหลี่ยม
            case 0: // กรณีที่เป็นสามเหลี่ยมด้านเท่า
                System.out.println("The sides form a Equilateral triangle.");
                break;
            case 1: // กรณีที่เป็นสามเหลี่ยมสองด้านเท่า
                System.out.println("The sides form a Isosceles triangle.");
                break;
            case 2: // กรณีที่เป็นสามเหลี่ยมด้านไม่เท่า
                System.out.println("The sides form a Scalene triangle.");
                break;
            default: // กรณีที่ไม่สามารถสร้างสามเหลี่ยมได้
                System.out.println("These sides cannot form a valid triangle");
                break;
        }
    }

    public static int classifyTriangle(double a, double b, double c) { // ฟังก์ชันสำหรับหาประเภทของสามเหลี่ยม
        int type; // ตัวแปรเก็บประเภทของสามเหลี่ยม
        if(a + b > c){ // ตรวจสอบเงื่อนไขการสร้างสามเหลี่ยม
            if(a + c > b){ // ตรวจสอบเงื่อนไขการสร้างสามเหลี่ยม
                if(b + c > a){ // ตรวจสอบเงื่อนไขการสร้างสามเหลี่ยม
                    if(a == b){ // ตรวจสอบว่าด้าน a เท่ากับด้าน b หรือไม่
                        if(a == c){ // ตรวจสอบว่าด้าน a เท่ากับด้าน c หรือไม่
                            type = 0; // ถ้าใช่ เป็นสามเหลี่ยมด้านเท่า
                        } else { // ถ้าไม่ใช่
                            type = 1; // เป็นสามเหลี่ยมสองด้านเท่า
                        }
                    } else if (b == c) { // ตรวจสอบว่าด้าน b เท่ากับด้าน c หรือไม่
                        type = 1; // ถ้าใช่ เป็นสามเหลี่ยมสองด้านเท่า
                    } else if (c == a) { // ตรวจสอบว่าด้าน c เท่ากับด้าน a หรือไม่
                        type = 1; // ถ้าใช่ เป็นสามเหลี่ยมสองด้านเท่า
                    } else {
                        type = 2; // ถ้าไม่ใช่ทั้งสามกรณี เป็นสามเหลี่ยมด้านไม่เท่า
                    }
                } else {    
                    type = -1; // ถ้าไม่สามารถสร้างสามเหลี่ยมได้
                }
            } else {
                type = -1; // ถ้าไม่สามารถสร้างสามเหลี่ยมได้
            }
        } else {
            type = -1; // ถ้าไม่สามารถสร้างสามเหลี่ยมได้
        }
        return type; // คืนค่าประเภทของสามเหลี่ยม
    }
}