package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Unesite broj:");
        int broj= input.nextInt();

        System.out.println("Brojevi od 1 do 17 koji nisu deljivi sa brojem " + broj + " su:");

        for (int i=1; i<=17; i++) {
            if (i%broj !=0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
