public class Goblin extends Character {
    public Goblin() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        System.out.println("Goblin screams.");
    }
}
