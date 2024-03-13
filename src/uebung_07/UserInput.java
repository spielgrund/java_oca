package uebung_07;

import java.util.Scanner;

public class UserInput {
    static Scanner sc = new Scanner(System.in);

    static int getInt(String anfrage){
        while(true){
            try {
                System.out.println(anfrage);
                int i = Integer.parseInt(sc.nextLine().trim());
                return i;

            }catch (Exception e){
                //System.out.println(e.getMessage());
                System.out.println("Bitte nur Zahlen eingeben!");
            }


        }
    }
    static double getDouble(String anfrage){
        while(true){
            try {
                System.out.println(anfrage);
                double d = Double.parseDouble(sc.nextLine().trim());
                return d;

            }catch (Exception e){
                //System.out.println(e.getMessage());
                System.out.println("Bitte nur Double eingeben! (0.00)");
            }


        }
    }
    static String getString(String anfrage){
        while(true){
            try {
                System.out.println(anfrage);
                String s = sc.nextLine().trim();
                return s;

            }catch (Exception e){
                //System.out.println(e.getMessage());
                System.out.println("Bitte Zeichenfolge eingeben!");
            }


        }
    }

    static char getChar(String anfrage){
        while(true){
            try {
                System.out.println(anfrage);

                String s = sc.nextLine().trim();
                if(s.length()==1){
                    return s.charAt(0);
                }


            }catch (Exception e){
                //System.out.println(e.getMessage());
                System.out.println("Bitte nur ein Zeichen eingeben");
            }


        }
    }
}
