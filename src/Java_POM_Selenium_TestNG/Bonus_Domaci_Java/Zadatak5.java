package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        String broj = sc.nextLine();
        deljivSa(broj);
    }

    public static void deljivSa(String broj) {
        int n = Integer.parseInt(broj);
        System.out.println("Brojevi do 1000 deljivi sa " + n + ":");
        for (int i = 1; i <= 1000; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

}
