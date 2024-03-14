package Uebung_10;

public class Program_10_Tiergehege {
    public static void main(String[] args) {
        System.out.println("Willkommen im Zoo!");
        System.out.println();
        Tiergehege t = new Tiergehege();
        Wellensittich w1 = new Wellensittich("Flori", Farbe.Grün);
        Wellensittich w2 = new Wellensittich("Hansi", Farbe.Blau);
        Elefant e1 = new Elefant("Hannibal", true);
        Elefant e2 = new Elefant("Elfie", false);


        t.add(w1);
        t.add(w2);
        t.add(e1, e2);
        t.starteFuetterung();
        //t.starteNachtruhe();
        Aussengehege a = new Aussengehege();
        System.out.println("---------------------------");

        t.uebergabe(t,a);
        a.starteFuetterung();
        a.uebergabe(a,t);
        t.starteNachtruhe();



    }
}
