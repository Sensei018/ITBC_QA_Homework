package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;
import java.util.Random;
import java.util.Scanner;
public class Zadatak7c {

        public static void main(String[] args) {
            int[] niz = generisiNiz(7);
            int[] unetiBrojevi = unesiBrojeve(7);
            int brojPogodjenih = brojPogodjenih(niz, unetiBrojevi);
            ispisiPogodjeneBrojeve(niz, unetiBrojevi, brojPogodjenih);
            ispisiNiz(niz);
        }


        public static int[] generisiNiz(int velicina) {
            Random rand = new Random();
            int[] niz = new int[velicina];
            for (int i = 0; i < velicina; i++) {
                niz[i] = rand.nextInt(100) + 1;
            }
            return niz;
        }

            public static void ispisiNiz(int[] niz) {
            System.out.print("Generisan niz: ");
            for (int i = 0; i < niz.length; i++) {
                System.out.print(niz[i] + " ");
            }
            System.out.println();
        }

            public static int[] unesiBrojeve(int velicina) {
            Scanner sc = new Scanner(System.in);
            int[] niz = new int[velicina];
            System.out.println("Unesite " + velicina + " brojeva od 1 do 100:");
            for (int i = 0; i < velicina; i++) {
                niz[i] = sc.nextInt();
            }
            return niz;
        }

        public static int brojPogodjenih(int[] niz1, int[] niz2) {
            int brojPogodjenih = 0;
            for (int i = 0; i < niz1.length; i++) {
                for (int j = 0; j < niz2.length; j++) {
                    if (niz1[i] == niz2[j]) {
                        brojPogodjenih++;
                        break;
                    }
                }
            }
            return brojPogodjenih;
        }

        public static void ispisiPogodjeneBrojeve(int[] niz1, int[] niz2, int brojPogodjenih) {
            System.out.println("Broj pogodjenih brojeva: " + brojPogodjenih);
            System.out.print("Pogodjeni brojevi: ");
            for (int i = 0; i < niz1.length; i++) {
                for (int j = 0; j < niz2.length; j++) {
                    if (niz1[i] == niz2[j]) {
                        System.out.print(niz1[i] + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
