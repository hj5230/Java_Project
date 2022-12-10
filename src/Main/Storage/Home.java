package Main.Storage;

import java.util.*;
import Main.Lutemon.*;

public class Home extends Storage {
    public ArrayList<Lutemon> luteHome = new ArrayList<>();

    public void createLutemon(Lutemon lutemon) {
        luteHome.add(lutemon);
    }

    public void goHome(Lutemon lutemon) {
        luteHome.add(lutemon);
        lutemon.health = lutemon.maxHealth;
    }
    public void listHome() {
        System.out.println("There are the following Lutemons at Home:");
        luteHome.sort(new Comparator<Lutemon>() {
            public int compare(Lutemon lute1, Lutemon lute2) {
                return lute1.id - lute2.id;
            }
        });
        for(Lutemon lute: luteHome) {
            System.out.println(lute.id + ": " + lute.color
            + '(' + lute.name + ") att: " + lute.attack
            + "; def: " + lute.defense + "; exp:" + lute.experience
            + "; health: " + lute.health + '/' + lute.maxHealth);
        }
    }
}
