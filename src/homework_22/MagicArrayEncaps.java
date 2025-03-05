package homework_22;

import java.util.Arrays;

public class MagicArrayEncaps {
    int[] array;
    int cursor;



    public MagicArrayEncaps() {
        this.array = new int[10]; // [0, 0...0]
    }

    public MagicArrayEncaps(int[] array) {

        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            add(array);
        }
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

    // Текущее кол-во элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
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
        return -1;
    }
    int lastIndexOf(int value) {

        for (int i = cursor - 1; i >= 0 ; i--) {
            if (array[i] == value) return i;
        }

        return -1;

    }

    boolean removeByValue(int value) {

        int index = indexOf(value);
        if (index < 0) return false;

        remove(index);
        return true;
    }

    public int[] toArray() {
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    void test() {
        System.out.println(Arrays.toString(array));
    }

}
