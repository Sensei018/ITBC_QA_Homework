package Java_POM_Selenium_TestNG.Domaci10.Treci;

import java.util.Scanner;

public class Zadatak3f {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month, sign = "";
        int day;

        System.out.print("Enter your birth month (e.g. January): ");
        month = input.nextLine();

        System.out.print("Enter your birth day (e.g. 21): ");
        day = input.nextInt();

        if ((month.equalsIgnoreCase("March") && day >= 21) || (month.equalsIgnoreCase("April") && day <= 19)) {
            sign = "Aries";
        } else if ((month.equalsIgnoreCase("April") && day >= 20) || (month.equalsIgnoreCase("May") && day <= 20)) {
            sign = "Taurus";
        } else if ((month.equalsIgnoreCase("May") && day >= 21) || (month.equalsIgnoreCase("June") && day <= 20)) {
            sign = "Gemini";
        } else if ((month.equalsIgnoreCase("June") && day >= 21) || (month.equalsIgnoreCase("July") && day <= 22)) {
            sign = "Cancer";
        } else if ((month.equalsIgnoreCase("July") && day >= 23) || (month.equalsIgnoreCase("August") && day <= 22)) {
            sign = "Leo";
        } else if ((month.equalsIgnoreCase("August") && day >= 23) || (month.equalsIgnoreCase("September") && day <= 22)) {
            sign = "Virgo";
        } else if ((month.equalsIgnoreCase("September") && day >= 23) || (month.equalsIgnoreCase("October") && day <= 22)) {
            sign = "Libra";
        } else if ((month.equalsIgnoreCase("October") && day >= 23) || (month.equalsIgnoreCase("November") && day <= 21)) {
            sign = "Scorpio";
        } else if ((month.equalsIgnoreCase("November") && day >= 22) || (month.equalsIgnoreCase("December") && day <= 21)) {
            sign = "Sagittarius";
        } else if ((month.equalsIgnoreCase("December") && day >= 22) || (month.equalsIgnoreCase("January") && day <= 19)) {
            sign = "Capricorn";
        } else if ((month.equalsIgnoreCase("January") && day >= 20) || (month.equalsIgnoreCase("February") && day <= 18)) {
            sign = "Aquarius";
        } else if ((month.equalsIgnoreCase("February") && day >= 19) || (month.equalsIgnoreCase("March") && day <= 20)) {
            sign = "Pisces";
        } else {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        System.out.println("Your zodiac sign is " + sign + ".");
    }

}
