import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arenaSize = 5;
        GameManager gameManager = new GameManager();
        CharacterFactory spawn = new CharacterFactory();
        Arena arena = new Arena();
        for (int i = 0; i < arenaSize; i++) {
            arena.addCharacter(spawn.createCharacter());
        }
        System.out.println(arena);
        while (arenaSize != 1) {
            Random random = new Random();
            Character c1 = arena.getCharacter(random.nextInt(arenaSize));
            Character c2;
            do {
                c2 = arena.getCharacter(random.nextInt(arenaSize));
            } while (c2 == c1);
            gameManager.Fight(c1, c2);
            arena.trashDead();
            arenaSize = arena.size();
        }
        System.out.println(arena);
    }
}
