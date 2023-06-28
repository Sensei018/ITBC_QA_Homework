package Java_POM_Selenium_TestNG.Domaci15;

public class Zadatak1 {
    public static void main(String[] args) {

        int trenutnaGodina=2023;

        Radnik radnik1= new Radnik("Zoki", "Ilic", 2012);
        Radnik radnik2= new Radnik("Laza", "Lazic", 2018);
        Radnik radnik3= new Radnik("Pera", "Peric", 2001);

        System.out.println(radnik1.ime + " " + radnik1.prezime + " " + "radi u firmi vise od 10 godina: " + radnik1.radniStaz(trenutnaGodina));
        System.out.println(radnik2.ime + " " + radnik2.prezime + " " + "radi u firmi vise od 10 godina: " + radnik2.radniStaz(trenutnaGodina));
        System.out.println(radnik3.ime + " " + radnik3.prezime + " " + "radi u firmi vise od 10 godina: " + radnik3.radniStaz(trenutnaGodina));

    }
}
