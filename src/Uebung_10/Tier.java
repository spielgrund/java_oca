package Uebung_10;

public class Tier implements Sozialisiere {
    private String name = "";

    public Tier(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void essen() {
        System.out.println(getName() + " isst gerade.");
    }

    @Override
    public void schlafen() {
        System.out.println(getName() + " schläft jetzt.");
    }
}
