package uebung_08;

public class GiftPilz extends Pilz{
    int score = 0;

    int abzug = 3;

    private String zeichen = ". ";

    public void aufgedeckt(){
        zeichen = "g ";
        System.out.println(UiUtils.GIFTPILZ);
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
        return "Giftpilz{" +
                "position=" + position +
                ", score=" + this.score +
                ", abzug=" + this.abzug +
                '}';
    }
}
