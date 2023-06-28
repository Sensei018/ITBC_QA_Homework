package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3 {

    /*Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.*/

    public static void main(String[] args) {
        int m, day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth day");
        day = sc.nextInt();

        System.out.println("Enter your birth month(1-12)");
        m = sc.nextInt();

        if ((m == 12 && day >= 22 && day <= 31) || (m == 1 && day <= 19)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Capricorn");
        } else if ((m == 1 && day >= 20 && day <= 31) || (m == 2 && day <= 17)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Aquarius");
        } else if ((m == 2 && day >= 18 && day <= 29) || (m == 3 && day <= 19)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Pisces");
        } else if ((m == 3 && day >= 20 && day <= 31) || (m == 4 && day <= 19)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Aries");
        } else if ((m == 4 && day >= 20 && day <= 30) || (m == 5 && day <= 20)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Taurus");
        } else if ((m == 5 && day >= 21 && day <= 31) || (m == 6 && day <= 20)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Gemini");
        } else if ((m == 6 && day >= 21 && day <= 30) || (m == 7 && day <= 22)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Cancer");
        } else if ((m == 7 && day >= 23 && day <= 31) || (m == 8 && day <= 22)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Leo");
        } else if ((m == 8 && day >= 23 && day <= 31) || (m == 9 && day <= 22)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Virgo");
        } else if ((m == 9 && day >= 23 && day <= 30) || (m == 10 && day <= 22)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Libra");
        } else if ((m == 10 && day >= 23 && day <= 31) || (m == 11 && day <= 21)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Scorpio");
        } else if ((m == 11 && day >= 22 && day <= 30) || (m == 12 && day <= 21)) {
            System.out.println("Your Zodiac Sign based on your Birth date is Sagittarius");
        } else {
            System.out.println("Invalid Birth date entered");
        }
    }
}
