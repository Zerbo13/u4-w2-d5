package Mattiazerbini.entities;

import java.util.Date;

public class GiochiDaTavolo extends  Gioco {

    private int numeroGiocatori;
    private int durataMedia;

    public GiochiDaTavolo(int Id, String titolo, int AnnoPubblicazione, double prezzo, int numeroGiocatori, int durataMedia) {
        super(Id, titolo, AnnoPubblicazione, prezzo);
        this.durataMedia = durataMedia;
        this.numeroGiocatori = numeroGiocatori;
    }

            public int getNumeroGiocatori () {
                return numeroGiocatori;
            }

            public int getDurataMedia () {
                return durataMedia;
            }


}