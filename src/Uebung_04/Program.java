package Uebung_04;

public class Program
{
    //Schreibe einen Taschenrechner, der auch in Binär und Hex arbeiten kann
    public static void main(String[] args)
    {

        //Input zwei int gibt einen int zurück. input 3 int gibt einen String zurück. 0 für Binär, 1 für Hex.
        System.out.println(MultiRechner.add(16,16));
        System.out.println(MultiRechner.add(16,16, 0));
        System.out.println(MultiRechner.add(16,16, 1));
        System.out.println("-----------------------\n");
        System.out.println(MultiRechner.subtract(2,3));
        System.out.println(MultiRechner.subtract(2,3, 0));
        System.out.println(MultiRechner.subtract(2,3, 1));
        System.out.println("-----------------------\n");
        System.out.println(MultiRechner.multiply(2,3));
        System.out.println(MultiRechner.multiply(2,3, 0));
        System.out.println(MultiRechner.multiply(2,3, 1));
        System.out.println("-----------------------\n");
        System.out.println(MultiRechner.divide(2,3));
        System.out.println(MultiRechner.divide(2,3, 0));
        System.out.println(MultiRechner.divide(2,3, 1));
        System.out.println(MultiRechner.divide(2,0, 1));
    }


}
