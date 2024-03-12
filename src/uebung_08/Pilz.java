package uebung_08;

import java.awt.*;
import java.util.Objects;


public class Pilz {
    Point position = new Point();

    private String zeichen = ". ";

    int score = 1;

    int abzug = 1;

    public void setPosition(int x, int y){
        position.x = x;
        position.y = y;
    }

    public void aufgedeckt(){
        zeichen = "x ";
        System.out.println(UiUtils.PILZ);
    }

    public void setZeichen(String s){
        zeichen = s;
    }
    public String getZeichen() {
        return zeichen;
    }

    public int getScore() {
        return score;
    }

    public int getAbzug() {
        return abzug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilz pilz = (Pilz) o;
        return score == pilz.score && abzug == pilz.abzug;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, abzug);
    }

    @Override
    public String toString() {
        return "Pilz{" +
                "position=" + position +
                ", score=" + this.score +
                ", abzug=" + this.abzug +
                '}';
    }
}
