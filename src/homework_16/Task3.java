package homework_16;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int attempts = 0;
        while (true){
            System.out.print("Vedite slovo 'hello': ");
            String input = scanner.nextLine();
            attempts++;
            if (input.equals("hello")) {
                System.out.println("Vi veli pravilnoe slovo.");
                break;
            }
            System.out.println("Vi veli ne pravilnoe slovo. Poprobyete eze ras");
        }
        System.out.println("Kolichestvo popitok:" + attempts);

    }

}
