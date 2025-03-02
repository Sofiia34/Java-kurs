package homework_18;

public class Task1 {
    public static void main(String[] args) {
        copyOfArray(new int[]{0, 1, 2, 3, 4, 5, 6}, 3);
        copyOfArray(new int[]{0, 1, 2}, 5);
    }

    public static void copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength && i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(java.util.Arrays.toString(newArray));
    }
}

