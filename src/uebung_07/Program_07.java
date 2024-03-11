package uebung_07;

import java.util.Date;
import java.util.Scanner;

public class Program_07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Liste l = new Liste();

        schleife:
        while(true)
        {
            System.out.println("\nBitte Menüpunkt wählen:");
            System.out.println("1. Produkt erstellen.");
            System.out.println("2. Produkte ausgeben.");
            System.out.println("3. Beenden.");

            int c = 3;
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
                    l.ausgabe();
                    break;

                case 3:
                    System.out.println("Auf Wiedersehen!");
                    break schleife;

            }

        }


    }
}
