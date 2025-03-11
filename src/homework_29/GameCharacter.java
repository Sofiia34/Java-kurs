package homework_29;

    abstract class GameCharacter {
        protected String name; // Ім'я персонажа

        public GameCharacter(String name) {
            this.name = name;
        }

        public abstract void attack();
    }

    class Warrior extends GameCharacter {
        public Warrior(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " 🗡️ атакує мечем!");
        }
    }

    class Mage extends GameCharacter {
        public Mage(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " 🔥 використовує магічне заклинання!");
        }
    }

    class Archer extends GameCharacter {
        public Archer(String name) {
            super(name);
        }

        @Override
        public void attack() {
            System.out.println(name + " 🏹 стріляє з лука!");
        }
    }

