import java.util.ArrayList;

public class Arena {
    private ArrayList<Character> aliveCharacters = new ArrayList<Character>();

    public void addCharacter(Character c) {
        aliveCharacters.add(c);
    }

    @Override
    public String toString() {
        String result = "";
        for (Character c : this.aliveCharacters) {
            result = result.concat(c.toString() + "\n");
        }
        return result;
    }

    public void trashDead() {
        for (int i = 0; i < this.aliveCharacters.size(); i++) {
            if(this.aliveCharacters.get(i).getHp() <= 0) {
                this.aliveCharacters.remove(i);
            }
        }
    }

    public int size() {
        return this.aliveCharacters.size();
    }

    public Character getCharacter(int pose) {
        return this.aliveCharacters.get(pose);
    }
}
