package Lab10_1;

import java.util.Scanner;

public class AreaCalculator {
    public static double calculateArea(int side){ return side*side; } // ฟังก์ชันคำนวณพื้นที่สี่เหลี่ยมจัตุรัส
    public static double calculateArea(double length, double width){ return length*width; } // ฟังก์ชันคำนวณพื้นที่สี่เหลี่ยมผืนผ้า
    public static double calculateArea(double radius){ return Math.PI*radius*radius; } // ฟังก์ชันคำนวณพื้นที่วงกลม
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select: ");
        System.out.println("1) Area of square");
        System.out.println("2) Area of rectangle");
        System.out.println("3) Area of circle");
        System.out.print("Your choice: ");
        int choice = sc.nextInt(); // รับค่าตัวเลือก
        switch (choice) { // ตรวจสอบตัวเลือก
            case 1: // สี่เหลี่ยมจัตุรัส
                System.out.print("Enter side of the square: ");
                int side = sc.nextInt();
                System.out.println("Area of square with side " + side + ": " + calculateArea(side));
                break;
            case 2: // สี่เหลี่ยมผืนผ้า
                System.out.print("Enter width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + calculateArea(length, width));
                break;
            case 3: // วงกลม
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of circle with radius " + radius + ": " + calculateArea(radius));
                break;
            default:
                break;
        }
        // System.out.println("Area of square with side 5: " + calculateArea(5));
        // System.out.println("Area of rectangle with length 4.0 and width 6.0: " + calculateArea(4.0, 6.0));
        // System.out.println("Area of circle with radius 3.0: " + calculateArea(3.0));
    }
}