package lesson_21;

public class Dog {
    String name;
    int weight;
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    void info() {
        System.out.println("I am dog " + name + "my weight: " + weight);
    }

    void eat() {
        System.out.println("Ia kyschay nam- nam!");
        this.weight++;
    }
    void run() {
        while (weight < 3) {
            System.out.println("Soran, ia sliskom xyda i golodna! begat ne mogy.");
            System.out.println("Moy ves ceychas " + weight);
            eat();
        }

        System.out.println("Ia begy!");
        weight -= 2;
        System.out.println("Ves posle probeski: " + weight);
        System.out.println("\nnnnnnnnnnnnnnnnn");
    }


}
