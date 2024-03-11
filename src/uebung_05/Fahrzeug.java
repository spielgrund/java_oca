package uebung_05;

// TODO: Aufgabe: Schreibe eine Simmulation für ein Parkhaus mit 20 Parkplätzen
// Es können in dem Parkhaus Fahrzeuge geparkt werden
// Jedes Fahrzeug hat eine Marke, Typ, Kennzeichen und Baujahr
// Die Fahrzeuge werden beim Parken in ein Array abgelegt
// Schreibe eine Methode, mit der Inhalt des Pakhauses angezeigt werden kann
public class Fahrzeug
{
    private String marke;
    private String typ;
    private String kennzeichen;
    private int baujahr;

    public Fahrzeug() {}

    public Fahrzeug(String marke, String typ, String kennzeichen, int baujahr)
    {
        this.marke = marke;
        this.typ = typ;
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
    }

    public String getMarke()
    {
        return marke;
    }

    public void setMarke(String marke)
    {
        this.marke = marke;
    }

    public String getTyp()
    {
        return typ;
    }

    public void setTyp(String typ)
    {
        this.typ = typ;
    }

    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen)
    {
        this.kennzeichen = kennzeichen;
    }

    public int getBaujahr()
    {
        return baujahr;
    }

    public void setBaujahr(int baujahr)
    {
        this.baujahr = baujahr;
    }

    @Override
    public String toString()
    {
        return "Fahrzeug{" +
                "Marke='" + marke + '\'' +
                ", Typ='" + typ + '\'' +
                ", Kennzeichen='" + kennzeichen + '\'' +
                ", Baujahr=" + baujahr +
                '}';
    }
}
