package lesson_26.transport;

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;


    public Bus(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getCountPassengers() {
        return countPassengers;
    }
    public boolean  takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
//
            return true;
        }

        System.out.printf("В автобусе %s больше месте нет. Сейчас %d пассажиров\n",
                model, countPassengers);
        return false;
    }

    public boolean dropPassenger() {

        return false;
    }
}


