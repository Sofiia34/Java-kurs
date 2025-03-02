package homework_15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedite chislo ot 0 do 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Ponedelnik");
                break;
            case 2:
                System.out.println("Vtornik");
                break;
            case 3:
                System.out.println("Creda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Pyatniza");
                break;
            case 6:
            case 7:
                System.out.println("Vixodnoy");
                break;
            default:
                System.out.println("Nekoretniy vod. Vedite chislo ot 1 do7.");

        }
    }
}
