package lesson_27;

public class Autobus {
    private static int counter = 1;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus {" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                '}';
    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }

        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир с id %d уже в автобусе c id %d\n",
                        passenger.getId(), this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус c id %d\n",
                    passenger.getId(), this.id);
            return true;
        }
        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;

    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        return false;
    }

    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);

    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }
}



