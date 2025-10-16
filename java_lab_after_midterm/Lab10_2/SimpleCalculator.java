class BasicCalculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
    double add(double a, double b, double c) { return a + b + c; }
}

public class TestBasicCalculator {
    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        System.out.println("Adding two ints (10 + 20): " + bc.add(10, 20));
        System.out.println("Adding three ints (10 + 20 + 30): " + bc.add(10, 20, 30));
        System.out.println("Adding two doubles (5.5 + 4.5): " + bc.add(5.5, 4.5));
        System.out.println("Adding three doubles (1.2 + 2.3 + 3.4): " + bc.add(1.2, 2.3, 3.4));
    }
}