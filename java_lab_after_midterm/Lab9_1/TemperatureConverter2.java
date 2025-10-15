import java.util.Scanner;

public class TempConverter {
  public static double toCelsius(double f) { return (f - 32) * 5.0 / 9.0; }
  public static double toFahrenheit(double c) { return c * 9.0 / 5.0 + 32; }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("เลือก (c=F→C, f=C→F, q=ออก): ");
      String opt = input.next().toLowerCase();

      if (opt.equals("q")) {   // ✅ แก้ syntax
        break;
      } else if (opt.equals("c")) {
        System.out.print("F: "); 
        System.out.println("C = " + toCelsius(input.nextDouble()));
      } else if (opt.equals("f")) {
        System.out.print("C: "); 
        System.out.println("F = " + toFahrenheit(input.nextDouble()));
      } else {
        System.out.println("กรุณาใส่ c/f/q");
      }
    }
    input.close();
  }
}