package Java_POM_Selenium_TestNG.Domaci17;

public class MobilniTelefon extends Racunar{

    private int kamera;
    private Mreza mreza;

    public MobilniTelefon(int brojProcesora, String ram, String memorija, int kamera, Mreza mreza) {
        super(brojProcesora, ram, memorija);
        this.kamera=kamera;
        this.mreza=mreza;
    }

    @Override
    public String toString() {
        return "MobilniTelefon{" +
                "kamera=" + kamera +
                ", mreza=" + mreza +
                "} " + super.toString();
    }
}
