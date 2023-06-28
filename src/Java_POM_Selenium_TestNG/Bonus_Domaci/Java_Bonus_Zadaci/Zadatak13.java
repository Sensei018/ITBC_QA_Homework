package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

/*
13.	Napisati program za ispis kvadrata prirodnih
brojeva do n unetih sa tastature (while petlja).
 */
public class Zadatak13 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = input.nextInt();

        int i = 1;
        while (i <= n) {
            int kvadrat = i * i;
            System.out.println("Kvadrat broja " + i + kvadrat);
            i++;
        }

        input.close();
    }
}
