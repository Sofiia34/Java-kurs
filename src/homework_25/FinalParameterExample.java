package homework_25;

public class FinalParameterExample {
    public  static void printMessage(final String message) {
        System.out.println("Повідомлення: " + message);

    }

    public static void main(String[] args) {
        printMessage("Привіт, світ!");
    }
}

