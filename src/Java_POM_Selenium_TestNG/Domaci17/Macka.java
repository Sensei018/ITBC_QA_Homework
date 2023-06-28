package Java_POM_Selenium_TestNG.Domaci17;

public class Macka extends Zivotinja{

    private double tezina;
    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        this.tezina=tezina;
    }

    public void Chonk1() {
        if(tezina>5) {
            System.out.println("I'm a chonk");
        } else {
            System.out.println("I'm not a chonk");
        }
    }

    public String zvuk(){
        return "meow";
    }

    @Override
    public String toString() {
        return "Macka{" + "ime=" + ime + "nadimak=" + nadimak +
                "tezina=" + tezina +
                "} " + super.toString();
    }
}
