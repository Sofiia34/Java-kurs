package lesson_26;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("Hello");

        sb.append(" ");

        String string = sb.toString();
        System.out.println(string);

        sb = new StringBuilder("Hello World");
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java");
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        System.out.println("\n========== index ==========");

        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);

        System.out.println("\n========== reverse ==========");

        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        System.out.println("length: " +  sb.length());


        sb = new StringBuilder("Hello");
        sb.setLength(10);
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println("sb.length(): " + sb.length());

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "fstgws gqtgtwr";
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));


    }
}


