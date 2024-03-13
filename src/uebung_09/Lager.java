package uebung_09;

import java.util.ArrayList;

public class Lager
{
    ArrayList<Produkt> liste = new ArrayList<>();

    public void add(Produkt produkt)
    {
        System.out.println(produkt.getName() + " wurde hinzugefügt.");
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
