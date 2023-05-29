package Collections.Henger.modell;

public class Rud extends Henger {
    private double fajsuly;

    public Rud(double sugar, double magassag,double fajsuly) {
        super(sugar, magassag);
        this.fajsuly=fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly(){
        return terfogat()*fajsuly;
    }

    @Override
    public String toString() {
        return super.toString() + " --> A Rúd fajsúlya: "+fajsuly;
    }
}
