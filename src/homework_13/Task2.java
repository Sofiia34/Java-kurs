package homework13;
/*Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class Task2 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String concatStr = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Perviy cpocob : " + concatStr);
        System.out.println("Dlina ctroki: " + concatStr.length());
        String concatStr2 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println("Perviy cpocob : " + concatStr2);
        System.out.println("Dlina ctroki: " + concatStr2.length());

    }
}
