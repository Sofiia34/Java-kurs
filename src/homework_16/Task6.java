package homework_16;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};
        System.out.println("Nachalniy masiv: " + Arrays.toString(array));
        int minINdex = 0;
        int maxIndex = 0;
        for (int a = 1; a < array.length; a++) {
            if (array[a] < array[minINdex]) {
                minINdex = a;
            }
            if (array[a] > array[maxIndex]) {
                maxIndex = a;
            }
        }
        int temp =array[minINdex];
        array[minINdex] = array[maxIndex];
        array[maxIndex] = temp;
        System.out.println("Masiv posle sameny: " + Arrays.toString(array));
    }
}
