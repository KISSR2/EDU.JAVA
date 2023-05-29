package Collections.Henger.modell;

public class Henger {

    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat(){
        return sugar*sugar*Math.PI*magassag;
    }


    @Override
    public String toString() {
        return "A Henger sugara: "+sugar+" cm | magassága: "+magassag+" cm | térfogata: "+String.format("%.2f",terfogat())+" cm3";
    }
}
