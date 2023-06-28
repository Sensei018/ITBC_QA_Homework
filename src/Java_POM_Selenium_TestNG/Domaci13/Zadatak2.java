package Java_POM_Selenium_TestNG.Domaci13;

public class Zadatak2 {
    /*
    2.	Napraviti metodu koja ispisuje tekst i prihvata kao
    parametre dva String-a. Ispis je u sledećem formatu:
     “Ime: “ text1 “i Prezime: “ text 2. text1 treba da budu
      sva velika slova, dok text2 treba da budu sva mala slova.
       U main metodi ispisati sa println nekoliko primera
        kako bi ste testirali (2-3 poziva je dovoljno)
     */

    public static void ispisiTekst(String ime, String prezime){
        System.out.println("Ime: " + ime.toUpperCase() + " i Prezime: " + prezime.toLowerCase());
    }

    public static void main(String[] args) {

        ispisiTekst("Nikola","Cvetanovic");
        ispisiTekst("Jovan","Jovanovic");
        ispisiTekst("Milena","Milenkovic");
    }
}
