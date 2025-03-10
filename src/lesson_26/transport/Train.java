package lesson_26.transport;
public class Train extends Vehicle {


    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year,  int countWagons, int wagonCapacity) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }
    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }
    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();

    }
    public int getCapacity() {
        return capacity;
    }
    public int getCountPassengers() {
        return countPassengers;
    }
    public int getCountWagons() {
        return countWagons;
    }
    public int getWagonCapacity() {
        return wagonCapacity;
    }
}

