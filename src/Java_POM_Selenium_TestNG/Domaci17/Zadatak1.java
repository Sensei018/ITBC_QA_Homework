package Java_POM_Selenium_TestNG.Domaci17;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.add(new Pas("Edi", "Edisha", true));
        zivotinje.add(new Macka("Milky", "Milka", 3));
        zivotinje.add(new Pas("Arta", "Ar", true));


        Zivotinja zivotinja;
        for (int i = 0; i < zivotinje.size(); i++) {
            zivotinja = zivotinje.get(i);

            if (zivotinja instanceof Pas) {
                System.out.println("Dog: ");
                        Pas pas=(Pas)zivotinja;
                System.out.println("Ime: " + pas.ime);
                System.out.println("Nadimak: " + pas.nadimak);
            }else if (zivotinja instanceof Macka){
                System.out.println("Cat: ");
                Macka macka= (Macka) zivotinja;
                System.out.println("Ime: " + macka.ime);
                System.out.println("Nadimak: " + macka.nadimak);
            }
            System.out.println("Sound: " + zivotinja.zvuk());
            if (zivotinja instanceof Pas) {
                Pas pas = (Pas) zivotinja;
                pas.goodBoy1();

            } else if (zivotinja instanceof Macka) {
                Macka macka = (Macka) zivotinja;
                macka.Chonk1();
            }
            System.out.println();
        }





    }
}
