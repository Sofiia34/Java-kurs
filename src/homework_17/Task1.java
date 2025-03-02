package homework_17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vedite ctroky: ");
        String input = scanner.nextLine();
        printStringLendht(input);
    }
    public static void printStringLendht(String text) {
        int lenght = text.length();
        System.out.println("Kolichestvo simvolov v ctroke: " + lenght);
    }
}
