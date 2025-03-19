package lesson_32.lesson_lists;


import list.MyArrayList;
import list.MyList;

public class MyListTest {

        public static void main(String[] args) {

            MyList<Integer> integerList = new MyArrayList<>();

            integerList.add(10);

            System.out.println(integerList);

            integerList.addAll(120, 250, 1000, -100, -200, 0);

            System.out.println(integerList);

            Integer value = integerList.get(0);
            System.out.println(value);

            System.out.println("integerList.size(): " + integerList.size());

            int index = integerList.indexOf(120);
            System.out.println("integerList.indexOf(120): " + index);

            index = integerList.indexOf(250);
            System.out.println("integerList.indexOf(250): " + index);

            System.out.println("\n================");

            System.out.println(integerList);

            System.out.println(integerList.remove(Integer.valueOf( 0)));
            System.out.println(integerList);

            integerList.add(null);
            System.out.println(integerList);

            System.out.println(integerList.lastIndexOf(null));
        }
    }


