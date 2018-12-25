import java.util.Random;

public class CharacterFactory {

    Character createCharacter() {
        Character[] avaibleCharacters = {new Goblin(), new Elf(), new King(), new Knight()};
        Random random = new Random();
        int randomCharacter = random.nextInt(avaibleCharacters.length);
        return avaibleCharacters[randomCharacter];
    }
}
