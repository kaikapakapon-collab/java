import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter first day of the year (1=Sun, 2=Mon,...,7=Sat): ");
        int startDay = sc.nextInt();

        for (int month = 1; month <= 12; month++) {
            int days = getDaysInMonth(month, year);
            printMonthHeader(month, year);
            printMonthDays(days, startDay);
            startDay = (startDay + days) % 7;
            if (startDay == 0) startDay = 7; // wrap around to Saturday
        }
    }

    // 🗓️ คืนจำนวนวันในเดือนนั้น
    static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2: return (isLeapYear(year) ? 29 : 28);
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    // 📆 ตรวจปีอธิกสุรทิน
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // 🖨️ พิมพ์ชื่อเดือน
    static void printMonthHeader(int month, int year) {
        String[] names = {"", "January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        System.out.println("\n---------------------------------");
        System.out.println(names[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // 🔢 แสดงวันที่ในแต่ละเดือน
    static void printMonthDays(int days, int startDay) {
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%4d", d);
            if ((d + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println("\n");
    }
}