package homework_17;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vedite cheloe chislo: ");
        int number = scanner.nextInt();
        calculatePowerOfToo(number);
    }

    public static void calculatePowerOfToo(int number) {
        int result = 1;
        if (number >= 0) {
            for (int i = 0; i < number; i++) {
                result = result * 2;
            }
            System.out.println("2 v ctepeni " + number + " = " + result);
        } else {
            for (int i = 0; i > number; i--) {
                result = result * 2;
            }
            System.out.println("2 v ctepeni " + number + " = 1/" + result + " = " + (1.0 / result));
        }
    }
}




