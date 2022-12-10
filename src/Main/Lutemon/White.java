package Main.Lutemon;

public class White extends Lutemon {
    public White(String name) {
        this.name = name;
        this.color = "White";
        this.attack = 5;
        this.defense = 4;
        this.experience = 0;
        this.maxHealth = 20;
        this.health = this.maxHealth;
        this.id = idCounter;
        ++idCounter;
    }
}
