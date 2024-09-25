import esercizio1.Soluzione1;
import esercizio2.Chiamata;
import esercizio2.SIM;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        Soluzione1 r1 = new Soluzione1(3,1);
        Soluzione1 r2 = new Soluzione1(5,3);

        System.out.println("Dati di un rettangolo: ");
        r1.stampaRettangolo();

        System.out.println("\n Stampa dei due rettangoli: ");
        Soluzione1.stampaDueRettangoli(r1,r2);

        System.out.println("Esercizio 2");

        SIM sim = new SIM("3475958876");
        sim.ricarica(20.0);

        System.out.println("Dati della tua Sim");
        sim.stampaDatiSIM();

        sim.aggiungiChiamate(new Chiamata("0804672151", 21.50));
        sim.aggiungiChiamate(new Chiamata("3937484514", 07.10));
        sim.aggiungiChiamate(new Chiamata("0804602171", 08.20));
        sim.aggiungiChiamate(new Chiamata("1250935129", 01.10));
        sim.aggiungiChiamate(new Chiamata("1234567890", 00.20));
        sim.aggiungiChiamate(new Chiamata("3209988756", 11.20));
        sim.aggiungiChiamate(new Chiamata("3901234098", 15.29));

        System.out.println("Dati della SIM dopo le Chiamte");
        sim.stampaDatiSIM();

        System.out.println("Esercizio3");

        Articolo articolo1 = new Articolo("A001", "Smartphone", 299.99, 10);
        Articolo articolo2 = new Articolo("A002", "Laptop", 899.99, 5);
        Articolo articolo3 = new Articolo("A003", "Tablet", 199.99, 15);

        Cliente cliente1 = new Cliente("Mario", "Rossi", "mario.rossi@example.com", LocalDate.of(2021, 5, 10));
        Cliente cliente2 = new Cliente("Luigi", "Bianchi", "luigi.bianchi@example.com", LocalDate.of(2022, 7, 15));

        cliente1.stampaDettagliCliente();
        System.out.println();
        cliente2.stampaDettagliCliente();

        Carrello cart = new Carrello(cliente1);

        cart.aggiungiArticolo(articolo1, 2);
        cart.aggiungiArticolo(articolo2, 1);
        cart.aggiungiArticolo(articolo3, 3);

        System.out.println("\nRiepilogo Carrello:");
        cart.stampaRiepilogo();
    }
}