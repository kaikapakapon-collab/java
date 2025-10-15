package Lab8_2;
public class PascalPyramid {
    public static void main(String[] args) {
        for(int row = 0, indentation = 8; row<8 && indentation>0; row++, indentation--){ // วนลูปตั้งแต่แถวที่ 0 ถึง 7
            for(int ind = 0; ind<indentation-1; ind++) System.out.print("    "); // จัดช่องว่างด้านซ้าย
            for(int ini = 0, end = row*2; ini<(row*2)+1; ini++,end--){ // วนลูปตั้งแต่ ini = 0 ถึง ini = row*2
                if(ini>end) System.out.printf("%4d", (int) Math.pow(2, end)); // ถ้า ini มากกว่า end ให้แสดง 2 ยกกำลัง end
                else System.out.printf("%4d", (int) Math.pow(2, ini)); // ถ้าไม่ใช่ให้แสดง 2 ยกกำลัง ini
            }
            System.out.println();
        }
    }
}