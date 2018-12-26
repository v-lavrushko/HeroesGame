public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c){
        super.kick(c);
        if (c.getPower() < this.getPower()) {
            c.decreaseHp(c.getHp());
        } else {
            c.decreasePower(1);
        }
    }
}
