package uebung_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produkt
{
    private LocalDate datum;
    private String name = "";
    private String beschreibung = "";

    private int menge = 0;
    private double preis = 0.00;

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Produkt(){
        this.datum = LocalDate.now();
    }

    public Produkt(String name, String beschreibung, int menge, double preis)
    {
        this.datum = LocalDate.now();
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString()
    {

        return "Produkt{" +
                "Name='" + name + '\'' +
                ", Beschreibung='" + beschreibung + '\'' +
                ", Menge=" + menge +
                ", Preis=" + preis +
                ", Erstellungsdatum=" + datum.format(formatter) +
                '}';
    }
}
