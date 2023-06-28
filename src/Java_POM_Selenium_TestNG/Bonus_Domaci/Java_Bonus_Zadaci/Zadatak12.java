package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak12 {

    /*
    12.	Napisati program koji ce ispisati parne
    prirodne brojeve od 1 do 25 unete sa tastature
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Unesite broj: (unesite 25 za kraj) ");
        int broj= input.nextInt();

        while (broj !=25) {
            if (broj % 2==0) {
                System.out.println(broj);
            }
            System.out.println("Unesite sledeci broj: (Unesite 25 za kraj)");
            broj= input.nextInt();
        }
        input.close();
    }
}
