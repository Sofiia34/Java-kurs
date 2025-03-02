package homework_15;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int grade = random.nextInt(13);
        int remainingTime = 45;
        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println("Otlitchnaya ozenka! Ti molodez!");
                remainingTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Xorochaya ozenka! Ti molodez!");
                remainingTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Ne ploxaya ozenka! ti mogesh lutche!");
                remainingTime += 15;
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("ploxaya ozenka! mne grustno!");
                remainingTime -= 30;
                break;
            default:
                System.out.println("Ochen ploxaya. Televisor saprechen.");
                remainingTime = 0;
                break;
        }
                if (remainingTime > 60) {
                    remainingTime = 60;
                } else if (remainingTime < 0) {
                    remainingTime = 0;
                }
            System.out.println("Ozenka: " + grade);
            System.out.println("Ostavchiesya vremiya glya TV: " + remainingTime + " minyt");
        }
    }

