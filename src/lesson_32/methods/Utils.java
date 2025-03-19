package lesson_32.methods;


import list.MyList;

public class Utils {

        public static <T> void swap(T[] array, int idx1, int idx2) {
            T temp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = temp;
        }

        public static <T> T getFirstElement(MyList<T> list) {
            if (list.isEmpty()) return null;
            return list.get(0);
        }

        public static <T extends Number> int sumElements(T... elements) {
            int sum = 0;
            for (int i = 0; i < elements.length; i++) {
                sum += elements[i].intValue();
            }
            return sum;
        }

        public static double listSum(MyList<? extends Number> listNumber) {
            double sum = 0;
            for (int i = 0; i < listNumber.size(); i++) {
                sum += listNumber.get(i).doubleValue();
            }
            return sum;
        }

        public static void  addNumbers(MyList<? super Integer> list) {
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }

            System.out.println(list);
        }




    }


