package lesson_29.abstracts;

    public abstract class Animal {

        private String name;

        public Animal() {
            this.name = "Animal";
        }
        public Animal(String name) {
            this.name = name;
        }
        abstract void move();
        abstract void eat();
        public void sayHello(){
            System.out.println("Hello from animal");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


