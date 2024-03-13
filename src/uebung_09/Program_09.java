package uebung_09;

import java.util.Scanner;

public class Program_09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Lager l = new Lager();


        schleife:
        while(true)
        {
            System.out.println("\nBitte Menüpunkt wählen:");
            System.out.println("1. Produkt erstellen.");
            System.out.println("2. VerderblichesProdukt erstellen.");
            System.out.println("3. Produkte ausgeben.");
            System.out.println("4. Beenden.");

            int choice = UserInput.getInt("");

            switch (choice)
            {
                case 1:
                    l.add(ErstellungProdukt.Erstellung1());
                    break;

                case 2:
                    l.add(ErstellungProdukt.Erstellung2());
                    break;

                case 3:
                    l.ausgabe();
                    break;

                case 4:
                    System.out.println("Auf Wiedersehen!");
                    break schleife;

                default:
                    System.out.println("Bitte 1-4 wählen.");

            }

        }


    }
}
