package Java_POM_Selenium_TestNG.Domaci14;

import java.util.Scanner;

public class Zadatak1 {

    /*
   1.Napraviti metodu koja ispisuje niz i kao
   parametre prihvata niz.
    Unutar metode pronaći najveću vrednost u nizu,
    a zatim tu vrednost postaviti kao vrednost svakog
    elementa u nizu. Koristiti scanner za popunjavanje
    početnog niza. (3-4 poziva dovoljno).
     */
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int velicina= input.nextInt();

        int [] niz= new int[velicina];

        System.out.println("Unesite elemente niza: ");
        for (int i=0; i<velicina; i++) {
            niz[i]= input.nextInt();
        }

        ispis(niz);
    }

    public static void ispis (int[]niz) {
        int najveci=niz[0];

        for (int i=1; i< niz.length; i++) {
            if (niz[i] >najveci) {
                najveci= niz[i];
            }
        }

        System.out.println("Niz: ");
        for (int i=0; i<niz.length;i++) {
            niz[i]= najveci;
            System.out.println(najveci + " ");
        }
    }
}
