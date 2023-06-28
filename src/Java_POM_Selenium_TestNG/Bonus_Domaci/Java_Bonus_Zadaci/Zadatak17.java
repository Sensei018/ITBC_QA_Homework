package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak17 {
    /*
    17.	Napisati program koji ce učitati
    elemente i naći najveći element niza
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza: ");
        int n = input.nextInt();

        int[]niz= new int[n];

        System.out.println("Unesite elemente niza: ");
        for (int i=0; i<n;i++) {
            niz[i]=input.nextInt();

        }

        int najveci = niz[0];

        for (int i=1; i<n; i++) {
            if (niz[i]>najveci) {
                najveci=niz[i];
            }
        }

        System.out.println("Najveci element niza je: " + najveci);
        input.close();

    }
}
