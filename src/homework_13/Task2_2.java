package homework13;
/*
Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */
public class Task2_2 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String modifiedSentence = sentence.replace("powerful", "super");
        boolean containsAge = modifiedSentence.contains("age");
        System.out.println("Samenenaya ctroka: " + modifiedSentence);
        System.out.println("Codergit li ctroka podctroky 'age': " + containsAge);
    }
}
