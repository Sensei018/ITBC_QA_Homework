package Java_POM_Selenium_TestNG.Domaci17;

import java.util.ArrayList;

public class Zadatak2 {

    public static void main(String[] args) {

        ArrayList<Racunar> racunari = new ArrayList<>();
        racunari.add(new Laptop(4,"16gb","512GB",15.6,Tastatura.INTERNATIONAL));
        racunari.add(new MobilniTelefon(8, "6GB","128GB",32, Mreza._5G));

        for (int i=0; i< racunari.size();i++){
            Racunar racunar= racunari.get(i);

            if (racunar instanceof Laptop) {
                System.out.println("Laptop: " + racunar);

            }else if (racunar instanceof MobilniTelefon) {
                System.out.println("Mobilni telefon: " + racunar);
            }
        }
    }
}
