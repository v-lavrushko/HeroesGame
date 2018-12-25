public class Character {
    int power;
    int hp;

    void kick( Character c) {
        System.out.printf("%s attacks...\n", this.getClass().getName());
    }

    boolean isAlive() {
        return this.hp > 0;
    }

    public Character(int power, int hp) {
        this.hp = hp;
        this.power = power;
    }

    @Override
    public String toString(){
        return String.format("%s, hp: %s, power: %s", this.getClass().getName(), this.hp, this.power);
    }
}
