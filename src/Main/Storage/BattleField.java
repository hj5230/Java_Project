package Main.Storage;

import java.util.*;
import Main.Lutemon.*;

public class BattleField extends Storage {
    public ArrayList<Lutemon> luteBF = new ArrayList<>();
    Lutemon lutemon = new Lutemon();

    public void fight(int id1, int id2) {
        int turn = 0;
        Lutemon lute1 = getLutemonBF(id1);
        Lutemon lute2 = getLutemonBF(id2);
        
        while(true) {
            if(turn % 2 == 0) {
                // Even-numbered rounds, lute1 attacks
                ++turn;
                printLuteInfo(lute1);
                printLuteInfo(lute2);
                lute2.health -= lutemon.attack(lute1) - lute2.defense;
                System.out.println(lute1.color + '(' + lute1.name 
                + ") attacks " + lute2.color + '(' + lute2.name + ')');
                if(survivalDetect(lute2)) {
                    System.out.println(lute2.color + '(' + lute2.name 
                    + ") manages to escape death.");
                } else {
                    System.out.println(lute2.color + '(' + lute2.name 
                    + ") gets killed.\nThe battle is over.");
                    luteBF.remove(lute2);
                    ++lute1.experience;
                    break;
                }
            } else {
                // Odd-numbered rounds, lute2 attacks
                ++turn;
                printLuteInfo(lute2);
                printLuteInfo(lute1);
                lute1.health -= lutemon.attack(lute2) - lute1.defense;
                System.out.println(lute2.color + '(' + lute2.name 
                + ") attacks " + lute1.color + '(' + lute1.name + ')');
                if(survivalDetect(lute1)) {
                    System.out.println(lute1.color + '(' + lute1.name 
                    + ") manages to escape death.");
                } else {
                    System.out.println(lute1.color + '(' + lute1.name 
                    + ") gets killed.\nThe battle is over.");
                    luteBF.remove(lute1);
                    ++lute2.experience;
                    break;
                }
            }
        }
    }

    public void listBattleField() {
        System.out.println("There are the following Lutemons at Battle field:");
        luteBF.sort(new Comparator<Lutemon>() {
            public int compare(Lutemon lute1, Lutemon lute2) {
                return lute1.id - lute2.id;
            }
        });
        for(Lutemon lute: luteBF) {
            printLuteInfo(lute);
        }
    }

    public Lutemon getLutemonBF(int id) {
        for(Lutemon lute: luteBF){
            if(lute.id == id) {
                return lute;
            }
        }
        System.out.println("no lutemon with id " + id + " could be found!");
        return null;
    }
}