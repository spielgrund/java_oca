package uebung_08;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PilzFeld extends AbstractSpielfeld {

    static Random random = new Random();

    String[][] arr = new String[SPIELFELDGROESSE][SPIELFELDGROESSE];

    ArrayList<Pilz> pilze = new ArrayList<>();

    public PilzFeld(int spielfeldgroesse){
        leeresFeld();
    }

    private void leeresFeld(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "0";
            }

        }
    }
    
    public void erstellePilze(){
        ArrayList<Point> points = new ArrayList<>();

        int i = 0;
        while(i < ANZAHLPILZE){
            int x = random.nextInt(SPIELFELDGROESSE);
            int y = random.nextInt( SPIELFELDGROESSE);
            Point p = new Point(x,y);
            points.add(p);
            i++;
            }

        for(Point p: points) {
            Pilz pilz = new Pilz();
            pilz.setPosition(p.x,p.y);
            pilze.add(pilz);

        }
    }

    public void platzierePilze(){
        for(Pilz pilz: pilze){
            arr[pilz.getX()][pilz.getY()] = "p";
        }
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
