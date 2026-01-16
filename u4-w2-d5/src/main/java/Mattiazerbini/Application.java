package Mattiazerbini;

import Mattiazerbini.entities.Collezione;
import Mattiazerbini.entities.GiochiDaTavolo;
import Mattiazerbini.entities.Gioco;
import Mattiazerbini.entities.Videogiochi;

import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Collezione collezione = new Collezione();

        //SCELTA DELL'OPZIONE
        int scelta = -1;
        while (true) {
            System.out.println("Scegli un'opzione: \n" +
                    "1 Aggiungi un videogame\n" +
                    "2 Aggiungi un gioco da tavola\n" +
                    "3 Ricerca un gioco per ID\n" +
                    "4 Ricerca un gioco per prezzo\n" +
                    "5 Ricerca un gioco per numero di giocatori\n" +
                    "6 Rimuovi un gioco\n" +
                    "7 Aggiorna un gioco\n" +
                    "8 Mostrami le statistiche dei giochi");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1: {
                    System.out.println("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.println("Anno di pubblicazione: ");
                    int annoPubblicazione = Integer.parseInt(scanner.nextLine());
                    System.out.println("Prezzo: ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Piattaforma: ");
                    String piattaforma = scanner.nextLine();
                    System.out.println("Durata in ore: ");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Scegli un genere: Horror, Azione, Sport, GiochiDiRuolo");
                    String genere = scanner.nextLine();
                    Videogiochi.Genere generi = Videogiochi.Genere.valueOf(genere);

                    Videogiochi v = new Videogiochi(id, titolo, annoPubblicazione, prezzo, piattaforma, durata, generi);
                    collezione.aggiungiGioco(v);
                    System.out.println("Gioco inserito");
                    break;
                }
                case 2: {
                    System.out.println("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.println("Anno di pubblicazione: ");
                    int annoPubblicazione = Integer.parseInt(scanner.nextLine());
                    System.out.println("Prezzo: ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Numero di giocaotori: ");
                    int numGiocatori = Integer.parseInt(scanner.nextLine());
                    System.out.println("Durata media in minuti: ");
                    int durata = Integer.parseInt(scanner.nextLine());
                    GiochiDaTavolo g = new GiochiDaTavolo(id, titolo, annoPubblicazione, prezzo, numGiocatori, durata);
                    collezione.aggiungiGioco(g);
                    System.out.println("Gioco inserito");
                    break;
                }
                case 3: {
                    System.out.println("Trova il gioco tramite ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Gioco trovaGioco = collezione.ricercaId(id);
                    if (trovaGioco == null) {
                        System.out.println("Id non trovato");
                    } else {
                        System.out.println("Gioco trovato" + trovaGioco.getTitolo());
                    }
                    break;
                }
                case 4: {
                    System.out.println("Ricerca il gioco per un prezzo massimo: ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    collezione.ricercaPrezzo(prezzo).forEach(gioco -> System.out.println(gioco.getTitolo() +
                    "€" +gioco.getPrezzo()));break;

                }
                case 5 : {
                    System.out.println("Ricerca il gioco da tavolo per il numero di giocatori: ");
                    int numGiocatori = Integer.parseInt(scanner.nextLine());
                    collezione.ricercaNumGiocatori(numGiocatori).
                    forEach(giochiDaTavolo -> System.out.println(giochiDaTavolo.getTitolo()));
                    break;
                }
                case 6 : {
                    System.out.println("Scrvi ID per rimuovere il gioco: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    if(collezione.rimuoviGioco(id))
                        System.out.println("Gioco rimosso");
                    else System.out.println("ID non trovato");
                    break;
                }
                default: {
                    System.out.println("Numero non valido");
                }
            }

        }
    }
}
