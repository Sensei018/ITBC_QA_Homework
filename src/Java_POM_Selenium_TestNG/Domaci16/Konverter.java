package Java_POM_Selenium_TestNG.Domaci16;

public class Konverter {

    private int rsd;
    private Valuta valuta;

    public Konverter(int rsd, Valuta valuta){
        this.rsd=rsd;
        this.valuta=valuta;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public void konverzija() {
        double konvertovaniIznos;
        switch(valuta){
            case EUR:
                konvertovaniIznos=rsd/117.27;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " EUR");
                break;
            case USD:
                konvertovaniIznos=rsd/109.20;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " USD");
                break;
            case AUD:
                konvertovaniIznos=rsd/71.12;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " AUD");
                break;
            case CAD:
                konvertovaniIznos=rsd/80.06;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " CAD");
                break;
            case RUB:
                konvertovaniIznos=rsd/1.36;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " RUB");
                break;
            case GBP:
                konvertovaniIznos=rsd/134.67;
                System.out.println(rsd + " RSD = " + konvertovaniIznos + " GBP");
                break;

            default:
                System.out.println("Izabrana valuta nije dostupna.");
        }

    }

    @Override
    public String toString() {
        return "Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}
