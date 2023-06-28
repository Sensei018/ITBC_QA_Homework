package Java_POM_Selenium_TestNG.Domaci15;

public class Radnik {

    String ime;
    String prezime;
    int godinaZaposlenja;

    public Radnik() {
    }

    public Radnik(String ime, String prezime, int godinaZaposlenja) {

        this.ime = ime;
        this.prezime = prezime;
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public boolean radniStaz(int trenutnaGodina) {
        int staz = trenutnaGodina - godinaZaposlenja;
        return staz > 10;
    }

}
