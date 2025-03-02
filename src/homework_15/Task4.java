package homework_15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedithe chetirox snachnoe chislo: ");
        String input = scanner.nextLine();
        if (input.length() != 4) {
            System.out.println("Oschibka! Vedithe chetirox snachnoe chislo.");
            return;
        }
        int digit1 = input.charAt(0);
        int digit2 = input.charAt(1);
        int digit3 = input.charAt(2);
        int digit4 = input.charAt(3);
        int sumFirstToo = digit1 + digit2;
        int sumLastToo = digit3 + digit4;
        if (sumFirstToo == sumLastToo) {
            System.out.println("Chislo " + input + " - chosliviy bilet!");
        } else {
            System.out.println("Chislo " + input + " - ne chosliviy bilet!");
        }
    }
}
