package Main.Lutemon;

public class Pink extends Lutemon {
    public Pink(String name) {
        this.name = name;
        this.color = "Pink";
        this.attack = 7;
        this.defense = 2;
        this.experience = 0;
        this.maxHealth = 18;
        this.health = this.maxHealth;
        this.id = idCounter;
        ++idCounter;
    }
}
