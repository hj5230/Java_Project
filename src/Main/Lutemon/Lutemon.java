package Main.Lutemon;

public class Lutemon {
    public String name;
    public String color;
    public int attack;
    public int defense;
    public int experience;
    public int health;
    public int maxHealth;
    public int id;
    protected static int idCounter = 0;
    // ?Subclasses cannot access idCounter if it's private?

    public int defense(Lutemon lutemon) {
        return lutemon.defense;
    }
    public int attack(Lutemon lutemon){
        return lutemon.attack + lutemon.experience;
    }
    public int getNumberOfCreatedLutemons(){
        return idCounter;
    }
}
