package uebung_09;

import java.util.Scanner;

public class Program_09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Liste l = new Liste();
        VerderblichesProdukt vp = new VerderblichesProdukt("Apfel","Ein Apfel"
        ,5, 0.99, 30);
        System.out.println(vp);

        schleife:
        while(true)
        {
            System.out.println("\nBitte Menüpunkt wählen:");
            System.out.println("1. Produkt erstellen.");
            System.out.println("2. VerderblichesProdukt erstellen.");
            System.out.println("3. Produkte ausgeben.");
            System.out.println("4. Beenden.");

            int c = 4;
            try
            {
                c = sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Bitte 1, 2 oder 3 wählen.");
            }
            switch (c)
            {
                case 1:
                    l.add(ErstellungProdukt.Erstellung());
                    break;

                case 2:
                    l.add(ErstellungVerderblichesProdukt.Erstellung());
                    break;

                case 3:
                    l.ausgabe();
                    break;

                case 4:
                    System.out.println("Auf Wiedersehen!");
                    break schleife;

            }

        }


    }
}
