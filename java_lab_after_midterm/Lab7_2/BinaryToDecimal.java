package Lab7_2;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNum = sc.nextLine(); // รับค่าตัวเลขฐานสองเป็นสตริง
        int nthDigit = binaryNum.length() - 1; // ตำแหน่งหลักสุดท้าย
        int nthPow = 0; // ยกกำลังเริ่มต้นที่ 0
        int decimalNumber = 0; // ตัวแปรเก็บผลลัพธ์ฐานสิบ

        while(nthDigit >= 0) { // ทำจนกว่าจะครบทุกหลัก
            decimalNumber += (binaryNum.charAt(nthDigit) - '0') * Math.pow(2, nthPow); // แปลง char เป็น int แล้วคูณด้วย 2 ยกกำลังตำแหน่ง
            nthPow++; // เพิ่มตำแหน่งยกกำลังขึ้น 1
            nthDigit--; // ลดตำแหน่งหลักลง 1
        }

        System.out.println(decimalNumber); // แสดงผลลัพธ์
    }
}