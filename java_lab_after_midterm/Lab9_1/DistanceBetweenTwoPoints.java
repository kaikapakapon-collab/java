import java.util.Scanner;

public class PointDistance {
  // method สำหรับคำนวณระยะทาง
  public static double distance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("x1: ");
    double x1 = input.nextDouble();
    System.out.print("y1: ");
    double y1 = input.nextDouble();
    System.out.print("x2: ");
    double x2 = input.nextDouble();
    System.out.print("y2: ");
    double y2 = input.nextDouble();

    double d = distance(x1, y1, x2, y2);
    System.out.printf("Distance = %.4f\n", d);

    input.close();
  }
}