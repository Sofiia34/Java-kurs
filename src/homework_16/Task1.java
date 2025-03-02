package homework_16;

public class Task1 {
    public static void main(String[] args) {
        long product = 1;
        int a = 1;
        while (a <= 15) {
            product *= a;
            a++;
        }
        System.out.println("proisvidenie chisel ot 1 do 15: " + product);
    }
}
