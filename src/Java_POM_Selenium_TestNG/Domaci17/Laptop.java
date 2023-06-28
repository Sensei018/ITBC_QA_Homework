package Java_POM_Selenium_TestNG.Domaci17;

public class Laptop extends Racunar{
    private double velicinaEkrana;
    private Tastatura tastatura;

    public Laptop (int brojProcesora, String ram, String memorija, double velicinaEkrana, Tastatura tastatura ){
        super(brojProcesora, ram, memorija);
        this.velicinaEkrana=velicinaEkrana;
        this.tastatura=tastatura;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "velicinaEkrana=" + velicinaEkrana +
                ", tastatura=" + tastatura +
                "} " + super.toString();
    }
}
