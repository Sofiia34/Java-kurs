package homework_18;

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "kiwi", "strawberry", "cherry"};
        String[] result = findShortestAndLongest(array);
        System.out.println(java.util.Arrays.toString(result));
    }
    public static String[] findShortestAndLongest(String[] array) {
        if (array == null || array.length == 0) {
            return new String[]{"", ""};
        }
        String shortest = array[0];
        String longest = array[0];
        for (String str : array) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return new String[]{shortest, longest};
    }
}
