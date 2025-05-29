import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'importo speso");

        float importo = scan.nextInt();

        if (importo >= 200)
            System.out.println("Il prezzo finale è: " + importo * 20 / 100);
        else if (importo >= 100)
            System.out.println("Il prezzo finale è: " + importo * 10 / 100);
        else
            System.out.println("Il prezzo finale è: " + importo);

    }
}
