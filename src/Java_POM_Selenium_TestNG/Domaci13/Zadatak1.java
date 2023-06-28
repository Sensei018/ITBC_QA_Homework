package Java_POM_Selenium_TestNG.Domaci13;

public class Zadatak1 {
    /*
    1.	Napraviti metodu koja vraca boolean tip i prihvata kao
     parametre 2 integer-a. Metoda vraća true samo ako
     su ta dva integer-a jedan za drugim,
     na primer 16 17 ili 24 25. U main metodi ispisati sa
     println nekoliko primera kako bi ste testirali
     (4-5 poziva je dovoljno)
     */
    public static void main(String[] args) {

        System.out.println(vezaniBrojevi(16,17));
        System.out.println(vezaniBrojevi(24,28));
        System.out.println(vezaniBrojevi(24,25));
        System.out.println(vezaniBrojevi(21,23));

    }
    public static boolean vezaniBrojevi(int a, int b) {
        return (b == a + 1);
    }
}
