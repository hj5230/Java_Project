package Main.Lutemon;

public class Black extends Lutemon{
    public Black(String name) {
        this.name = name;
        this.color = "Black";
        this.attack = 9;
        this.defense = 0;
        this.experience = 0;
        this.maxHealth = 16;
        this.health = this.maxHealth;
        this.id = idCounter;
        ++idCounter;
    }
}
