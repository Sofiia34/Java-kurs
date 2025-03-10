package homework_25;

public class Calculator25 {
    public static final double PI = 3.141519;

    public static double circleArea(double radius) {
        // Pi * r ^ 2
        return PI * radius * radius;
    }

    public static double circlePerimeter(double radius) {
        // 2 * PI * r == PI * d
        return 2 * PI * radius;
    }


    public static int add(int i1, int i2) {

        return i1 + i2;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) return Integer.MAX_VALUE;
        return a / b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }



}

