package homework13;

import java.util.Scanner;

/*Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления)
первого и последнего символа имени.
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
int lenght = name.length();
        System.out.println("Kоличество символов: " + lenght);
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(lenght -1);
        System.out.println("Первый символ имени " + firstChar + ", десятичный код " + (int)firstChar);
        System.out.println("Последний символ имени " + firstChar + ", десятичный код " + (int)lastChar);
    }
}
