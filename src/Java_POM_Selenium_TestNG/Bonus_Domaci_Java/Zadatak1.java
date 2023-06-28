package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                String[] niz = {"jabuka", "banana", "kivi", "ananas", "narandza"};

                System.out.print("Unesite string za pretragu: ");
                String rec = scanner.nextLine();

                if (find(rec, niz)) {
                    System.out.println("String \"" + rec + "\" se nalazi u nizu.");
                } else {
                    System.out.println("String \"" + rec + "\" se ne nalazi u nizu.");
                }
            }

            public static boolean find(String rec, String[] niz) {
                for (String element : niz) {
                    if (element.equals(rec)) {
                        return true;
                    }
                }
                return false;
            }
        }