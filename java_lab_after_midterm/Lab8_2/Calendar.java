package Lab8_2;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of year: ");
        int year = sc.nextInt();
        System.out.print("Enter the day of the first day in the year (e.g. 2 for Tuesday): ");
        int firstDayOfTheYear = sc.nextInt(); // 1 for Sunday, 2 for Monday, ..., 7 for Saturday
        for(int m = 1; m<=12; m++){ // วนลูปตั้งแต่เดือนที่ 1 ถึง 12
            int daysOfTheMonth = 0; // ตัวแปรเก็บจำนวนวันในเดือน
            switch (m) { // กำหนดจำนวนวันในแต่ละเดือน
                case 1: System.out.println("                      January " + year); daysOfTheMonth = 31; break; // เดือนมกราคมมี 31 วัน
                case 2: // เดือนกุมภาพันธ์
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) daysOfTheMonth = 29;
                    else daysOfTheMonth = 28;
                    System.out.println("                      February " + year);
                    break;
                case 3: System.out.println("                      March " + year); daysOfTheMonth = 31; break; // เดือนมีนาคมมี 31 วัน
                case 4: System.out.println("                      April " + year); daysOfTheMonth = 30; break; // เดือนเมษายนมี 30 วัน
                case 5: System.out.println("                      May " + year); daysOfTheMonth = 31; break; // เดือนพฤษภาคมมี 31 วัน
                case 6: System.out.println("                      June " + year); daysOfTheMonth = 30; break; // เดือนมิถุนายนมี 30 วัน
                case 7: System.out.println("                      July " + year); daysOfTheMonth = 31; break; // เดือนกรกฎาคมมี 31 วัน
                case 8: System.out.println("                      August " + year); daysOfTheMonth = 31; break; // เดือนสิงหาคมมี 31 วัน
                case 9: System.out.println("                      September " + year); daysOfTheMonth = 30; break; // เดือนกันยายนมี 30 วัน
                case 10: System.out.println("                     October " + year); daysOfTheMonth = 31; break; // เดือนตุลาคมมี 31 วัน
                case 11: System.out.println("                     November " + year); daysOfTheMonth = 30; break; // เดือนพฤศจิกายนมี 30 วัน
                case 12: System.out.println("                     December " + year); daysOfTheMonth = 31; break; // เดือนธันวาคมมี 31 วัน
            }
            System.out.println("------------------------------------------------------"); // เส้นคั่นหัวปฏิทิน
            System.out.println(" Sun     Mon    Tue      Wed     Thu     Fri     Sat "); // หัวปฏิทิน
            if(firstDayOfTheYear<7) // ถ้าวันแรกของปีไม่ใช่วันเสาร์
                for(int indentation = 0; indentation<firstDayOfTheYear; indentation++) System.out.print("        "); // เว้นวรรคตามจำนวนวันก่อนวันแรกของเดือน
            for(int d = 0, bc = firstDayOfTheYear; d<daysOfTheMonth; d++, bc++){ // วนลูปตั้งแต่วันที่ 1 ถึงวันสุดท้ายของเดือน
                if(bc%7==0 && d!=0) System.out.printf("\n %2d     ", d+1); // ถ้าวันนี้เป็นวันเสาร์และไม่ใช่วันแรกของเดือน ให้ขึ้นบรรทัดใหม่แล้วแสดงวันที่
                else System.out.printf(" %2d     ", d+1); // แสดงวันที่

                if(daysOfTheMonth-d == 1) firstDayOfTheYear = bc%7 + 1; // ถ้าวันนี้เป็นวันสุดท้ายของเดือน ให้กำหนดวันแรกของเดือนถัดไป
            }
            System.out.println(); // ขึ้นบรรทัดใหม่หลังแสดงปฏิทินของเดือนนี้เสร็จ
        }
    }
}