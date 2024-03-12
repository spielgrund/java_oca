package uebung_08;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int spielzuege = 10;
    PilzFeld pf;

    Game(int spielzuege, int spielfeldgroesse, int anzahlpilze, int anzahlgiftpilze){
        this.spielzuege = spielzuege;
        pf = new PilzFeld(spielfeldgroesse,anzahlpilze,anzahlgiftpilze);
        gameLoop();
    }

    public void gameLoop(){
        while(0 < spielzuege){
                System.out.println("Bitte wähle ein Feld(x,y)");
                Pilz p = pf.aufdecken(sc.nextLine());
                System.out.println(pf);
                score += p.getScore();
                spielzuege -= p.getAbzug();
                System.out.println("Score: " + score + "," + "Zuege: " + spielzuege);

            }
        System.out.println(UiUtils.GAMEOVER + score);
        }
    }

