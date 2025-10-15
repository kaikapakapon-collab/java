package Lab9_2;
import java.util.Scanner;

public class ShapeDrawer {
    public static void drawRectangle(int width, int height, char symbol){ // ฟังก์ชันวาดรูปสี่เหลี่ยมผืนผ้า
        for(int h = 0; h<height; h++){ // วนลูปตามความสูง
            for(int w = 0; w<width; w++) System.out.print(symbol); // วนลูปตามความกว้างแล้วพิมพ์สัญลักษณ์
            System.out.println();
        }
    }
    public static void main(String[] args) { // ฟังก์ชันหลัก
        Scanner sc = new Scanner(System.in); // สร้าง Scanner object
        System.out.print("Enter a width: "); 
        int width = sc.nextInt();
        System.out.print("Enter a height: ");
        int height = sc.nextInt();
        System.out.print("Enter a symbol: ");
        char symbol = sc.next().charAt(0);
        System.out.println();

        drawRectangle(width, height, symbol); // เรียกใช้ฟังก์ชันวาดรูปสี่เหลี่ยมผืนผ้า
    }
}