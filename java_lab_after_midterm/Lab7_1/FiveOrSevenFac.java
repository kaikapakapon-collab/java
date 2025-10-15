package Lab7_1;
import java.util.Scanner;
public class FiveOrSevenFac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int uinputNum = sc.nextInt();
        int start = 0;
        int order = 1;
        while (start - uinputNum != 1) { // ทำจนกว่า start จะเท่ากับ uinputNum + 1
            if (start % 5 == 0 ^ start % 7 == 0){ // ถ้า start หาร 5 หรือ 7 ลงตัว (แต่ไม่ใช่ทั้งสองอย่าง)
                if(order % 10 == 0) System.out.println(start + " "); // ถ้าเป็นตัวที่ 10 ให้ขึ้นบรรทัดใหม่
                else System.out.print(start + " "); // ถ้าไม่ใช่ตัวที่ 10 ให้พิมพ์ต่อ
                order++; // เพิ่มลำดับขึ้น 1
            }
            start++; // เพิ่มค่า start ขึ้น 1
        }
    }
}