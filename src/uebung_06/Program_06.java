package uebung_06;

import java.util.Scanner;

public class Program_06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Spielfeld sf = new Spielfeld(10);
        Roboter r1 = new Roboter(sf.getSpielfeldGroesse());
        sf.setBlank();
        sf.platziereRoboter(r1);
        System.out.println(sf);


        while(true)
        {
            System.out.println("Bitte Befehle geben: ");
            System.out.println("(/help für Hilfe, /exit zum beenden.)");
            String s = sc.next().toLowerCase().strip();

            if(s.equals("/help"))
                {
                    System.out.println("w = move Up, s = move Down, a = move Left, d = move Right\n"
                                        +"l = turn Left, r = turn Right f = move Forward, b = move Backwards");
                }
            else if (s.equals("/exit"))
            {
                System.out.println("Auf Wiedersehen!");
               break;
            }
            else
            {
                r1.setAbfolge(s);
            }
            while (!r1.abfolge.isEmpty())
            {
                sf.setBlank();
                r1.abfolgeAbarbeiten();
                sf.platziereRoboter(r1);
                System.out.println(sf);
                System.out.println(r1.getPosition());

            }

        }

    }
}
