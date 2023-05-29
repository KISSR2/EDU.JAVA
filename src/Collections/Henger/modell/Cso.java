package Collections.Henger.modell;

public class Cso extends Rud {
    private double falVastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falVastagsag) {
        super(sugar,magassag,fajsuly);
        this.falVastagsag = falVastagsag;
    }

    public double getFalVastagsag() {
        return falVastagsag;
    }

    public double terfogat(){
        Henger belso = new Henger(getSugar()-falVastagsag,getMagassag());
        return super.terfogat()-belso.terfogat();
    }

    @Override
    public String toString() {
        return super.toString() + " --> A Cső falának vastagsága: "+falVastagsag;
    }
}
