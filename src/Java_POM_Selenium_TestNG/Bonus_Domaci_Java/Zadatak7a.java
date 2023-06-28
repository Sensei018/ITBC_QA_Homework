package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;
import java.util.Scanner;
public class Zadatak7a {

        public static void main(String[] args) {
            int[] niz = unesiBrojeve();
            System.out.println("Uneli ste niz: ");
            ispisiNiz(niz);
        }

        public static int[] unesiBrojeve() {
            Scanner scanner = new Scanner(System.in);
            int[] niz = new int[6];
            for (int i = 0; i < niz.length; i++) {
                System.out.print("Unesite " + (i + 1) + ". broj: ");
                niz[i] = scanner.nextInt();
            }
            scanner.close();
            return niz;
        }

        public static void ispisiNiz(int[] niz) {
            for (int i = 0; i < niz.length; i++) {
                System.out.print(niz[i] + " ");
            }
            System.out.println();
        }
    }
