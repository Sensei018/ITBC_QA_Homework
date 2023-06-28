package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

import java.util.Scanner;

public class Zadatak7 {

    /*
    7.	Napisati program koji ce da nađe proizvod prirodnih brojeva unetih
    sa tastature od a do b djeljivih sa 5 i koliko ih ima
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int a = input.nextInt();

        System.out.println("Unesi drugi broj: ");
        int b = input.nextInt();

        int proizvod = 1;
        int brojac = 0;

        int pocetak = Math.min(a,b);
        int kraj = Math.max(a,b);


        for (int i = pocetak; i <= kraj; i++) {
            if (i % 5 == 0) {
                proizvod *= i;

                brojac++;
            }
        }
        System.out.println("Proizvod brojeva je: " + proizvod);
        System.out.println("Broj brojeva izmedju " + a + " i izmedju " + b + " je: " + brojac);
        input.close();
    }
}
