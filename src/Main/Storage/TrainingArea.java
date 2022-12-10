package Main.Storage;

import java.util.*;
import Main.Lutemon.*;

public class TrainingArea extends Storage{
    public ArrayList<Lutemon> luteTA = new ArrayList<>();
    
    public void train() {
        for(Lutemon lute: luteTA) {
            ++lute.experience;
            System.out.println(lute.color + '(' + lute.name 
            + ") trains and gain experience!");
        }
    }
    public void listTrainningArea() {
        System.out.println("There are the following Lutemons at Training area:");
        luteTA.sort(new Comparator<Lutemon>() {
            public int compare(Lutemon lute1, Lutemon lute2) {
                return lute1.id - lute2.id;
            }
        });
        for(Lutemon lute: luteTA) {
            System.out.println(lute.id + ": " + lute.color
            + '(' + lute.name + ") att: " + lute.attack
            + "; def: " + lute.defense + "; exp:" + lute.experience
            + "; health: " + lute.health + '/' + lute.maxHealth);
        }
    }
}
