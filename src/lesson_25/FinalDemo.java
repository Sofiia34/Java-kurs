package lesson_25;

public class FinalDemo {
    private final int capacity;

    private final int[] ints = new int[5];

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;


        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }

    public void finalArguments(final int x, final int[] array) {

        array[0] = x;
        array[1] = 1000;
    }
    public int getCapacity() {
        return capacity;
    }
    public int[] getInts() {
        return ints;
    }
    public int getNotFinal() {
        return notFinal;
    }
    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}

