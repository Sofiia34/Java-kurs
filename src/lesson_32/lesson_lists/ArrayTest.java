package lesson_32.lesson_lists;

import list.MyArrayList;

import java.util.Arrays;


    public class ArrayTest {

        public static void main(String[] args) {

            MyArrayList<Integer> list = new MyArrayList<>();

            Integer[] arr = list.toArray(); // вернется null
            System.out.println(Arrays.toString(arr));

            System.out.println(list);

            list.add(10);
            list.addAll(20, 30, 40, 50);


            System.out.println(list);

            Integer[] array = list.toArray();

            System.out.println(Arrays.toString(array));





        }
    }



