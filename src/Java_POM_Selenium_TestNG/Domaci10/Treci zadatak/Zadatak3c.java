package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of your birth (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter the month of your birth (1-12): ");
        int month = input.nextInt();
        String zodiacSign = "";

        switch (month) {
            case 1:
                if (day <= 20 ) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
                break;
            case 2:
                if (day <= 18) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Pisces";
                }
                break;
            case 3:
                if (day <= 20) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
                break;
            case 4:
                if (day <= 20) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
                break;
            case 5:
                if (day <= 20) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
                break;
            case 6:
                if (day <= 20) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
                break;
            case 8:
                if (day <= 22) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
                break;
            case 9:
                if (day <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
                break;
            case 10:
                if (day <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
                break;
            case 11:
                if (day <= 22) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
                break;
            case 12:
                if (day <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }

}
