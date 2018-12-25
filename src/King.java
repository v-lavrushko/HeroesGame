public class King extends Character {
    public King() {
        super(5 + (int) (Math.random() * 10), 5 + (int) (Math.random() * 10));
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        c.hp -= (int) (Math.random() * this.power);
    }
}
