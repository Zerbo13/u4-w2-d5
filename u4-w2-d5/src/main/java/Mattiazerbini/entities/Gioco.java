package Mattiazerbini.entities;

import java.util.Date;

public abstract class Gioco {
    private int Id;
    private String titolo;
    private Date AnnoPubblicazione;
    private double prezzo;

    public Gioco(int IdGioco, String titolo, Date AnnoPubblicazione, double prezzo) {
        this.Id = Id;
        this.titolo = titolo;
        this.AnnoPubblicazione = AnnoPubblicazione;
        this.prezzo = prezzo;
    }

    public int getIdGioco(){
        return Id;
    }

    public String getTitolo(){
        return titolo;
    }

    public Date getAnnoPubblicazione(){
        return AnnoPubblicazione;
    }

    public double getPrezzo(){
        return prezzo;
    }
}
