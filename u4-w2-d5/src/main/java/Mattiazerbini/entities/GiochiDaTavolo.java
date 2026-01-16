package Mattiazerbini.entities;

import java.util.Date;

public class GiochiDaTavolo extends  Gioco{

    private int numeroGiocatori;
    private int durataMedia;

    public GiochiDaTavolo(int Id, String titolo, Date AnnoPubblicazione, double prezzo, int numeroGiocatori, int durataMedia){
        super(Id, titolo, AnnoPubblicazione, prezzo);
        this.durataMedia = durataMedia;

        if(numeroGiocatori < 2 || numeroGiocatori > 10){
            System.out.println("Troppi giocatori per questo gioco");
            this.numeroGiocatori = 2;
        } else {
            this.numeroGiocatori = numeroGiocatori;
        }
    }

    public int getNumeroGiocatori(){
        return numeroGiocatori;
    }

    public int getDurataMedia(){
        return durataMedia;
    }
}
