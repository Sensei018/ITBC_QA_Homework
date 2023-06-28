package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak15 {
    /*
    15.	Napisati program koji ce učitati elemente
    niza i ispisati elemente niza sa neparnim
    indeksom
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza:  ");
        int n = input.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < n; i++) {
            niz[i] = input.nextInt();

        }

        System.out.println("Elementi niza sa neparnim indexom su: ");
        for (int i = 1; i < n; i += 2) {
            System.out.println(niz[i]);
        }
        input.close();
    }
}
