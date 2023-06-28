package Java_POM_Selenium_TestNG.Domaci17;

public class Racunar {

    private int brojProcesora;
    private String ram;
    private String memorija;

    public Racunar(int brojProcesora, String ram, String memorija){
        this.brojProcesora=brojProcesora;
        this.ram=ram;
        this.memorija=memorija;
    }

    @Override
    public String toString() {
        return "Racunar{" +
                "brojProcesora=" + brojProcesora +
                ", ram='" + ram + '\'' +
                ", memorija='" + memorija + '\'' +
                '}';
    }
}
