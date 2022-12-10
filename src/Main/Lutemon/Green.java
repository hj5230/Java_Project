package Main.Lutemon;

public class Green extends Lutemon{
    public Green(String name) {
        this.name = name;
        this.color = "Green";
        this.attack = 6;
        this.defense = 3;
        this.experience = 0;
        this.maxHealth = 19;
        this.health = this.maxHealth;
        this.id = idCounter;
        ++idCounter;
    }
}
