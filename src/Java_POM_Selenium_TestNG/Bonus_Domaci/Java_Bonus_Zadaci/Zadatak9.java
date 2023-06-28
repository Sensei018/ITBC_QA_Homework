package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak9 {

    /*

    9.	Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj osoba: ");
        int n = input.nextInt();

        int[] visine = new int[n];

        int suma=0;
        int maksVisina=0;

        for (int i=0; i<n ; i++) {

            System.out.println("Unesite visinu osobe " + (i+1) + ": ");
            visine[i]= input.nextInt();

            suma+=visine[i];

            if(visine[i] > maksVisina) {
                maksVisina= visine[i];
            }
        }

        double prosecnaVisina= (double) suma/n;

        System.out.println("Prosecna visina je: "+ prosecnaVisina);
        System.out.println("Najveca visina je: " + maksVisina);

        input.close();
    }

}
