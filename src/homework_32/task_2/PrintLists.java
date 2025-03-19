package homework_32.task_2;


import list.MyArrayList;
import list.MyList;

public class PrintLists {

        public static void main(String[] args) {
            MyArrayList<String> names = new MyArrayList<>();
            names.add("Alice");
            names.add("Bob");

            MyArrayList<Integer> scores = new MyArrayList<>();
            scores.add(85);
            scores.add(92);

            printTwoLists(names, scores);
        }

        public static <T, U> void printTwoLists(MyList<T> list1, MyList<U> list2) {

            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }

            for (int i = 0; i < list2.size(); i++) {
                System.out.println(list2.get(i));
            }
        }
    }


