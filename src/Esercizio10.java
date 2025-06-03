import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo reddito attuale");

        int reddito = scan.nextInt();

        if (reddito > 10001 && reddito < 30000) {
            System.out.println("l'importo da pagare è:" + reddito * 10/100);
        } else if (reddito > 30000 && reddito < 60000){
            System.out.println("l'importo da pagare è:" + reddito * 20/100);
        }else if (reddito > 60000){
            System.out.println("l'importo da pagare è:" + reddito * 30/100);
        }else
            System.out.println("Nessuna tassa");
    }
}

