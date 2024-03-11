package Uebung_01;

public class Rechner
{
    private String protokoll = "";

    public void ausgabeProtokoll()
    {
        System.out.println(protokoll);
    }
    public float add(float x, float y)
    {
        float ergebnis = x + y;
        String s = x + " + " + y +  " = " + ergebnis;
        protokoll = protokoll + "\n" + s;
        return ergebnis;
    }

    public float subtract(float x, float y)
    {
        float ergebnis = x - y;
        String s = x + " - " + y +  " = " + ergebnis;
        protokoll = protokoll + "\n" + s;
        return ergebnis;
    }

    public float multiply(float x, float y)
    {
        float ergebnis = x * y;
        String s = x + " * " + y +  " = " + ergebnis;
        protokoll = protokoll + "\n" + s;
        return ergebnis;
    }

    public float divide(float x, float y)
    {
        if(y != 0)
        {
            float ergebnis = x / y;
            String s = x + " / " + y +  " = " + ergebnis;
            protokoll = protokoll + "\n" + s;
            return ergebnis;
        }
        else
        {
            System.out.println("Bitte nicht durch 0 teilen!");
        }
        return -1;

    }
}
