package homework_14;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = b < a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a ravno b: " + isEqual);
        System.out.println("a ne ravno b: " + isNotEqual);
        System.out.println("a bolshe b: " + isGreater);
        System.out.println("b menshe a: " + isLess);
    }
}
