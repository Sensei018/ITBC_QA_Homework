package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak20 {
    /*
    20.	Kreirati metodu koja računa prizvod dva broja,
     vraća rezultat u main, duplira i ispisuje.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int a = input.nextInt();

        System.out.println("Unesi drugi broj: ");
        int b = input.nextInt();

        int proizvod = mnozenje(a, b);
        int dupliraniProizvod = proizvod * 2;
        System.out.println("Dupliran proizvod je: " + dupliraniProizvod );
        input.close();
    }

    public static int mnozenje(int a, int b) {
        return a * b;
    }
}
