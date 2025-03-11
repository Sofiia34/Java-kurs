package homework_28;


    abstract class Vehicle {

        public abstract void startEngine();
    }

    class Car extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("🚗 Автомобіль: двигун запущений!");
        }
    }
    class Bicycle extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("🚲 Велосипед: у мене немає двигуна!");
        }
    }
    class Motorcycle extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("🏍️ Мотоцикл: двигун запущений!");
        }
    }


