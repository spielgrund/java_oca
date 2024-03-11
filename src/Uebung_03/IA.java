package Uebung_03;

import java.util.Arrays;
import java.util.Random;

public class IA
{
    int[] arr = new int[100];

    IA()
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(10);
        }

    }

    public int[] getAnzahlZahlen()
    {

        int[] anzahlzahlen = new int[10];
        for (int i = 0; i < 10 ; i++)
        {
            anzahlzahlen[i] = getAnzahl(i, arr);
        }
        return anzahlzahlen;
    }

    public String[] getAnzahlZahlenString()
    {

        String[] anzahlzahlen = new String[10];
        for (int i = 0; i < 10 ; i++)
        {
            anzahlzahlen[i] = getAnzahl(i, arr) + " mal " + i;
        }
        return anzahlzahlen;
    }

    public int[] fastCount()
    {
        int[] anzahlzahlen = new int[10];

        for (int index : arr)
        {
            anzahlzahlen[index]++;
        }
        return anzahlzahlen;
    }

    int getAnzahl(int i, int[] arr)
    {
        int anzahl = 0;
        for (int number : arr)
        {
            if (number == i)
            {
                anzahl++;
            }

        }
        return anzahl;
    }


    @Override
    public String toString()
    {
        return Arrays.toString(arr);
    }
}
