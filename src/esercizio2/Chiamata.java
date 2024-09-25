package esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durataChiamata;

    public Chiamata(String numeroChiamato, double durataChiamata) {
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }

    public String getDettagliChiamata() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durataChiamata + " minuti";
    }

    public void stampaChiamata() {
        System.out.println(getDettagliChiamata());
    }

}
