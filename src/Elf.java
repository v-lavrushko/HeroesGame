public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c){
        super.kick(c);
        if (c.power < this.power) {
            c.hp = 0;
        } else {
            c.power--;
        }
    }
}
