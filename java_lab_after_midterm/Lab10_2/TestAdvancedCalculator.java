class AdvancedCalculator {
    // add
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    double add(int a, double b) { return a + b; }

    // subtract
    int subtract(int a, int b) { return a - b; }
    double subtract(double a, double b) { return a - b; }
    double subtract(int a, double b) { return a - b; }

    // multiply
    int multiply(int a, int b) { return a * b; }
    double multiply(double a, double b) { return a * b; }
    double multiply(int a, double b) { return a * b; }

    // divide
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return (double) a / b;
    }
    double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return a / b;
    }
    double divide(int a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return a / b;
    }

    // power
    double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class TestAdvancedCalculator {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.5));
        System.out.println("Add int/double: " + calc.add(2, 3.5));

        System.out.println("Subtract int: " + calc.subtract(5, 2));
        System.out.println("Subtract double: " + calc.subtract(5.5, 2.2));
        System.out.println("Subtract int/double: " + calc.subtract(5, 2.2));

        System.out.println("Multiply int: " + calc.multiply(3, 4));
        System.out.println("Multiply double: " + calc.multiply(3.5, 4.5));
        System.out.println("Multiply int/double: " + calc.multiply(3, 4.5));

        System.out.println("Divide int: " + calc.divide(10, 4));
        System.out.println("Divide double: " + calc.divide(10.0, 4.0));
        System.out.println("Divide int/double: " + calc.divide(10, 4.0));
        System.out.println("Divide by zero: " + calc.divide(10, 0));

        System.out.println("Power: " + calc.power(2.0, 3));
    }
}