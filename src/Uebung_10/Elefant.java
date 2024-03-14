package Uebung_10;

public class Elefant extends Tier{

    private Boolean stosszaehne;
    public Elefant(String name, Boolean stosszaehne){
        super(name);
        this.stosszaehne = stosszaehne;
    }

    @Override
    public String toString() {
        return "Wellensittich{" +
                "Name=" + getName() +
                "Stosszähne=" + stosszaehne +
                '}';
    }
}
