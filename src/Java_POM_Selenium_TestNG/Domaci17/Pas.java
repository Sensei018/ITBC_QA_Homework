package Java_POM_Selenium_TestNG.Domaci17;

public class Pas extends Zivotinja{

    private boolean goodBoy;

    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy=goodBoy;
    }
    public void goodBoy1() {
        if (goodBoy) {
            System.out.println("I am a good boy");
        } else {
            System.out.println("I am a bad boy");
        }
    }

    public String zvuk(){
        return"woof";
    }

    @Override
    public String toString() {
        return "Pas{" + "ime=" + ime + "nadimak=" + nadimak +
                "goodBoy=" + goodBoy +
                "} " + super.toString();
    }
}
