package Java_POM_Selenium_TestNG.Domaci17;

abstract class Zivotinja {
    protected String ime;
    protected String nadimak;

    public Zivotinja(String ime, String nadimak){
        this.ime=ime;
        this.nadimak=nadimak;
    }

    public abstract String zvuk();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'' +
                '}';
    }
}
