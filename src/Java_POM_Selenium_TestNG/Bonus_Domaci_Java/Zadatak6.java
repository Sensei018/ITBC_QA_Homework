package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;
import java.util.Arrays;
public class Zadatak6 {
            public static void main(String[] args) {
            int[] niz1 = {1, 5, 8, 4, 2};
            int[] niz2 = {3, 7, 2, 10};

            int[] najveciNiz = najveci(niz1, niz2);
            System.out.println("Najveci niz: " + Arrays.toString(najveciNiz));
        }

        public static int[] najveci(int[] niz1, int[] niz2) {
            int duzina = Math.min(niz1.length, niz2.length);
            int[] rezultat = new int[duzina];
            for (int i = 0; i < duzina; i++) {
                if (niz1[i] > niz2[i]) {
                    rezultat[i] = niz1[i];
                } else {
                    rezultat[i] = niz2[i];
                }
            }
            if (niz1.length > duzina) {
                for (int i = duzina; i < niz1.length; i++) {
                    rezultat = Arrays.copyOf(rezultat, rezultat.length + 1);
                    rezultat[rezultat.length - 1] = niz1[i];
                }
            } else if (niz2.length > duzina) {
                for (int i = duzina; i < niz2.length; i++) {
                    rezultat = Arrays.copyOf(rezultat, rezultat.length + 1);
                    rezultat[rezultat.length - 1] = niz2[i];
                }
            }
            return rezultat;
        }
    }


