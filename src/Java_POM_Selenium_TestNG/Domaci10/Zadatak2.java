package Java_POM_Selenium_TestNG.Domaci10;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {


        String correctUsername = "Nikola";
        String correctPassword = "Cvetanovic123";


        Scanner input = new Scanner(System.in);
        System.out.print("Unesite username: ");
        String username = input.nextLine();
        System.out.print("Unesite password: ");
        String password = input.nextLine();


        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Uspešno ste se ulogovali.");
        } else {
            System.out.println("Pogrešan username ili password.");
        }

        input.close();
    }
}
