package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak10 {

    /*
    10.	Napisati program koji ce nakon unosa sa
    tastature da ispisuje 3 puta u 3 reda IME sa
    razmakom.
     */
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Unesite ime: ");

        String ime= input.nextLine();

        for (int i=0; i<3; i++) {
            System.out.println( ime + " " + ime + " " + ime);

        }

            input.close();

    }
}
