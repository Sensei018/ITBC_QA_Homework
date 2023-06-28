package Java_POM_Selenium_TestNG.Domaci12;


public class Zadatak2 {
    public static void main(String[] args) {
        int[] niz= {3,5,6,7,8,4,9,2};
        int duzina= niz.length;
        int poslednjiClan=0;

        for (int i=0; i<duzina; i++) {
            if (i==duzina-1) {
                poslednjiClan = niz[i];
            }
        }
        int rezultat= duzina*poslednjiClan;
        System.out.println(rezultat);
    }
}
