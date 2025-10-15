package Lab8_2;
public class MultiplicationTable {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println(" Multiplication Table");
        // Display the number title
        System.out.print("    ");
        for (int j = 9; j >= 1; j--) // เพื่อแสดงหมายเลขคอลัมน์ j คือด้านกว้าง
            System.out.printf("%4d", j); 
        System.out.println("\n-----------------------------------------");
        // Print table body
        for (int i = 9; i >= 1; i--) { // เพื่อแสดงหมายเลขแถว i คือด้านสูง
            System.out.print(i + " | ");
            for (int j = 9; j >= 1; j--) { // คูณ i กับ j
                // Display the product and align properly
                System.out.printf("%4d", i * j); // แสดงผลคูณและจัดตำแหน่งให้เหมาะสม
            }
            System.out.println();
        }
    }
}