package lesson_30.interfaces;


    public interface Printable {

        public static final String color = "black";

        void print();
        default void defaultMethod() {
            System.out.println("Default method");
        }
        static void testStaticMethod(String str) {
            System.out.println("Static method: " + str);
        }

    }

