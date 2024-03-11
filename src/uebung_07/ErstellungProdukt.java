package uebung_07;

import java.util.Scanner;

public class ErstellungProdukt
{

    public static Produkt Erstellung()
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String beschreibung;
        int menge = 0;
        double preis = 0.00;
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Beschreibung: ");
        beschreibung = sc.nextLine();

        System.out.println("Menge: ");
        try
        {
            menge = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Preis: ");
        try
        {
            preis = Double.parseDouble(sc.nextLine());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        return new Produkt(name,beschreibung,menge,preis);
    }



}
