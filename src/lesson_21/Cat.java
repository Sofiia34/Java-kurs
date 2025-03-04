package lesson_21;

public class Cat {

    String name;
    String color;
    int age;


    public Cat() {
    }
    public Cat(String catName) {
        name = catName;
    }
    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    }
    public Cat(String name,String color, int age){
        this(name, color);

        //this.name = name;
        //this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Ya sply!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println("Ya begy!");
    }
    public void whoAmi() {
        System.out.printf("Iy kotik %s, vosract: %d, moy okras %s\n", name, age, color);
    }

}
