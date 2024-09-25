package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
    private double totCarrello;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totCarrello = 0.0;
    }

    public void aggiungiArticolo (Articolo articolo, int quantita) {
        if (articolo.getPezziDisponibili() >= quantita) {
            articoli.add(articolo);
            totCarrello += articolo.getPrezzo()*quantita;
            articolo.aggiornaPezziDisponibili(quantita);
        } else {
            System.out.println("Quantità non disponibile per l'articolo:" + articolo.getDescrizione());
        }
    }

    public void stampaRiepilogo(){
        System.out.println("Cliente: " + cliente.getNomeCompleto());
        System.out.println("Articoli nel carrello: ");
        for (Articolo articolo : articoli) {
            articolo.stampaDettagli();
        }
        System.out.println("Tot Carrello: " + totCarrello + " €");
    }

}
