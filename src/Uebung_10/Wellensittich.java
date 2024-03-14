package Uebung_10;

enum Farbe {Gelb, Grün, Blau, Weiss}
public class Wellensittich extends Tier{

    private Farbe farbe;
    public Wellensittich(String name, Farbe farbe){
        super(name);
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Wellensittich{" +
                "Name=" + getName() +
                "Farbe=" + farbe +
                '}';
    }
}
