package Uebung_01;

public class RechnerTest
{
    public static void main(String[] args)
    {
        Rechner rechner = new Rechner();
        System.out.println(rechner.add(1,2));
        System.out.println(rechner.subtract(1,2));
        System.out.println(rechner.multiply(1,2));
        System.out.println(rechner.divide(1,2));
        rechner.ausgabeProtokoll();
    }
}
