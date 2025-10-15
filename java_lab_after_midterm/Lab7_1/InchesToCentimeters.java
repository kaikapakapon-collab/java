package Lab7_1;
public class InchesToCentimeters {
    public static void main (String[] args) {
        int i = 1;
        System.out.println("Inches       Centimeters");
        while (i < 200) { // ทำจนกว่า i จะเท่ากับ 200
            System.err.println(i + "            " + (i * 2.54)); // แปลงนิ้วเป็นเซนติเมตร
            i += 2; // เพิ่มค่า i ขึ้นทีละ 2
        }
}
}
