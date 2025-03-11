package homework_27;

public class ComponentApp {
        public static void main(String[] args) {
            Processor processor = new Processor("Intel", "Core i7-12700K", 3.6);
            Memory memory = new Memory("Corsair", "Vengeance LPX", 16);
            Storage storage = new Storage("Samsung", "SSD 970 EVO", 512);

            Computer myComputer = new Computer(processor, memory, storage);
            myComputer.displayConfiguration();

            Storage newStorage = new Storage("Western Digital", "WD Black SN850", 1000);
            myComputer.upgradeStorage(newStorage);

            System.out.println("\nПісля оновлення:");
            myComputer.displayConfiguration();
        }
    }



