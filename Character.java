import java.util.List;

public class Character {
    String name;
    int health;
    int agility;
    int intellgence;
    int stenght;
    Weapon weapon;
    Armor armor;
    List<Skill> skills;
}
class Weapon implements Deep<Weapon>{
    String name;
    int col;


    public Weapon(String name, int col) {
        this.name = name;
        this.col = col;
    }

    public Weapon DeepClone(){
        return new Weapon(this.name, this.col);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

class Armor implements Deep<Armor>{
    String name;
    int col;

    public Armor(String name, int col) {
        this.name = name;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    public Armor DeepClone(){
        return new Armor(this.name, this.col);
    }
}
class Skill implements Deep<Skill> {
    String name;
    int col;

    public Skill(String name, int col) {
        this.name = name;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    public Skill DeepClone(){
        return new Skill(this.name, this.col);
    }
}

interface Deep<T>{
    T DeepClone();
}