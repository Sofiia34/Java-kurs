import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int countPrimes = 0;
        System.out.print("Простые числа: ");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                countPrimes++;
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел: " + countPrimes);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) { // Достаточно проверять до number / 2
            if (number % i == 0) {
                return false; // Нашли делитель, значит число не простое
            }
        }
        return true; // Делителей не нашли, число простое
    }
}




