package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak19 {

    /*
    19.	Napisati metod za nalaženje minimuma od dva
     učitana broja (a, b) sa tastature.
    Izvršiti dodeljivanje vrednosti metoda varijabli c
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int a = input.nextInt();

        System.out.println("Unesi drugi broj: ");
        int b = input.nextInt();

        int c = minimum(a, b);

        System.out.println("Minimum od brojeva " + a + " i " + b + " je " + c);
        input.close();
    }


    public static int minimum (int a, int b) {
    if(a<b) {
        return a;
    } else {
        return b;
    }
}
}
