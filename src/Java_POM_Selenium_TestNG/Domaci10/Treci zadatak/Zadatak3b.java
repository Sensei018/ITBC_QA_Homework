package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of your birth (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter the month of your birth (1-12): ");
        int month = input.nextInt();

        String zodiacSign = "";

        if (month == 1) {
            if (day <= 20) {
                zodiacSign = "Capricorn";
            } else {
                zodiacSign = "Aquarius";
            }
        } else if (month == 2) {
            if (day <= 18) {
                zodiacSign = "Aquarius";
            } else {
                zodiacSign = "Pisces";
            }
        } else if (month == 3) {
            if (day <= 20) {
                zodiacSign = "Pisces";
            } else {
                zodiacSign = "Aries";
            }
        } else if (month == 4) {
            if (day <= 20) {
                zodiacSign = "Aries";
            } else {
                zodiacSign = "Taurus";
            }
        } else if (month == 5) {
            if (day <= 20) {
                zodiacSign = "Taurus";
            } else {
                zodiacSign = "Gemini";
            }
        } else if (month == 6) {
            if (day <= 20) {
                zodiacSign = "Gemini";
            } else {
                zodiacSign = "Cancer";
            }
        } else if (month == 7) {
            if (day <= 22) {
                zodiacSign = "Cancer";
            } else {
                zodiacSign = "Leo";
            }
        } else if (month == 8) {
            if (day <= 22) {
                zodiacSign = "Leo";
            } else {
                zodiacSign = "Virgo";
            }
        } else if (month == 9) {
            if (day <= 22) {
                zodiacSign = "Virgo";
            } else {
                zodiacSign = "Libra";
            }
        } else if (month == 10) {
            if (day <= 22) {
                zodiacSign = "Libra";
            } else {
                zodiacSign = "Scorpio";
            }
        } else if (month == 11) {
            if (day <= 22) {
                zodiacSign = "Scorpio";
            } else {
                zodiacSign = "Sagittarius";
            }
        } else if (month == 12) {
            if (day <= 21) {
                zodiacSign = "Sagittarius";
            } else {
                zodiacSign = "Capricorn";
            }
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }
}
