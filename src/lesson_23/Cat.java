package Lesson_23;

public class Cat {
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {


        if (!(age < 0 || age > 30)) {

            this.age = age;
        }
    }
    public void setWeight(int weight) {
        if (weight < 0) {

            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return; // работа метода прекращается. Дальнейшие проверки не проводятся
        }
        if ( !(weight > 50)) {
            // код1
            this.weight = weight; //
        }

    }

    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod();
    }
    private void testMethod() {
        System.out.println("Test!");
    }
    public String toString() {
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }
}

