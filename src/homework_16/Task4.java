package homework_16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedite chislo: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            int digital = number % 10;
            sum += digital;
            number /= 10;
        }
        System.out.println("Suma chisla: " + sum);
    }
}
