import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo giorno di nascita");

        int giorno = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita");

        int mese = scan.nextInt();

        if ((giorno >= 22 && mese == 12) || (giorno <= 19 && mese == 1)) {
            System.out.println("Il tuo segno zodiacale è Capricorno");
        }else if ((giorno >= 20 && mese == 1) || (giorno <= 18 && mese == 2)) {
           System.out.println("Il tuo segno zodiacale è Acquario");
        } else if ((giorno >= 19 && mese == 2) || (giorno <= 20 && mese == 3)) {
           System.out.println("Il tuo segno zodiacale è Pesci");
        } else if ((giorno >= 21 && mese == 3) || (giorno <= 19 && mese == 4)) {
           System.out.println("Il tuo segno zodiacale è Ariete");
        } else if ((giorno >= 20 && mese == 4) || (giorno <= 20 && mese == 5)) {
           System.out.println("Il tuo segno zodiacale è Toro");
        } else if ((giorno >= 21 && mese == 5) || (giorno <= 20 && mese == 6)) {
           System.out.println("Il tuo segno zodiacale è Gemelli");
        } else if ((giorno >= 21 && mese == 6) || (giorno <= 22 && mese == 7)) {
           System.out.println("Il tuo segno zodiacale è Cancro");
        } else if ((giorno >= 23 && mese == 7) || (giorno <= 22 && mese == 8)) {
           System.out.println("Il tuo segno zodiacale è Leone");
        } else if ((giorno >= 23 && mese == 8) || (giorno <= 22 && mese == 9)) {
           System.out.println("Il tuo segno zodiacale è Vergine");
        } else if ((giorno >= 23 && mese == 9) || (giorno <= 22 && mese == 10)) {
           System.out.println("Il tuo segno zodiacale è Bilancia");
        } else if ((giorno >= 23 && mese == 10) || (giorno <= 21 && mese == 11)) {
           System.out.println("Il tuo segno zodiacale è Scorpione");
        } else if ((giorno >= 22 && mese == 11) || (giorno <= 21 && mese == 12)) {
           System.out.println("Il tuo segno zodiacale è Sagittario");
        } else {
           System.out.println("Inserisci una data valida");
        }
    }
}

// Capricorno – dal 01/01 al 19/01
//
//Acquario – dal 20/01 al 18/02
//
//Pesci – dal 19/02 al 20/03
//
//Ariete – dal 21/03 al 19/04
//
//Toro – dal 20/04 al 20/05
//
//Gemelli – dal 21/05 al 20/06
//
//Cancro – dal 21/06 al 22/07
//
//Leone – dal 23/07 al 22/08
//
//Vergine – dal 23/08 al 22/09
//
//Bilancia – dal 23/09 al 22/10
//
//Scorpione – dal 23/10 al 21/11
//
//Sagittario – dal 22/11 al 21/12
//
//Capricorno – dal 22/12 al 31/12 //