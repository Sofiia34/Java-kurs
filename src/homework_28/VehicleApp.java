package homework_28;

public class VehicleApp {

        public static void main(String[] args) {
            // Масив транспортних засобів
            Vehicle[] vehicles = {
                    new Car(),
                    new Bicycle(),
                    new Motorcycle()
            };

            for (Vehicle vehicle : vehicles) {
                vehicle.startEngine();
            }
        }
    }




