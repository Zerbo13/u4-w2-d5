package Mattiazerbini.entities;

import java.util.Date;

public class GiochiDaTavolo {
    private int IdGioco;
    private String titolo;
    private Date AnnoPubblicazione;
    private double prezzo;
    private int numeroGiocatori;
    private int durataMedia;

    public GiochiDaTavolo(int IdGioco, String titolo, Date AnnoPubblicazione, double prezzo, int numeroGiocatori, int durataMedia){
        this.IdGioco = IdGioco;
        this.titolo = titolo;
        this.AnnoPubblicazione = AnnoPubblicazione;
        this.prezzo = prezzo;
        this.numeroGiocatori = numeroGiocatori;
        this.durataMedia = durataMedia;
    }

    public int getIdGioco(){
        return IdGioco;
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

    public int getNumeroGiocatori(){
        return numeroGiocatori;
    }

    public int getDurataMedia(){
        return durataMedia;
    }
}
