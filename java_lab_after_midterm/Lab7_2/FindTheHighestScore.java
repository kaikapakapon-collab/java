package Lab7_2;
import java.util.Scanner;

public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentNum = sc.nextInt();

        String highestScoreStudent = "Tie"; 
        int highestScore = 0;

        while (studentNum > 0) { // ทำจนกว่าจะกรอกครบทุกคน
            System.out.println("Enter student name: ");
            String studentName = sc.next(); 
            
            System.out.print("Enter student score: ");
            int studentScore = sc.nextInt();
            if(studentScore > highestScore) {// ถ้าคะแนนคนนี้มากกว่าคะแนนสูงสุดที่มีอยู่ 
                highestScore = studentScore;// อัปเดตคะแนนสูงสุด
                highestScoreStudent = studentName;// อัปเดตชื่อนักเรียนที่ได้คะแนนสูงสุด
            }
            studentNum--;// ลดจำนวนคนที่ต้องกรอกลง 1
        }

        System.out.println("Highest score: " + highestScoreStudent + " ("+ highestScore +")");// แสดงชื่อนักเรียนที่ได้คะแนนสูงสุดและคะแนน
    }
}