import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la tua velocità attuale");

        int velocita = scan.nextInt();

        if (velocita <= 50) {
            System.out.println("Velocità regolare");
        }else if (velocita <= 80) {
            System.out.println("Attenzione, stai superando il limite");
        }else if (velocita <= 120) {
            System.out.println("Eccesso di velocità");
        }else {
            System.out.println("Multa garantita");
        }

    }
}

