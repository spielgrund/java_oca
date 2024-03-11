package uebung_07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Produkt
{
    LocalDate datum;
    String name = "";
    String beschreibung = "";

    int menge = 0;
    double preis = 0.00;

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Produkt()
    {}

    public Produkt(String name, String beschreibung, int menge, double preis)
    {
        this.datum = LocalDate.now();
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }

    @Override
    public String toString()
    {

        return "Produkt{" +
                "Erstellungsdatum=" + datum.format(formatter) +
                ", Name='" + name + '\'' +
                ", Beschreibung='" + beschreibung + '\'' +
                ", Menge=" + menge +
                ", Preis=" + preis +
                '}';
    }
}
