package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroDiTelefono;
    private double credito;
    private List<Chiamata> listaChiamate;

    public SIM (String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito= 0.0;
        this.listaChiamate = new ArrayList <>();
    }

    public void aggiungiChiamate (Chiamata call) {
        if (listaChiamate.size() == 5) {
            listaChiamate.remove(0);
        }
        listaChiamate.add(call);
    }

    public void stampaDatiSIM () {
        System.out.println("Numero di telefono " + numeroDiTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiate effetuate: ");
        if (listaChiamate.isEmpty()){
            System.out.println("Nessuna chiamata effettuata");
        }else {
            for (Chiamata call : listaChiamate) {
                call.stampaChiamata();
            }
        }
    }
    public void ricarica (double importo) {
        if (importo > 0){
            credito += importo;
        }
    }
}
