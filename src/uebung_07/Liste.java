package uebung_07;

import java.util.ArrayList;

public class Liste
{
    ArrayList<Produkt> liste = new ArrayList<>();

    public void add(Produkt produkt)
    {
        System.out.println(produkt.name + " wurde hinzugefügt.");
        liste.add(produkt);
    }

    public void ausgabe()
    {
        for(Produkt p : liste)
        {
            System.out.println(p);
        }
    }
}
