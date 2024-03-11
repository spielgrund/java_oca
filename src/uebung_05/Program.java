package uebung_05;



public class Program
{
    public static void main(String[] args)
    {
        Parkhaus p1 = new Parkhaus();
        Fahrzeug f1 = new Fahrzeug("Audi", "A4", "1", 2024);
        Fahrzeug f2 = new Fahrzeug("Ford", "Fiesta", "2", 2000);
        Fahrzeug f3 = new Fahrzeug("Opel", "Corsa", "3", 2010);
        Fahrzeug f4 = new Fahrzeug("Mercedes", "C-Klasse", "4", 2020);
        System.out.println(p1.einparken(f1));
        System.out.println(p1.einparken(f2));
        System.out.println(p1.einparken(f3));

        System.out.println(p1);
        System.out.println("------------------------------------");
        System.out.println(p1.ausparken(f2));
        System.out.println(p1);
        System.out.println("------------------------------------");
        System.out.println(p1.einparken(f4));
        System.out.println("------------------------------------");
        System.out.println(p1);
        System.out.println("------------------------------------");
        System.out.println(p1.einparken(f2));

        System.out.println(p1);



    }


}
