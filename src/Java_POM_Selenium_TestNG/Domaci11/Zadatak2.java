package Java_POM_Selenium_TestNG.Domaci11;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int suma=0;
        int broj;
        do {
            System.out.println("Unesite broj: ");
            broj = input.nextInt();
            suma+=broj;
        } while (broj !=0);
        System.out.println("Suma unetih brojeva je: " + suma);
    }
}
