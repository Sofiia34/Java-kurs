package homework13;

import java.util.Scanner;

/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vecti ctroky chetnoy dlinu: ");
        String input = scanner.nextLine();
        if (input.length() % 2 == 0) {
            int middle = input.length() / 2;
            char middleChar1 = input.charAt(middle -1);
            char middleChar2 = input.charAt(middle);
            System.out.println("Credniy cimvol ctroki: " + middleChar1 + middleChar2);
        }else {
            System.out.println("Poprobyute cnova.");
        }
    }

}
