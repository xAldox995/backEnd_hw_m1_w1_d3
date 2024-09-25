package esercizio3;

import java.time.LocalDate;

public class Cliente {
    private static int counter = 1;
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;


    private static String generaCodiceCliente() {
        return "U" + String.format("%04d", counter++);
    }

    public Cliente(String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = generaCodiceCliente();
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public void stampaDettagliCliente() {
        System.out.println("Codice Cliente: " + codiceCliente);
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Email: " + email);
        System.out.println("Data Iscrizione: " + dataIscrizione);
    }

}

