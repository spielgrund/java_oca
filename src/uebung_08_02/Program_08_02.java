package uebung_08_02;

import java.util.Scanner;

public class Program_08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!");
        PilzFeld pf = new PilzFeld();
        pf.spielZuruecksetzen();


        schleife:
        while(true){
            if(0 < pf.getSpielzuege()){
                System.out.println("Bitte wähle ein Feld(x,y)");
                pf.aufdecken(sc.nextLine());
                System.out.println();
            }else{
                System.out.println("Keine Spielzuege mehr. Du hast " + pf.getScore() + " Pilze gefunden"
                                    + "\n Möchtest du noch einmal spielen? Ja/Nein? ");
                String auswahl = sc.nextLine();
                if(auswahl.equalsIgnoreCase("ja")){
                    pf.spielZuruecksetzen();
                    pf.spielfeldZuruecksetzten();

                }
                else if (auswahl.equalsIgnoreCase("nein")) {
                    System.out.println("Vielen Dank fürs Spielen!\n");
                    break;

                }
            }

        }


    }
}
