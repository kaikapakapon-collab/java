package Lab10_1;

public class PerfectNumber {
    public static Boolean isPerfect(int number) { // ฟังก์ชันตรวจสอบว่าเป็นเลขสมบูรณ์หรือไม่
        int divisorSum = 0; // ตัวแปรเก็บผลรวมของตัวประกอบ
        for(int i = 1; i<number; i++) // วนลูปหาตัวประกอบ
            if(number%i == 0) divisorSum += i; // ถ้า i เป็นตัวประกอบของ number ให้บวกกับ divisorSum
        return divisorSum == number; // ถ้าผลรวมของตัวประกอบเท่ากับ number แสดงว่าเป็นเลขสมบูรณ์
    }
    public static void main(String[] args) {
        for(int i = 1; i<=10000; i++) if(isPerfect(i)) System.out.println(i + " is a perfect number"); // วนลูปหาตัวเลขสมบูรณ์ตั้งแต่ 1 ถึง 10000
    }
}