package Java_POM_Selenium_TestNG.Domaci15;

import domaci15.Domaci15.Film;

public class Zadatak2 {
    public static void main(String[] args) {

        Film film1= new Film("Hobit", "Piter Dzekson", 2012);
        Film film2= new Film("LOTR", "Piter Dzekson", 2001);

        if (film1.godinaObjave > film2.godinaObjave) {
            System.out.println(film1.ime + " je noviji film od " + film2.ime);

        } else if (film1.godinaObjave<film2.godinaObjave) {
            System.out.println(film2.ime + " je noviji film od " + film1.ime);
        } else {
            System.out.println("Film " + film1.ime + " i " + film2.ime + "su izasli iste godine.");
        }

    }
}
