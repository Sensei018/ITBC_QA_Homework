package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3e {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of your birth: ");
        String day = input.nextLine();

        System.out.print("Enter the month of your birth: ");
        String month = input.nextLine();

        String zodiacSign = "";

        if (month.equalsIgnoreCase("january") && Integer.valueOf(day) >= 20 || month.equalsIgnoreCase("february") && Integer.valueOf(day) <= 18) {
            zodiacSign = "Aquarius";
        } else if (month.equalsIgnoreCase("february") && Integer.valueOf(day) >= 19 || month.equalsIgnoreCase("march") && Integer.valueOf(day) <= 20) {
            zodiacSign = "Pisces";
        } else if (month.equalsIgnoreCase("march") && Integer.valueOf(day) >= 21 || month.equalsIgnoreCase("april") && Integer.valueOf(day) <= 19) {
            zodiacSign = "Aries";
        } else if (month.equalsIgnoreCase("april") && Integer.valueOf(day) >= 20 || month.equalsIgnoreCase("may") && Integer.valueOf(day) <= 20) {
            zodiacSign = "Taurus";
        } else if (month.equalsIgnoreCase("may") && Integer.valueOf(day) >= 21 || month.equalsIgnoreCase("june") && Integer.valueOf(day) <= 20) {
            zodiacSign = "Gemini";
        } else if (month.equalsIgnoreCase("june") && Integer.valueOf(day) >= 21 || month.equalsIgnoreCase("july") && Integer.valueOf(day) <= 22) {
            zodiacSign = "Cancer";
        } else if (month.equalsIgnoreCase("july") && Integer.valueOf(day) >= 23 || month.equalsIgnoreCase("august") && Integer.valueOf(day) <= 22) {
            zodiacSign = "Leo";
        } else if (month.equalsIgnoreCase("august") && Integer.valueOf(day) >= 23 || month.equalsIgnoreCase("september") && Integer.valueOf(day) <= 22) {
            zodiacSign = "Virgo";
        } else if (month.equalsIgnoreCase("september") && Integer.valueOf(day) >= 23 || month.equalsIgnoreCase("october") && Integer.valueOf(day) <= 22) {
            zodiacSign = "Libra";
        } else if (month.equalsIgnoreCase("october") && Integer.valueOf(day) >= 23 || month.equalsIgnoreCase("november") && Integer.valueOf(day) <= 21) {
            zodiacSign = "Scorpio";
        } else if (month.equalsIgnoreCase("november") && Integer.valueOf(day) >= 22 || month.equalsIgnoreCase("december") && Integer.valueOf(day) <= 21) {
            zodiacSign = "Sagittarius";
        } else if (month.equalsIgnoreCase("december") && Integer.valueOf(day) >= 22 || month.equalsIgnoreCase("january") && Integer.valueOf(day) <= 19) {
            zodiacSign = "Capricorn";
        } else {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        System.out.println("Your zodiac sign is " + zodiacSign);
    }

}
