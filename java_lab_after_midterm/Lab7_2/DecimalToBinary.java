package Lab7_2;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number (base10): ");
        int num = sc.nextInt();
        String binaryNum = ""; // ตัวแปรเก็บผลลัพธ์ฐานสอง
        do { // ทำจนกว่า num จะเท่ากับ 0
            binaryNum = (num % 2) + binaryNum; // เอาเศษที่ได้มาเติมหน้าตัวแปรผลลัพธ์
            num /= 2; // หาร num ด้วย 2
        } while (num != 0); // ทำจนกว่า num จะเท่ากับ 0
        System.out.println(binaryNum); // แสดงผลลัพธ์
    }
}