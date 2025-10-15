import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่า year และ day
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int startDay = input.nextInt();

        // ชื่อเดือน
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // จำนวนวันแต่ละเดือน
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // ตรวจสอบ leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29; // กุมภาพันธ์
        }

        // วนลูปพิมพ์ทั้งปี
        for (int month = 0; month < 12; month++) {
            // Header
            System.out.printf("\n     %s %d\n", months[month], year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            // เว้นช่องก่อนวันแรก
            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            // พิมพ์วัน
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%4d", day);

                // ถ้าวันนี้เป็น Saturday → ขึ้นบรรทัดใหม่
                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // คำนวณวันแรกของเดือนถัดไป
            startDay = (startDay + daysInMonth[month]) % 7;
            System.out.println("\n");
        }
    }
}