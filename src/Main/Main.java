package Main;

import java.util.Scanner;
import Main.Lutemon.Lutemon;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the Lutemon simulator!");

        boolean exit = false;
        Game game = new Game();
        Lutemon lutemon = new Lutemon();

        while(!exit) {
            System.out.println("1) Create a Lutemon, "
            + "2) List all the Lutemons, 3) Move Lutemons, 4) Train "
            + "Lutemons, 5) Let them fight, 0) Exit");
            String s = sc.nextLine();
            int i = 0;
            try {
                i = Integer.parseInt(s);
            } catch(NumberFormatException e) {
                e.printStackTrace();
            }

            switch(i) {
                case 1:
                    game.addLutemon(sc);
                    break;
                case 2:
                    game.listLutemons();
                    break;
                case 3:
                    game.moveLutemons(sc);
                    break;
                case 4:
                    game.trainsLutemon();
                    break;
                case 5:
                    game.letThemFight(sc);
                    break;
                default:
                    exit = true;
                    System.out.println("The game has closed. In total " 
                    + lutemon.getNumberOfCreatedLutemons() 
                    + " Lutemons were created.");
                    break;
            }
        }
        sc.close();
    }
}
