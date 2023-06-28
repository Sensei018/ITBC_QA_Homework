package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak2 {

    /*
    2.	Napisati program koji od dva učitana broja (a, b) sa
    tastature nalazi veći.
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int a= input.nextInt();

        System.out.println("Unesi drugi broj: ");
        int b= input.nextInt();

        if (a<b) {
            System.out.println("Veci broj je: " + b);
        } else if (a>b) {
            System.out.println("Veci broj je: " + a);
        }
    }


}
