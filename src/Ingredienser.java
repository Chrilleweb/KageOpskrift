public class Ingredienser {
    private String navn;
    private String måleenhed;
    private double mængde;
    private double enhedsVægt;
    private double energiIndhold;
    private int antal;


    public Ingredienser(String navn, double mængde, String måleenhed, double enhedsVægt, double energiIndhold){
        this.navn = navn;
        this.mængde = mængde;
        this.måleenhed = måleenhed;
        this.enhedsVægt = enhedsVægt;
        this.energiIndhold = energiIndhold;
    }

    public Ingredienser(String navn, double mængde, String måleenhed, double energiIndhold){
        this.navn = navn;
        this.mængde = mængde;
        this.måleenhed = måleenhed;
        this.enhedsVægt = 1;
        this.energiIndhold = energiIndhold;
    }


    public String getNavn(){
        return navn;
    }


    public double getMængde1(){
        double beregnMængde = mængde / 2 * antal;
        return beregnMængde;
    }
    public String getMåleenhed(){
        return måleenhed;
    }

    public double getEnhedsVægt(){
        double vægt = getMængde1() * enhedsVægt;
        return vægt;
    }
    public double getEnergiIndhold(){
        double energi = getMængde1() * energiIndhold;
        double energi1 = (Math.round(energi));
        return energi1;
    }

    public double getKiloj(){
       double kiloJ = getEnergiIndhold() * 4.2;
       double kiloj1 = (Math.round(kiloJ));
       return kiloj1;
    }

    public void setAntal(int antal){
        this.antal = antal;
    }

    public String toString(){
        return getMængde1() + " " + måleenhed + " " + navn;
    }

    public String ingredienserVægt(){
        return getEnhedsVægt() + " gram" + " " + navn;
    }

    public String energi(){
        return navn + ": " + getEnergiIndhold() + " " + " Kalorie indhold";
    }

    public String getKiloJoule(){
        return navn + ": " + getKiloj() + " " + " Kilo Joule";
    }


}


