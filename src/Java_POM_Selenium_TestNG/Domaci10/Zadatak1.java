package Java_POM_Selenium_TestNG.Domaci10;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int godina = input.nextInt();

        boolean Prestupna = false;

        if (godina % 4 == 0) {
            if (godina % 100 == 0) {
                if (godina % 400 == 0) {
                    Prestupna = true;
                } else {
                    Prestupna = false;
                }
            } else {
                Prestupna = true;
            }
        } else {
            Prestupna = false;
        }

        if (Prestupna) {
            System.out.println(godina + " je prestupna godina.");
        } else {
            System.out.println(godina + " nije prestupna godina.");
        }

        input.close();
    }
}
