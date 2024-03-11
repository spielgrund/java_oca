package uebung_05;

import java.util.Arrays;

// TODO: Aufgabe: Schreibe eine Simmulation für ein Parkhaus mit 20 Parkplätzen
// Es können in dem Parkhaus Fahrzeuge geparkt werden
// Jedes Fahrzeug hat eine Marke, Typ, Kennzeichen und Baujahr
// Die Fahrzeuge werden beim Parken in ein Array abgelegt
// Schreibe eine Methode, mit der Inhalt des Pakhauses angezeigt werden kann
public class Parkhaus
{
    final int KAPAZITAET = 20;
    private Fahrzeug[] parkplaetze = new Fahrzeug[KAPAZITAET];
    private int belegteparkplaetze = 0;

    private int naechsterfreierparkplatz = 0;

    public String einparken(Fahrzeug fahrzeug)
    {
        int _parkplatz;
        if (belegteparkplaetze < KAPAZITAET)
        {
            parkplaetze[naechsterfreierparkplatz] = fahrzeug;
            belegteparkplaetze++;
            _parkplatz = naechsterfreierparkplatz;
            this.findefreienParkplatz();
        }
        else
        {
         return "Parkhaus ist voll!";
        }
        return "Fahrzeug " + fahrzeug.getKennzeichen() + " wurde eingeparkt bei " + _parkplatz;
    }

    public String ausparken(Fahrzeug f)
    {
        int i = 0;
        for (Fahrzeug fgeparkt : parkplaetze)
        {
            if(fgeparkt.getKennzeichen() == null) continue;

            if(fgeparkt.getKennzeichen().equals(f.getKennzeichen()))
            {
                parkplaetze[i] = null;
                belegteparkplaetze--;

                findefreienParkplatz();
                return "Fahrzeug " + f.getKennzeichen() +  " wurde ausgeparkt von " + i;
            }

            i++;
        }
        return "Fahrzeug " + f.getKennzeichen() + " wurde nicht gefunden!";
    }

    private void findefreienParkplatz()
    {
        for (int i = 0; i < parkplaetze.length; i++)
        {
            if(parkplaetze[i] == null)
            {
                naechsterfreierparkplatz = i;
                //System.out.println(i);
                break;
            }

        }
    }

    public int getBelegteparkplaetze()
    {
        return belegteparkplaetze;
    }

    final void setBelegteparkplaetze(int belegteparkplaetze)
    {
        this.belegteparkplaetze = belegteparkplaetze;
    }

    public int getNaechsterfreierparkplatz()
    {
        return naechsterfreierparkplatz;
    }

    final void setNaechsterfreierparkplatz(int naechsterfreierparkplatz)
    {
        this.naechsterfreierparkplatz = naechsterfreierparkplatz;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(parkplaetze)
                + "\n Kapazität: " + belegteparkplaetze + "/" + KAPAZITAET
                + "\n Nächster freier Parkplatz " + naechsterfreierparkplatz;
    }
}
