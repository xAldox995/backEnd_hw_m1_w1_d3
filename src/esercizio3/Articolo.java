package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void aggiornaPezziDisponibili(int quantitaVenduta) {
        if (pezziDisponibili >= quantitaVenduta) {
            pezziDisponibili -= quantitaVenduta;
        } else {
            System.out.println("Non ci sono abbastanza pezzi disponibili per l'articolo: " + descrizione);
        }
    }

    public void stampaDettagli() {
        System.out.println("Codice Articolo: " + codiceArticolo);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Pezzi disponibili: " + pezziDisponibili);
    }
}
