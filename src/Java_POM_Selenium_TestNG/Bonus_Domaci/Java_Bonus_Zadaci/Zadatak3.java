package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak3 {

    /*
    3.	Napisati program za ispis uspeha za uneti broj sa
    tastature, prema sledećoj tabeli
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesi ocenu: ");
        int ocena = input.nextInt();

        if (ocena == 1) {
            System.out.println("Nedovoljan");
        } else if (ocena == 2) {
            System.out.println("Dovoljan");
        } else if (ocena == 3) {
            System.out.println("Dobar");
        } else if (ocena == 4) {
            System.out.println("Vrlo dobar");
        } else if (ocena == 5) {
            System.out.println("Odlican");
        } else {
            System.out.println("Uneli ste nepostojecu ocenu. Ponovite unos.");
        }
    }


}
