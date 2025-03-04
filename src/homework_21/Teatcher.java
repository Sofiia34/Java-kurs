package homework_21;

public class Teatcher {
    String name;
    String subjekt;
    int age;
    public Teatcher(String name, String subjekt, int age) {
        this.name = name;
        this.subjekt = subjekt;
        this.age = age;
    }
    void introduce() {
        System.out.println("Ya " + name + ", mne " + age + " goda, ya prepoday " + subjekt + ".");
    }
    void teach() {
        System.out.println(name + " vikladaet: " + subjekt + ".");
    }
    public String getSubjekt() {
        return subjekt;
    }
}
