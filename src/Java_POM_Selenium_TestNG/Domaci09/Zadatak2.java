package Java_POM_Selenium_TestNG.Domaci09;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Unesite temperaturu u Celzijusima: ");
        int temperaturaC = input.nextInt();

        double temperaturaF = (temperaturaC * 9.0 / 5.0) + 32.0;


        System.out.printf("%dC = %.1fF%n", temperaturaC, temperaturaF);


        input.close();
    }
}
