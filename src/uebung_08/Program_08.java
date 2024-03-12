package uebung_08;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" Möchtest du noch einmal spielen? Ja/Nein? ");
            String auswahl = sc.nextLine();
            if(auswahl.equalsIgnoreCase("ja")){
                startGame();
            }
            else if (auswahl.equalsIgnoreCase("nein")) {
                System.out.println("Vielen Dank fürs Spielen!\n");
                break;

            }

        }


    }
    static void startGame(){
        Game gameinstance = new Game(10,10,30,5);
    }
}
