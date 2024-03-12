package uebung_09;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt{
    int haltbarkeit;

    LocalDate verfallsdatum;

    VerderblichesProdukt(String name, String beschreibung, int menge,
                         double preis, int haltbarkeit){
        super(name, beschreibung, menge, preis);
        this.haltbarkeit = haltbarkeit;
        verfallsdatum = this.datum.plusDays(haltbarkeit);
    }

    @Override
    public String toString() {
        return "VerderblichesProdukt{" +
                "Name='" + name + '\'' +
                ", Beschreibung='" + beschreibung + '\'' +
                ", Menge=" + menge +
                ", Preis=" + preis +
                ", Haltbarkeit=" + haltbarkeit + " Tage " +
                ", Erstellungsdatum=" + datum.format(formatter) +
                ", Verfallsdatum=" + verfallsdatum.format(formatter) +
                '}';
    }
}
