import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un voto da 0 a 100");

        int voto = scan.nextInt();

        if (voto >= 90) {
            if (voto < 100)
                System.out.println("La tua valutazione: Ottimo");
            else  if (voto > 100)
                System.out.println("Inserisci un voto valido");

        }else if (voto >=80) {
            System.out.println("La tua valutazione: Buono");
        }else if (voto >= 70) {
            System.out.println("La tua valutazione: Sufficiente");
        }else if (voto >=60) {
            System.out.println("La tua valutazione: Rimandato");
        }else
            System.out.println("La tua valutazione: Bocciato");

    }
}
