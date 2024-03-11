package uebung_08_02;

import java.util.Random;

//Hello Git!123
//pushit
//hello?

public class PilzFeld {
    final int SPIELFELDGROESSE = 10;

    final int ANZAHLPILZE = 30;

    final int SPIELZUEGE = 10;
    String[][] pilzfeld = new String[SPIELFELDGROESSE][SPIELFELDGROESSE];

    private int spielzuege = SPIELZUEGE;

    private int score = 0;

    Random rnd = new Random();

    public void spielfeldZuruecksetzten(){
        for (int i = 0; i < SPIELFELDGROESSE; i++) {
            for (int j = 0; j < SPIELFELDGROESSE; j++) {
                pilzfeld[i][j] = ". ";

            }

        }
    }

    private void platzierePilze(){
        int i = 0;
        while(i < ANZAHLPILZE){
            int rndx = rnd.nextInt(SPIELFELDGROESSE);
            int rndy = rnd.nextInt(SPIELFELDGROESSE);
            if(!pilzfeld[rndx][rndy].equals("p ")){
                pilzfeld[rndx][rndy] = "p ";
                //System.out.println(rndx + "," + rndy);
                i++;
            }

        }


    }

    public void SpielZuruecksetzen(){//TODO
        spielzuege = SPIELZUEGE;
        score = 0;
        spielfeldZuruecksetzten();
        platzierePilze();
        System.out.println(toString());

    }
    public void aufdecken(String s){
        try {
            String[] eingabe = s.split(",");
            int x = Integer.parseInt(eingabe[1].trim());
            int y = Integer.parseInt(eingabe[0].trim());

            if(pilzfeld[x][y].equals("p ")){
                System.out.println("Gefunden");
                pilzfeld[x][y] = "x ";
                score++;
                spielzuege--;
            }else{
                System.out.println("Nichts gefunden;");
                pilzfeld[x][y] = "o ";
                spielzuege--;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(toString());
    }

    public int getSpielzuege() {
        return spielzuege;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SPIELFELDGROESSE; i++) {
            for (int j = 0; j < SPIELFELDGROESSE; j++) {
                if(pilzfeld[i][j].equals("p ")){
                    sb.append(". ");
                }else{
                    sb.append(pilzfeld[i][j]);
                }


            }
            sb.append("\n");
        }
        sb.append("Gefundene Pilze: ").append(score).append("   Verbleibende Zuege: ").append(spielzuege);
        return sb.toString();
    }
}
