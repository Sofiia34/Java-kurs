package lesson_29.children;


    public class Child extends Parent{

        int age;


        public Child() {
            super("Default");
            this.age = 20;
        }

        public Child(String name, int age) {
            super(name);
            this.name = name;
            this.age = age;
        }

    }




