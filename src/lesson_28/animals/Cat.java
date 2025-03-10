package lesson_28.animals;

    public class Cat extends Animal {

        public void eat() {
            System.out.println("Cat eat");
        }

        @Override
        public void voice() {
            System.out.println("Cat say MEOW!");
        }

    }

