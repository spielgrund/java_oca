package uebung_09;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt{
    int haltbarkeit;

    LocalDate verfallsdatum;

    //Haltbarkeit könnte weg

    VerderblichesProdukt(String name, String beschreibung, int menge,
                         double preis, int haltbarkeit){
        super(name, beschreibung, menge, preis);
        this.haltbarkeit = haltbarkeit;
        verfallsdatum = getDatum().plusDays(haltbarkeit);
    }

    @Override
    public String toString() {
        return "VerderblichesProdukt{" +
                "Name='" + getName() + '\'' +
                ", Beschreibung='" + getBeschreibung() + '\'' +
                ", Menge=" + getMenge() +
                ", Preis=" + getPreis() +
                ", Haltbarkeit=" + haltbarkeit + " Tage " +
                ", Erstellungsdatum=" + getDatum().format(formatter) +
                ", Verfallsdatum=" + verfallsdatum.format(formatter) +
                '}';
    }
}
