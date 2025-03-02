package homework_14;
import  java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite cheloe chiclo: ");
        int number = scanner.nextInt();
        boolean  isEven = number % 2 == 0;
        boolean isMultiple = number % 3 == 0;
        boolean isEvenAndMultiple = isEven && isMultiple;
        System.out.println("Chislo: " + number + " chetnoe: " + isEven + " kratnoe 3: " + isMultiple + " chetnoe i kratnoe 3: " + isEvenAndMultiple);
    }
}

