package Mattiazerbini.entities;

import java.util.Date;

public abstract class Gioco {
    private int Id;
    private String titolo;
    private int AnnoPubblicazione;
    private double prezzo;

    public Gioco(int Id, String titolo, int AnnoPubblicazione, double prezzo) {
        this.Id = Id;
        this.titolo = titolo;
        this.AnnoPubblicazione = AnnoPubblicazione;
        this.prezzo = prezzo;
    }

    public int getId(){
        return Id;
    }

    public String getTitolo(){
        return titolo;
    }

    public int getAnnoPubblicazione(){
        return AnnoPubblicazione;
    }

    public double getPrezzo(){
        return prezzo;
    }
}
