public class Riistkulik extends Kujund {
//    objekti omadused - klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;

    public Riistkulik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.setNurkadeOlemasolu(true);
        this.setNurkadeArv(4);
        this.nurk = 90;
        System.out.println("Riistküliku klassi konstruktor");
    }

    @Override
    public void valjastaKirjeldus() {
        System.out.println("Riistküliku klassi valjastaKirjeldus()");
        System.out.println(this.getNimetus());
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
        if(this.getNurkadeOlemasolu()){
            System.out.println("Kokku on " + this.getNurkadeArv() + " nurka.");
        }
        System.out.println("Nurgad on " + this.nurk + " kraadi.");
    }
}