package Java_POM_Selenium_TestNG.Domaci14;

import java.util.Scanner;

/*
2.	Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
 Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo
  kao parametar, a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
  U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
  i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
   Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).2.
   	Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
   	Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao
   	 parametar, a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
   	  U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
   	   i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
 */
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Unesite iznos u dinarima: ");
        double iznos= input.nextDouble();

        System.out.println("Unesite zeljenu valutu (eu/usd/gbp): ");
        String valuta= input.next();
        double konverzija = konvertujValutu(iznos, valuta);

        System.out.println("Konvertovani iznos: " + konverzija);
    }

    public static double konvertujValutu(double iznos, String valuta) {
        double kurs=1;

        switch (valuta.toLowerCase()){
            case "eu":
                kurs= 117.7;
                break;
            case "usd":
                kurs=99.0;
                break;
            case "gbp":
                kurs=138.6;
                break;
            default:
                System.out.println("Neispravna valuta " + valuta);
        }
        return iznos / kurs;
    }

}