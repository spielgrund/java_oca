package uebung_09;

import java.util.Scanner;

public class ErstellungProdukt {
    public static Produkt Erstellung1(){
        String name = UserInput.getString("Bitte Namen eingeben");
        String beschreibung = UserInput.getString("Bitte Beschreibung eingeben");
        int menge = UserInput.getInt("Bitte Menge eingeben");
        double preis = UserInput.getDouble("Bitte Preis eingeben");

        return new Produkt(name,beschreibung,menge,preis);
    }

    public static VerderblichesProdukt Erstellung2(){
        Produkt p1 = Erstellung1();
        int haltbarkeit = UserInput.getInt("Bitte Haltbarkeit eingeben");

        return new VerderblichesProdukt(p1.getName(),p1.getBeschreibung(),p1.getMenge(),p1.getPreis(),haltbarkeit);
    }



}
