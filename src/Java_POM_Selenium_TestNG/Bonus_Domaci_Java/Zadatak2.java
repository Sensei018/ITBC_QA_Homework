package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;
import java.util.Arrays;
public class Zadatak2 {

        public static void main(String[] args) {


            int[] brojevi = { 1, 2, 3, 4, 5 };


            double[] pomnozeno = pomnozenoSaPI(brojevi);


            System.out.println("Originalni niz: " + Arrays.toString(brojevi));


            System.out.println("Novi niz: " + Arrays.toString(pomnozeno));
        }

        public static double[] pomnozenoSaPI(int[] brojevi) {
            double[] pomnozeno = new double[brojevi.length];
            for (int i = 0; i < brojevi.length; i++) {
                pomnozeno[i] = brojevi[i] * Math.PI;
            }
            return pomnozeno;
        }
    }