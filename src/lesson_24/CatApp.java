package lesson_24;

public class CatApp {
    public static void main(String[] args) {

        System.out.println("static field: " + Car.totalCars);


        Car bmw = new Car("BMW", 200);
        System.out.println("static totalCars: " + Car.totalCars);

        System.out.println("После создания 1 машины: " + bmw.toString());

        Car vw = new Car("VW", 300);

        System.out.println(vw.toString());
        System.out.println("После создания 2-х: " + bmw.toString());

        System.out.println("Static variable: " + Car.totalCars);


    }
}

