public class TestMax4 {
  public static void main(String[] args) {
    int i = 5, j = 2, x = 9, y = 7;
    int max2 = max(i, j);
    max2 = max(max2, x);
    max2 = max(max2, y);
    System.out.println("Max of " + i + ", " + j + ", " + x + ", " + y + " = " + max2);
  }
  public static int max(int a, int b) {
    return (a > b) ? a : b;
  }
}