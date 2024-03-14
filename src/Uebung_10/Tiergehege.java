package Uebung_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tiergehege {

    private ArrayList<Tier> al = new ArrayList<>();
    void starteFuetterung(){
        for(Tier t: al){
            t.essen();
        }
    }
    void starteNachtruhe(){
        for(Tier t: al){
            t.schlafen();
        }
    }
    void add(Tier... tl){
        //Collections.addAll(al, tl);
        for(Tier t:tl){
            al.add(t);
        }
        al.addAll(Arrays.asList(tl));
    }



    public ArrayList<Tier> getAl() {
        return al;
    }

    public void setAl(ArrayList<Tier> al) {
        this.al = al;
    }

    void uebergabe(Tiergehege raus, Tiergehege rein){
        rein.setAl(raus.getAl());
        raus.setAl(new ArrayList<>());
        System.out.println("Die Tiere sind jetzt im " + rein.getClass());
    }
}
