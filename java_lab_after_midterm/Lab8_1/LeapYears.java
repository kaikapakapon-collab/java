package Lab8_1;
public class LeapYears {
    public static void main(String[] args) {
        int count = 0; // ตัวแปรนับจำนวนปีอธิกสุรทิน
        for (int year = 101; year <= 2100; year++) { // วนลูปตั้งแต่ปี 101 ถึง 2100
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // ตรวจสอบเงื่อนไขปีอธิกสุรทิน
                if (count % 10 == 0) System.out.println(year); // ถ้าเป็นปีที่ 10 ให้ขึ้นบรรทัดใหม่
                else System.out.print(year + " "); // ถ้าไม่ใช่ปีที่ 10 ให้พิมพ์ต่อ
                count++;
            }
        }
        System.out.println("\nThere are " + count + " leap years between 101 and 2100."); // แสดงจำนวนปีอธิกสุรทินทั้งหมด
    }
}