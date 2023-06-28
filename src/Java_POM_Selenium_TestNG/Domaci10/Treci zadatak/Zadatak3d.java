package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of your birth (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter the month of your birth (1-12): ");
        int month = input.nextInt();

        String zodiacSign = "";
        switch (month) {
            case 1:
                zodiacSign = (day <= 19) ? "Capricorn" : "Aquarius";
                break;
            case 2:
                zodiacSign = (day <= 18) ? "Aquarius" : "Pisces";
                break;
            case 3:
                zodiacSign = (day <= 20) ? "Pisces" : "Aries";
                break;
            case 4:
                zodiacSign = (day <= 20) ? "Aries" : "Taurus";
                break;
            case 5:
                zodiacSign = (day <= 20) ? "Taurus" : "Gemini";
                break;
            case 6:
                zodiacSign = (day <= 20) ? "Gemini" : "Cancer";
                break;
            case 7:
                zodiacSign = (day <= 22) ? "Cancer" : "Leo";
                break;
            case 8:
                zodiacSign = (day <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                zodiacSign = (day <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                zodiacSign = (day <= 22) ? "Libra" : "Scorpio";
                break;
            case 11:
                zodiacSign = (day <= 21) ? "Scorpio" : "Sagittarius";
                break;
            case 12:
                zodiacSign = (day <= 21) ? "Sagittarius" : "Capricorn";
                break;
            default:
                System.out.println("Invalid date");
                System.exit(0);
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }

}
