package lesson_25;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println("static counter: " + StatikBlokDemo.counter);
        System.out.println("static array: " + Arrays.toString(StatikBlokDemo.colors));

        StatikBlokDemo demo = new StatikBlokDemo();

        StatikBlokDemo demo2 = new StatikBlokDemo();
        StatikBlokDemo demo3 = new StatikBlokDemo("Title");

    }
}

