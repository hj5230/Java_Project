package Main.Lutemon;

public class Orange extends Lutemon {
    public Orange(String name) {
        this.name = name;
        this.color = "Orange";
        this.attack = 8;
        this.defense = 1;
        this.experience = 0;
        this.maxHealth = 17;
        this.health = this.maxHealth;
        this.id = idCounter;
        ++idCounter;
    }
}
