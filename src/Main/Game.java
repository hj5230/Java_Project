package Main;

import java.util.*;
import Main.Lutemon.*;
import Main.Storage.*;

public class Game {

    Storage st = new Storage();
    Home home = new Home();
    TrainingArea ta = new TrainingArea();
    BattleField bf = new BattleField();

    public void addLutemon(Scanner sc) {
        int i = 0;
        String name;
        System.out.println("Add 1) White, 2) Green, 3) Pink, 4) Orange, 5) Black");
        String s = sc.nextLine();
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Give it a name:");
        name = sc.nextLine();

        Lutemon newLute = st.addLutemon(i, name);
        home.createLutemon(newLute);
    }

    public void listLutemons() {
        home.listHome();
        ta.listTrainningArea();
        bf.listBattleField();
    }

    public void moveLutemons(Scanner sc) {
        int moveId = 0;
        int movePlace = 0;
        System.out.println("Give the ID of Lutemon that should be moved:");
        String s1 = sc.nextLine();
        System.out.println("Where would the Lutemon be moved? 1) Home, 2) Training area, 3) Battle field");
        String s2 = sc.nextLine();
        try {
            moveId = Integer.parseInt(s1);
            movePlace = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int check = 0;
        switch(movePlace){
            case 1: // home
                for(Lutemon lute: ta.luteTA) {
                    if(lute.id == moveId) {
                        ++check;
                        home.goHome(lute);
                        ta.luteTA.remove(lute);
                        break;
                    }
                }
                for(Lutemon lute: bf.luteBF) {
                    if(lute.id == moveId) {
                        ++check;
                        home.goHome(lute);
                        bf.luteBF.remove(lute);
                        break;
                    }
                }
                break;
            case 2: // ta
                for(Lutemon lute: home.luteHome) {
                    if(lute.id == moveId) {
                        ++check;
                        ta.luteTA.add(lute);
                        home.luteHome.remove(lute);
                        break;
                    }
                }
                for(Lutemon lute: bf.luteBF) {
                    if(lute.id == moveId) {
                        ++check;
                        ta.luteTA.add(lute);
                        bf.luteBF.remove(lute);
                        break;
                    }
                }
                break;
            case 3: // bf
                for(Lutemon lute: home.luteHome) {
                    if(lute.id == moveId) {
                        ++check;
                        bf.luteBF.add(lute);
                        home.luteHome.remove(lute);
                        break;
                    }
                }
                for(Lutemon lute: ta.luteTA) {
                    if(lute.id == moveId) {
                        ++check;
                        bf.luteBF.add(lute);
                        ta.luteTA.remove(lute);
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        if(check == 0) {
            System.out.println("no lutemon with id " + moveId + " could be found!");
        }
    }

    public void trainsLutemon() {
        ta.train();
    }

    public void letThemFight(Scanner sc) {
        int id1 = 0;
        int id2 = 0;
        bf.listBattleField();
        System.out.println("Give the ID of the first fighter:");
        String s1 = sc.nextLine();
        System.out.println("Give the ID of the second fighter:");
        String s2 = sc.nextLine();
        try{
            id1 = Integer.parseInt(s1);
            id2 = Integer.parseInt(s2);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        bf.fight(id1, id2);
    }
}