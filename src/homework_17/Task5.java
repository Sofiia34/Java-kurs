package homework_17;

public class Task5 {
    public static void main(String[] args) {
            String[] words = {"One", "Two", " Twenty"};
            String longestWord = "";
            int maxlength = 0;
            for (int a = 0; a < words.length; a++) {
                if (words[a].length() > maxlength) {
                    longestWord = words[a];
                    maxlength = words[a].length();
                }
            }
            System.out.println("Cimvoly dlinogo slova: ");
            for (int a = 0; a < longestWord.length(); a++) {
                System.out.println(longestWord.charAt(a));
            }
        }
    }

