package Lab7_1;
public class WhileLoopExample {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 100) { // ทำจนกว่า i จะเท่ากับ 100
            if(i % 10 == 0) System.out.println(i + " "); // ถ้า i เป็นตัวที่ 10 ให้ขึ้นบรรทัดใหม่
            else System.out.print(i + " "); // ถ้าไม่ใช่ตัวที่ 10 ให้พิมพ์ต่อ
            i++; // เพิ่มค่า i ขึ้น 1
        }
    }
}