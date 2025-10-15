package Lab8_1;
public class SumNumber {
    public static void main(String[] args) {
        int sum = 0;
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 1; i <= 100; i++) { // วนลูปตั้งแต่ 1 ถึง 100
            if(i%2 == 0) sumOfEven += i; // ถ้าเป็นเลขคู่ให้บวกกับ sumOfEven
            else sumOfOdd += i; // ถ้าเป็นเลขคี่ให้บวกกับ sumOfOdd
            sum += i; // บวกกับ sum ทุกครั้งที่วนลูป
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum); // แสดงผลลัพธ์
        System.out.println("The sum of odd numbers from 1 to 100 is: " + sumOfOdd); // แสดงผลลัพธ์
        System.out.println("The sum of even numbers from 1 to 100 is: " + sumOfEven);
    } 
}