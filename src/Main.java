import java.util.Random;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        CharacterFactory spawn = new CharacterFactory();
        Character[] playingCharacters = new Character[5];
        for (int i = 0; i < 5; i++) {
            Character c = spawn.createCharacter();
            System.out.println(c);
            playingCharacters[i] = c;
        }
        Random random = new Random();
        Character c1 = playingCharacters[random.nextInt(5)];
        Character c2;
        do {
            c2 = playingCharacters[random.nextInt(5)];
        } while (c2 == c1);
        gameManager.Fight(c1, c2);
        for (Character c : playingCharacters) {
            System.out.println(c);
        }
    }
}
