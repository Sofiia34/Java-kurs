package homework_16;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int lenght = random.nextInt(11) + 5;
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        System.out.println("Masiv: ");
        for (int num : array) {
            System.out.println(num + ", ");
        }
        System.out.println();
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int num : array) {
            if (num < min){
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        double averade = (double) sum / array.length;
        System.out.println("Minimalnoe snachenie v masive: " + min);
        System.out.println("Maksimalnoe snachenie v masive: " + max);
        System.out.println("Crednee arifmeticheskoe vcex snacheniy v masive: " +averade);
        }
    }

