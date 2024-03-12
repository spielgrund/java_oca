package uebung_08;

import java.util.Objects;
import java.util.Random;

public class PilzFeld {
    private int spielfeldgroesse = 10;

    private int anzahlpilze = 30;

    private int score = 0;

    Pilz[][] pilzfeld;

    Random rnd = new Random();

    PilzFeld(int spielfeldgroesse, int anzahlpilze){
        this.spielfeldgroesse = spielfeldgroesse;
        this.anzahlpilze = anzahlpilze;
        pilzfeld = new Pilz[spielfeldgroesse][spielfeldgroesse];
        platzierePilze();
        platziereLeeresFeld();
    }

    PilzFeld(int spielfeldgroesse, int anzahlpilze, int anzahlgiftpilze){
        this.spielfeldgroesse = spielfeldgroesse;
        this.anzahlpilze = anzahlpilze;
        pilzfeld = new Pilz[spielfeldgroesse][spielfeldgroesse];
        platzierePilze();
        platziereGiftPilze(anzahlgiftpilze);
        platziereLeeresFeld();
        System.out.println(toString());
    }

    public Pilz aufdecken(String s){
        Pilz p = new Pilz();
        p.score = 0;
        p.abzug = 0;
        try {
            String[] eingabe = s.split(",");
            int x = Integer.parseInt(eingabe[1].trim());
            int y = Integer.parseInt(eingabe[0].trim());
            p = pilzfeld[x][y];
            //System.out.println(p);
            pilzfeld[x][y].aufgedeckt();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;

    }

    public void platzierePilze(){
        int i = 0;
        while(i < anzahlpilze){
            int rndx = rnd.nextInt(spielfeldgroesse);
            int rndy = rnd.nextInt(spielfeldgroesse);

            if(pilzfeld[rndy][rndx] == null){
                Pilz p1 = new Pilz();
                p1.setPosition(rndx,rndy);
                pilzfeld[rndy][rndx] = p1;
                i++;
            }

        }
    }

    public void platziereGiftPilze(int anzahl){
        int i = 0;
        while(i < anzahl){
            int rndx = rnd.nextInt(spielfeldgroesse);
            int rndy = rnd.nextInt(spielfeldgroesse);

            if(pilzfeld[rndy][rndx] == null){
                GiftPilz gp1 = new GiftPilz();
                gp1.setPosition(rndx,rndy);
                pilzfeld[rndy][rndx] = gp1;
                i++;
            }

        }
    }

    public void platziereLeeresFeld(){
        for (int i = 0; i < spielfeldgroesse; i++) {
            for (int j = 0; j < spielfeldgroesse; j++) {
                if(pilzfeld[i][j] == null){
                    leeresFeld lf = new leeresFeld();
                    pilzfeld[i][j] = lf;
                }

            }

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Pilz p = new Pilz();
        GiftPilz gp = new GiftPilz();
        for (int i = 0; i < spielfeldgroesse; i++) {
            for (int j = 0; j < spielfeldgroesse; j++) {
                sb.append(pilzfeld[i][j].getZeichen());
            }
            sb.append("\n");

        }
        return sb.toString();
    }
}
