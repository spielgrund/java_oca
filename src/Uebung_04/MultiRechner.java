package Uebung_04;

public class MultiRechner
{
    public static int add (int a, int b)
    {
        return a + b;
    }

    public static String add (int a, int b, int c)
    {
        String s = "Bitte 0 für Binär und 1 für Hex als Argument beigeben";
        switch (c)
        {
            case 0:
                s = "0b" + Integer.toBinaryString(a+b);
                break;
            case 1:
                s =  "0x" + Integer.toHexString(a + b);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

        return s;

    }

    public static int subtract (int a, int b)
    {
        return a - b;
    }

    public static String subtract (int a, int b, int c)
    {
        String s = "Bitte 0 für Binär und 1 für Hex als Argument beigeben";
        switch (c)
        {
            case 0:
                s = "0b" + Integer.toBinaryString(a+b);
                break;
            case 1:
                s =  "0x" + Integer.toHexString(a + b);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

        return s;
    }

    public static int multiply (int a, int b)
    {
        return a * b;
    }

    public static String multiply (int a, int b, int c)
    {
        String s = "Bitte 0 für Binär und 1 für Hex als Argument beigeben";
        switch (c)
        {
            case 0:
                s = "0b" + Integer.toBinaryString(a+b);
                break;
            case 1:
                s =  "0x" + Integer.toHexString(a + b);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

        return s;
    }

    public static int divide (int a, int b)
    {
        if (b != 0)
        {
            return a + b;
        }
        else
        {
            return 0;
        }
    }

    public static String divide (int a, int b, int c)
    {
        if (b != 0)
        {
            String s = "Bitte 0 für Binär und 1 für Hex als Argument beigeben";
            switch (c)
            {
                case 0:
                    s = "0b" + Integer.toBinaryString(a+b);
                    break;
                case 1:
                    s =  "0x" + Integer.toHexString(a + b);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + c);
            }

            return s;
        }
        else
        {
            return "Bitte nicht durch 0 teilen";
        }
    }
}
