package Main.Storage;

import java.util.ArrayList;

import Main.Lutemon.*;

public class Storage {
    public ArrayList<Lutemon> luteST = new ArrayList<>();

    public Lutemon addLutemon(int select, String name) {
        switch (select) {
            case 1:
                luteST.add(new White(name));
                break;
            case 2:
                luteST.add(new Green(name));
                break;
            case 3:
                luteST.add(new Pink(name));
                break;
            case 4:
                luteST.add(new Orange(name));
                break;
            case 5:
                luteST.add(new Black(name));
                break;
            default:
                System.out.println("Invalid option");
	break;
        }
        return luteST.get(luteST.size() - 1);
    }

    public void printLuteInfo(Lutemon lutemon) {
        System.out.println(lutemon.id + ": " + lutemon.color
        + '(' + lutemon.name + ") att: " + lutemon.attack
        + "; def: " + lutemon.defense + "; exp:" + lutemon.experience
        + "; health: " + lutemon.health + '/' + lutemon.maxHealth);
    }
    
    public boolean survivalDetect(Lutemon lutemon) {
        if(lutemon.health > 0){
            return true;
        } else {
            return false;
        }
    }
}