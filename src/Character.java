public class Character {
    private int power;
    private int hp;

    void kick( Character c) {
        System.out.printf("%s attacks...\n", this.getClass().getName());
    }

    boolean isAlive() {
        return getHp() > 0;
    }

    public Character(int power, int hp) {
        this.hp = hp;
        this.power = power;
    }

    int getHp() {
        return this.hp;
    }

    int getPower() {
        return this.power;
    }

    void decreaseHp(int number) {
        this.hp -= number;
    }

    void decreasePower(int number) {
        this.power -= number;
    }

    @Override
    public String toString(){
        return String.format("%s, hp: %s, power: %s", this.getClass().getName(), this.hp, this.power);
    }
}
