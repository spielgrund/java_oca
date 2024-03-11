package Uebung_03;

import java.util.Arrays;

public class Program
{
    public static void main(String[] args)
    {
//        Quader q = new Quader(2,3,4);
//        System.out.println(q.getVolumen());
//        System.out.println(q.getSeitenLaenge());
//        System.out.println(q.getOberflaeche());
//        System.out.println(q);
//        System.out.println("---------------------------------\n\n");


        IA ia = new IA();
        System.out.println(ia);
        System.out.println(Arrays.toString(ia.getAnzahlZahlen()));
        System.out.println(ia.getAnzahlZahlen().length);
        System.out.println(Arrays.toString(ia.getAnzahlZahlenString()));
        System.out.println(ia.getAnzahlZahlenString().length);
        System.out.println(Arrays.toString(ia.fastCount()));
        System.out.println(ia.fastCount().length);


    }
}
