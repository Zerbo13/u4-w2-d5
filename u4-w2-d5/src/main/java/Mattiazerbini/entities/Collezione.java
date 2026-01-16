package Mattiazerbini.entities;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
    private List<Gioco> giochi = new ArrayList<>();

    //CONTROLLO SE ID INSERITO è UGUALE AD UN ALTRO ID ED AGGIUNGE IL GIOCO
    public boolean aggiungiGioco(Gioco gioco) {
        for (Gioco g : giochi) {
            if (g.getId() == gioco.getId()) {
                System.out.println("ID gìà presente!");
                return false;
            }
        }
        giochi.add(gioco);
        return true;
    }

    //RICERCA GIOCO PER ID
    public Gioco ricercaId(int Id) {
        for (Gioco g : giochi) {
            if (g.getId() == Id) {
                return g;
            }
        }
        return null;
    }

    //RICERCA GIOCHI PER PREZZO E RESTITUISCE QUELLI CON PREZZO INFERIORE
    public List<Gioco> ricercaPrezzo(double prezzoMassimo) {
        return giochi.stream()
                .filter(g -> g.getPrezzo() < prezzoMassimo)
                .collect(Collectors.toList());
    }

    //RICERCA DEL GIOCO DA TAVOLO PER IL NUMERO DI GIOCATORI
    public List<GiochiDaTavolo> ricercaNumGiocatori(int numGiocatori) {
        return giochi.stream()
                .filter(g -> g instanceof GiochiDaTavolo)
                .map(g -> (GiochiDaTavolo) g)
                .filter(giochiTavolo -> giochiTavolo.getNumeroGiocatori() == numGiocatori)
                .collect(Collectors.toList());
    }

    //RIMUOVE IL GIOCO TRAMITE ID
    public boolean rimuoviGioco(int Id) {
        return giochi.removeIf(g -> g.getId() == Id);
    }

}
