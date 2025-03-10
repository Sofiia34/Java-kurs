package lesson_25;

public class ConstantDemo {
    public static final double PI = 3.141519;
    public static final String MY_COUNTRY = "Germany";

    public static final String[] colors = {"blue", "red", "green"};

    public static final int[] ints = new int[5];

    public ConstantDemo() {
        colors[0] = "purple";

        String newString = MY_COUNTRY.toUpperCase();
    }

    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }

}

