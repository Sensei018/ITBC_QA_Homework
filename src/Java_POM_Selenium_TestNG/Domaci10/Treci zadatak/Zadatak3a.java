package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3a {

    public static void main(String[] args) {

        int date, month;
        Scanner sc = new Scanner(System.in);
        System.out.println("input your date : ");
        date = sc.nextInt();

        System.out.println("input your mounth: ");
        month = sc.nextInt();

        if ((date > 21 && date <= 31 && month == 12) || (date <= 19 && month == 1)) {
            System.out.println("your zodiac is Capricon");
        }
        if ((date > 20  && date <= 31 && month == 1) || (date <= 18 && month == 2)) {
            System.out.println("your zodiac is Aquarius");
        }
        if ((date > 19 && date <= 29 && month == 2) || (date <= 20 && month == 3)) {
            System.out.println("your zodiac is Pisces");
        }
        if ((date > 21  && date <= 31 && month == 3) || (date <= 20 && month == 4)) {
            System.out.println("your zodiac is aries");
        }
        if ((date > 21  && date <= 30 && month == 4) || (date <= 20 && month == 5)) {
            System.out.println("your zodiac is Taurus");
        }
        if ((date > 21 && date <= 31  && month == 5) || (date <= 20 && month == 6)) {
            System.out.println("your zodiac is Gemini");
        }
        if ((date > 21 && date <= 30 && month == 6) || (date <= 20 && month == 7)) {
            System.out.println("your zodiac is Cancer");
        }
        if ((date > 21 && date <= 31 && month == 7) || (date <= 20 && month == 8)) {
            System.out.println("your zodiac is  Leo");
        }
        if ((date > 21 && date <= 31 && month == 8) || (date <= 22 && month == 9)) {
            System.out.println("your zodiac is Virgo");
        }
        if ((date > 23  && date <= 30 && month == 9) || (date <= 20 && month == 10)) {
            System.out.println("your zodiac is Libra");
        }
        if ((date > 21  && date <= 31 && month == 10) || (date <= 22 && month == 11)) {
            System.out.println("your zodiac is Scorpio");
        }
        if ((date > 23  && date <= 30 && month == 11) || (date <= 20 && month == 12)) {
            System.out.println("your zodiac is Sagitarius");
        }
        if (month < 1 || month > 12 || date < 1 || date > 31) {
            System.out.println("Invalid date or month");
            return;
        }
    }

}
