import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'ora attuale");

        int ora = scan.nextInt();

        if (ora <= 5 || ora > 22) {
            if (ora > 24)
                System.out.println("Inserisci un orario valido");
            else
                System.out.println("Buonanotte");
        }else if (ora <= 12){
            System.out.println("Buongiorno");
        }else if (ora <= 18){
            System.out.println("Buon pomeriggio");
        }else {
            System.out.println("Buonasera");
        }


    }
}

