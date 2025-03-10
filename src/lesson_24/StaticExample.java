package lesson_24;

public class StaticExample {
    int x;

    static int staticY;

    public static void staticMethod() {
        staticY++;
        System.out.println("Вызван статический метод: " + staticY);
    }
    public void nonStaticMethod() {
        x++;
        staticY++;
        staticMethod();
    }

    public static void main(String[] args) {

        staticY = 10;
        System.out.println(staticY);

        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();

        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 5, 6, 7, 8, 9);
        System.out.println("Сумма чисел: " + sum);

    }
}

