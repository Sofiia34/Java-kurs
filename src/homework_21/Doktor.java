package homework_21;

public class Doktor {
    private String name;
    private int age;
    private int hours = 8;


    public Doktor(String name, int age) {
        this.name = name;
        this.age = age;
        this.hours = 8;
    }
    void introduge() {
        System.out.println("I doktor " + name + " mne " + age + " let.");

    }
    void  working() {
        System.out.println("Nachalo raboty.");
        while (hours > 0) {
            System.out.println("Ya rabotay! Octaloc chasov: " + hours);
            hours--;
        }
        System.out.println("Robotchiy den okonchen.");
    }
    void holiday() {
        System.out.println("Ya idy domoy");
        int restHours = 18;
        while (restHours > 8){
            System.out.println("Ya otdixay, octalos chasov: " + restHours);
            restHours--;
        }
        System.out.println("Ya sply: ");
        hours = 8;



    }




}
