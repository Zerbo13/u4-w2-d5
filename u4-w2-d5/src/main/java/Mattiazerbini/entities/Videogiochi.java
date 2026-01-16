package Mattiazerbini.entities;

import java.util.Date;

public class Videogiochi extends Gioco{
        private String piattaforma;
        private double durata;
        private Genere genere;

        public enum  Genere{
         Horror,
         Azione,
         Sport,
         GiochiDiRuolo
       }

        public Videogiochi(int Id, String titolo, Date AnnoPubblicazione, double prezzo, String piattaforma, double durata, Genere genere){
            super(Id, titolo, AnnoPubblicazione, prezzo);
            this.piattaforma = piattaforma;
            this.durata = durata;
            this.genere = genere;
        }

        public String getPiattaforma(){
            return piattaforma;
        }

        public double getDurata(){
            return durata;
        }

        public Genere getGenere(){
            return genere;
        }
}
