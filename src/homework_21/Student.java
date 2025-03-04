package homework_21;

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String studentName) {
        name = studentName;
    }


    public Student(String studentName, int age) {

        name = studentName;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void run() {
        System.out.println("Ya begy!");
    }

    public void whoAmi() {
        System.out.printf("Ya student. Moe imya %s. Moy vosract: %d ", name, age);
    }
}