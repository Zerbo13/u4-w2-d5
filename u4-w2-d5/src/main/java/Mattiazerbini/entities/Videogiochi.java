package Mattiazerbini.entities;

import java.util.Date;

public class Videogiochi {
        private int IdVideogioco;
        private String titolo;
        private Date AnnoPubblicazione;
        private double prezzo;
        private String piattaforma;
        private double durata;
        private Genere genere;

        public enum  Genere{
         Horror,
         Azione,
         Sport,
         GiochiDiRuolo
       }

        public Videogiochi(int IdVideogioco, String titolo, Date AnnoPubblicazione, double prezzo, String piattaforma, double durata, Genere genere){
            this.IdVideogioco = IdVideogioco;
            this.titolo = titolo;
            this.AnnoPubblicazione = AnnoPubblicazione;
            this.prezzo = prezzo;
            this.piattaforma = piattaforma;
            this.durata = durata;
            this.genere = genere;
        }

        public int getIdVideogioco(){
            return IdVideogioco;
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
