package lesson_22;

import java.util.Arrays;
public class MagicArray {
    int[] array;
    int cursor;
    public MagicArray() {
        this.array = new int[10]; // [0, 0...0]
    }
    public MagicArray(int[] array) {
        //  Todo Homework
    }
    void add(int value) {
        if (cursor == array.length) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }
    void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор = " + cursor);

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
    void add(int... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    int size() {
        return cursor;
    }

    int get(int index) {

        if (index >= 0 && index < cursor) {
            return array[index];
        }


        return -2_147_483_647;
    }
    int remove(int index) {

        if (index >= 0 && index < cursor) {

            int value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {

            return -2_147_483_647;
        }

    }
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return  -1;
    }

    int lastIndexOf(int value) {

        return -1;
    }

    boolean removeByValue(int value) {

        return false;
    }
    void test() {
        System.out.println(Arrays.toString(array));
    }

}




