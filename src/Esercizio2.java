import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un'età");

        int eta = scan.nextInt();

        if (eta <= 12) {
            System.out.println("Sei un bambino");
        }else if (eta <= 19) {
            System.out.println("Sei un adolescente");
        }else if (eta <= 59) {
            System.out.println("Sei adulto");
        }else  {
            System.out.println("Sei anziano");
        }
    }
}
