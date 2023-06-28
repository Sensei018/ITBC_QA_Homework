package Java_POM_Selenium_TestNG.Domaci16;




public class Zadatak2 {
    public static void main(String[] args) {

        Konverter konverter1= new Konverter( 12000, Valuta.USD);



        konverter1.konverzija();

        System.out.println(konverter1);
    }
}
