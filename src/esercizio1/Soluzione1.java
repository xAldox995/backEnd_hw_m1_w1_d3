package esercizio1;

public class Soluzione1 {
    private double altezza;
    private double base;

    public Soluzione1(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double areaRettangolo() {
        return base * altezza;
    }

    public double perimetroRettangolo() {
        return 2 * (base + altezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + areaRettangolo());
        System.out.println("Perimetro: " + perimetroRettangolo());
    }

    public static void stampaDueRettangoli(Soluzione1 r1, Soluzione1 r2) {
        System.out.println("Dati primo rettangolo");
        r1.stampaRettangolo();

        System.out.println("\nDati primo rettangolo");
        r2.stampaRettangolo();

        double sommaAree = r1.areaRettangolo() + r2.areaRettangolo();
        double sommaPerimetri = r1.perimetroRettangolo() + r2.perimetroRettangolo();

        System.out.println("\n Somma delle Aree: " + sommaAree);
        System.out.println("Somma dei Perimetri: " + sommaPerimetri);

    }
}
