package uebung_08;

public class leeresFeld extends Pilz{
    int score = 0;

    int abzug = 1;

    private String zeichen = ". ";
    public void aufgedeckt(){
        zeichen = "o ";
        System.out.println(UiUtils.LEERESFELD);
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
    public String toString() {
        return "leeres Feld{" +
                "position=" + position +
                ", score=" + this.score +
                ", abzug=" + this.abzug +
                '}';
    }
}
