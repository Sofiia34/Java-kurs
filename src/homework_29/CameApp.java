package homework_29;

public class CameApp {
    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Артур"),
                new Mage("Гендальф"),
                new Archer("Леголас")
        };

        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}


