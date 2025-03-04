package homework_21;

public class MeinStudents {
    public static void main(String[] args) {
        Student student = new Student("Oleg", 22);
        System.out.println("Imya: " + student.name);
        System.out.println("Vosract: " + student.age);
        student.sayHello();
        student.run();
        student.whoAmi();
        }

    }

