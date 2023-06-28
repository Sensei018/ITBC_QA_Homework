package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak8 {

    /*
    8. Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n
     */
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int k= input.nextInt();

        System.out.println("Unesi drugi broj: ");
        int n= input.nextInt();

        int suma=0;
        int brojac=0;


        
        for (int i=n; i<=k; i++) {

            if (  i%2==0) {
                suma+=i;
                brojac++;

            }
        }
        double avg= (double) suma/brojac;
        System.out.println("Srednja vrednost je: " + avg);
    }
}
