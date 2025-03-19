package homework_32.task_3;


    public class NumericPair<T extends Number, E extends Number > {
        private T first;
        private E second;

        public NumericPair(T first, E second) {
            this.first = first;
            this.second = second;
        }

        public Double sum() {
            return first.doubleValue() + second.doubleValue();
        }

        public static void main(String[] args) {
            NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
            System.out.println(intPair.sum()); // Вывод: 30.0

            NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
            System.out.println(doublePair.sum()); // Вывод: 10.0

            double d = 15;
            System.out.println(d);

            NumericPair<Double, Double> doublePair2 = new NumericPair<>(Double.valueOf(5), 4.5);
            System.out.println(doublePair2.sum()); // Вывод: 10.0

            Byte btVal = 10;

            NumericPair<Number, Byte> bytePair =  new NumericPair<>(4.5, btVal);

        }
    }



