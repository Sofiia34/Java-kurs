package homework_27;

public class Component {

        protected String brand;
        protected String model;

        public Component(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public void displayInfo() {
            System.out.println(getClass().getSimpleName() + ": " + brand + " " + model);
        }
    }

    class Processor extends Component {
        private double frequency;

        public Processor(String brand, String model, double frequency) {
            super(brand, model);
            this.frequency = frequency;
        }

        public double getFrequency() {
            return frequency;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Частота: " + frequency + " GHz");
        }
    }
    class Memory extends Component {
        private int capacity;

        public Memory(String brand, String model, int capacity) {
            super(brand, model);
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Об'єм пам'яті: " + capacity + " GB");
        }
    }
    class Storage extends Component {
        private int capacity;

        public Storage(String brand, String model, int capacity) {
            super(brand, model);
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Об'єм накопичувача: " + capacity + " GB");
        }
    }
    class Computer {
        private final Processor processor;
        private final Memory memory;
        private Storage storage;

        public Computer(Processor processor, Memory memory, Storage storage) {
            this.processor = processor;
            this.memory = memory;
            this.storage = storage;
        }

        public void displayConfiguration() {
            System.out.println("Конфігурація комп'ютера:");
            processor.displayInfo();
            memory.displayInfo();
            storage.displayInfo();
        }

        public void upgradeStorage(Storage newStorage) {
            System.out.println("Оновлення накопичувача...");
            this.storage = newStorage;
        }
    }



