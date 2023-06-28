package Java_POM_Selenium_TestNG.Domaci09;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = input.next();

        System.out.print("Unesite prezime: ");
        String prezime = input.next();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = input.nextInt();

        int trenutnaGodina = java.time.LocalDate.now().getYear();
        int godine = trenutnaGodina - godinaRodjenja;

        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Broj Godina: " + godine);

        input.close();


    }
}
