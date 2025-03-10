package lesson_25;

public class StatikBlokDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    {
        System.out.println("NON-static block RUN!");
        if (counter == 0) {
            this.capacity = 50;
        }
        title = "Default";
    }

    public StatikBlokDemo() {
        System.out.println("Constructor RUN!");


    }

    public StatikBlokDemo(String title) {
        System.out.println("Constructor 2 RUN!");


        this.title = title;
    }

    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter: %d",
                title, capacity, counter);
    }
}

