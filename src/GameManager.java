public class GameManager {
    void Fight(Character c1, Character c2) {
        System.out.printf("Starting conditions:\n\t%s\n\t%s\n", c1, c2);
        c1.kick(c2);
        c2.kick(c1);
        System.out.printf("After battle:\n\t%s\n\t%s\n", c1, c2);
    }
}
