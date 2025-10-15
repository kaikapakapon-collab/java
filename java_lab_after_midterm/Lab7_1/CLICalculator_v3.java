package Lab7_1;
import java.util.Scanner;

public class CLICalculator_v3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //สร้างตัวอ่านคีบอร์ด
        System.out.println("Welcome to CLI Calculator v3. We use switch-case & while loop this time");
        boolean exitFlag = true; //ใช้ flex คุม loop ของโปรแกรม
        while (exitFlag) { // loop เมื่อ flex เป็นจริง
            System.out.println("Select the operator (1-4)");
            System.out.println("1. Plus (+)");
            System.out.println("2. Minus (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            int operatorOption = input.nextInt();
            if(operatorOption == 5) { //ถ้าเลือก 5 ให้จบโปรแกรม
                System.out.println("Exiting...");
                exitFlag = false; //เปลี่ยน flex เป็นเท็จเพื่อออกจาก loop
            } else { //ถ้าไม่ใช่ 5 ให้ทำการคำนวณ
                System.out.print("Enter the first number: ");
                double firstNumber = input.nextDouble();
                System.out.print("Enter the second number: ");
                double secondNumber = input.nextDouble();
            
                switch (operatorOption) { //เลือกการคำนวณตามที่ผู้ใช้เลือก
                    case 1:
                        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                        break;
                    case 2:
                        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                        break;
                    case 3:
                        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                        break;
                    case 4:
                        if(secondNumber == 0){ //เช็คการหารด้วยศูนย์
                            System.out.println("Error: Cannot divide by zero.");
                        }else{ //ถ้าไม่ใช่ศูนย์ให้ทำการหาร
                            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                        }
                        break;
                    default: //ถ้าไม่ใช่ 1-5 ให้แจ้งว่าผิดพลาด
                        System.out.println("Invalid operator");
                        break;
                }
            }
        }
    }
}