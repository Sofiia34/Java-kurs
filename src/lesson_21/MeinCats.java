package lesson_21;

public class MeinCats {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayMeow();
        cat.run();
        cat.sleep();
        String catName = cat.name;
        System.out.println("Imya: " + catName);
        System.out.println("Vosract: " + cat.age);
        System.out.println("\nnnnnnnnnnnnnnnnn");

        Cat cat1 = new Cat( "Max");
        System.out.println("cat1.name:" + cat1.name);
        System.out.println("cat1.color: " + cat1.color);
        cat.whoAmi();
        cat1.whoAmi();

        System.out.println("\nnnnnnnnnnnnnnnnn");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmi();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " + barsik.name );
        System.out.println("barsik.color: " + barsik.color );
        System.out.println("barsik.age: " + barsik.age );
        barsik.whoAmi();

        Cat catClone = barsik;
        barsik.age = 100;
        System.out.println("\nbarsik.age = 100");
        barsik.whoAmi();
        catClone.whoAmi();
        System.out.println("\nnnnnnnnnnnn");

        catClone = new Cat("Kratos", "blak", 66);
        catClone.whoAmi();
        barsik.whoAmi();

        //catClone = null;
        //catClone.age 44 // oshibka

        catClone = null;
        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.whoAmi();
        }else {
            System.out.println("V peremenoy null");
        }

    }
}
