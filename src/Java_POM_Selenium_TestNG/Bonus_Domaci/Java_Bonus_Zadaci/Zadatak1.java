package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak1 {
    /*
    1.	Napisati program za odredjivanje apsolutne vrednosti
     broja koji unesete sa tastature
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj: ");

        double broj = input.nextDouble();

        double apsolutnaVrednost = Math.abs(broj);
        System.out.println("Apsolutna vrednost ovog broja je: " + apsolutnaVrednost);

    }


}
