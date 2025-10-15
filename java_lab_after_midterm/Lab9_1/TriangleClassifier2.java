import java.util.Scanner;

public class TriangleClassifier {
  // method ตรวจสอบ + จำแนกสามเหลี่ยม
  public static String classifyTriangle(double a, double b, double c) {
    // ตรวจสอบ Triangle Inequality
    boolean valid = (a + b > c) && (a + c > b) && (b + c > a);
    if (!valid) return "Invalid";

    // จำแนกประเภท
    if (a == b && b == c) return "Equilateral";
    else if (a == b || a == c || b == c) return "Isosceles";
    else return "Scalene";
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length of side 1: ");
    double a = input.nextDouble();
    System.out.print("Enter length of side 2: ");
    double b = input.nextDouble();
    System.out.print("Enter length of side 3: ");
    double c = input.nextDouble();

    String type = classifyTriangle(a, b, c);
    if (type.equals("Invalid")) {
      System.out.println("These sides cannot form a valid triangle");
    } else {
      System.out.println("The sides form a " + type + " triangle.");
    }

    input.close();
  }
}