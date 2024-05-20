import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // messaggio di benvenuto
        System.out.println("Hello world!");

        //moltiplicazioni e stampa dei risultati ex.1
        System.out.println("il risultato della moltiplicazione è: " + moltiplica(2, 5));
        System.out.println("il risultato della moltiplicazione è: " + moltiplica(15, 18));
        System.out.println("il risultato della moltiplicazione è: " + moltiplica(2, 51));

        //concatena una stringa e un intero e restituisce una stringa che contiene gli elementi e stampa dei risultati ex.2
        System.out.println("concatena una stringa e un intero e restituisce una stringa che contiene gli elementi: " + concatena("ciao ", 74));
        System.out.println("La mia età: " + concatena("Anni ", 25));

        //Stampe e risultati EX.3

        // Array di stringhe di cinque elementi
        String[] cinqueElementi = {"Stringa1", "Stringa2", "Stringa3", "Stringa4", "Stringa5"};

        // Aggiunta della sesta stringa e stampa dei risultati ex.3
        String[] nuovoArray = inserisciInArray(cinqueElementi, "NuovaStringa");
        System.out.println("Array con la sesta stringa aggiunta al terzo posto:");
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.print(nuovoArray[i] + " ");
        }
    };



    // moltiplica due interi
    public static int moltiplica (int a, int b) {
        return a * b;
    }
    //esercizio 2 concatena
    public static String concatena (String stringa, int number) {
        return stringa + number;
    }

    // Esercizio 3 inserisci alla 3 posizione in un array di 5

    // inserisce una stringa in un array di cinque elementi
    public static String[] inserisciInArray(String[] array, String sestaStringa) {
        // creazione di un nuovo array di lunghezza 6
        String[] nuovoArray = new String[6];

        // copia degli elementi fino alla seconda posizione
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];

        // inserimento della nuova stringa alla terza posizione
        nuovoArray[2] = sestaStringa;

        // copia degli elementi rimanenti, spostando quelli in quarta e quinta posizione
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }
 }

