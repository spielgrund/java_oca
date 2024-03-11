package uebung_08;

public class Program_08 {
    public static void main(String[] args) {
        PilzFeld pf = new PilzFeld(10);
        System.out.println(pf);
        pf.erstellePilze();
        pf.platzierePilze();
        System.out.println(pf);
    }
}
