package Lab9_2;
import java.util.Scanner;

public class GradeCalculator { 
    public static String getLetterGrade(int score){ // ฟังก์ชันแปลงคะแนนเป็นเกรดตัวอักษร
        return score <= 100 && score >= 90 ? "A" : // ใช้เงื่อนไขแบบ ternary operator ในการตรวจสอบช่วงคะแนน และคืนค่าเกรดตัวอักษรที่ตรงกัน ถ้า
            score < 90 && score >= 80 ? "B" : // คะแนนอยู่ในช่วง 90-100 คืนค่า "A"
            score < 80 && score >= 70 ? "C" : // คะแนนอยู่ในช่วง 80-89 คืนค่า "B"
            score < 70 && score >= 60 ? "D" :  // คะแนนอยู่ในช่วง 70-79 คืนค่า "C"
            score < 60 && score >= 0 ? "F" : "Invalid Score"; // คะแนนอยู่ในช่วง 60-69 คืนค่า "D"    
            // คะแนนน้อยกว่า 60 คืนค่า "F"
    }
    public static double getGpa(int score){ // ฟังก์ชันแปลงคะแนนเป็นเกรดจุดทศนิยม
        if(score <= 100 && score >= 90) return 4.0; // ถ้าคะแนนอยู่ในช่วง 90-100 คืนค่า 4.0
        else if (score < 90 && score >= 80) return 3.0; // ถ้าคะแนนอยู่ในช่วง 80-89 คืนค่า 3.0
        else if (score < 80 && score >= 70) return 2.0; // ถ้าคะแนนอยู่ในช่วง 70-79 คืนค่า 2.0
        else if (score < 70 && score >= 60) return 1.0; // ถ้าคะแนนอยู่ในช่วง 60-69 คืนค่า 1.0
        else if (score < 60 && score >= 0) return 0.0; // ถ้าคะแนนน้อยกว่า 60 คืนค่า 0.0
        else return -1.0; // ถ้าคะแนนไม่อยู่ในช่วง 0-100 คืนค่า -1.0 (คะแนนไม่ถูกต้อง)
    } 
    public static void main(String[] args) { 
        String stopFlag = "yes";
        int totalCredits = 0;
        double finalGpa = 0;
        Scanner sc = new Scanner(System.in);

        while(stopFlag.equals("yes")){ // ทำจนกว่าจะตอบ no
            System.out.print("Enter the subject name: "); 
            String subjectName = sc.next();
            System.out.print("Enter subject credits: ");
            int subjectCredits = sc.nextInt();
            System.out.print("Enter the numerical score: ");
            int subjectScore = sc.nextInt();
    
            System.out.println();
            System.out.println("Grade: " + getLetterGrade(subjectScore) + " | GPA: " + getGpa(subjectScore)); // แสดงเกรดตัวอักษรและเกรดจุดทศนิยม
            totalCredits += subjectCredits; // รวมหน่วยกิต
            finalGpa += getGpa(subjectScore) * subjectCredits; // รวมเกรดจุดทศนิยมคูณด้วยหน่วยกิต
            System.out.print("Add another subject? (yes/no): "); 
            stopFlag = sc.next(); // รับคำตอบว่าจะเพิ่มวิชาอีกหรือไม่
            System.out.println(); 
        }

        System.out.println("-----------------------------------"); 
        System.out.println("Calculating final GPA..."); 
        System.out.println("Total Credits: " + totalCredits); 
        System.out.println("Your final GPA is: " + finalGpa/totalCredits); 
    }
}