import java.util.Scanner;

public class Esercizio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0 )
            System.out.println("Numero positivo e pari");
            else
                System.out.println("Numero positivo e dispari");
        }else if (numero == 0) {
            System.out.println("ZERO");
        }else {
            if (numero % 2 == 0 )
                System.out.println("Numero negativo e pari");
            else
                System.out.println("Numero negativo e dispari");
        }
    }
}

