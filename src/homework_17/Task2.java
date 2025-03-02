package homework_17;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        printArrayReversed(array);

        printArrayReversed(array, 2);
    }
    public static void printArrayReversed(int[] array) {
        System.out.print("Obratna posledovatelnoct: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i >= 0) {
                System.out.print(", ");

            }
        }
        System.out.println("]");
    }
    public static void printArrayReversed(int[] array, int index) {

        System.out.print("V pramom poradke: [");
        for (int i = 0; i != index; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        for (int i = array.length -1; i >= index ; i--) {
            System.out.print(array[i]);
            if (i >= index) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");
    }

}
