package uebung_09;

import java.util.Scanner;

public class ErstellungVerderblichesProdukt
{

    public static VerderblichesProdukt Erstellung()
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String beschreibung;
        int menge = 0;
        double preis = 0.00;
        int haltbarkeit = 0;
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
        System.out.println("Haltbarkeit: ");
        try
        {
            haltbarkeit = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        return new VerderblichesProdukt(name,beschreibung,menge,preis,haltbarkeit);
    }



}
