import java.util.Scanner;

public class Esecizio2 {
    public static void main(String[] args) {
        System.out.println("Esercizio 2!");
        //importo scanner
        Scanner scanner = new Scanner(System.in);
        //inizio es
        System.out.print("Inserisci stringa 1: ");
        String stringa1 = scanner.nextLine();
        System.out.print("Inserisci stringa 2: ");
        String stringa2 = scanner.nextLine();
        System.out.print("Inserisci stringa 3: ");
        String stringa3 = scanner.nextLine();

        String cancatenazioneOrdineCrescente = stringa1 + " " + stringa2 + " " + stringa3;
        System.out.println("concatenazione in ordine crescente: " + cancatenazioneOrdineCrescente);

        String cancatenazioneOrdineDecrescente = stringa3 + " " + stringa2 + " " + stringa1;
        System.out.println("concatenazione in ordine decrescente: " + cancatenazioneOrdineDecrescente);



    }





}
