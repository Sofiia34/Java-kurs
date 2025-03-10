package lesson_28.animals;

public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new Cat();

        animal.voice();

        Animal animal1 = new Hamster();

        animal1.voice();

        System.out.println("\n=============");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }


    }

}



