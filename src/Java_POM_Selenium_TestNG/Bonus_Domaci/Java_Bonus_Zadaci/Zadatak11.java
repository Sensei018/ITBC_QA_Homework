package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak11 {

    /*
    11.	Napisati program koji ce nakon unosa sa
     tastature ispisati pravougaoni trougao kao na
     slici sa proizvoljnim brojem redova:
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Unesite broj redova: ");
        int brojRedova= input.nextInt();

        for (int i=1; i<=brojRedova; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

            input.close();
    }
}
