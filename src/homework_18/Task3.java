package homework_18;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] result = filterPrimes(array);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] filterPrimes(int[] array) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : array) {
            if (num > 1 && isPrime(num)) {
                primes.add(num);
            }
        }
        return primes.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


