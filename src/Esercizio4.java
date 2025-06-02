import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la temperatura dell'acqua");

        int temperatura = scan.nextInt();

        if (temperatura <= 0) {
            System.out.println("Lo stato dell'acqua è solido");
        }else if (temperatura >= 100){
            System.out.println("Lo stato dell'acqua è gassoso");
        }else {
            System.out.println("Lo stato dell'acqua è liquido");
        }

    }
}
