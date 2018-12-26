public class Knight extends Character {
    public Knight() {
        super(2 + (int) (Math.random() * 10), 2 + (int) (Math.random() * 10));
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        c.decreaseHp((int) (Math.random() * this.getPower()));
    }
}
