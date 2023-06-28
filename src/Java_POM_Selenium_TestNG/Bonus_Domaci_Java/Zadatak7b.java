package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;

import java.util.Arrays;

public class Zadatak7b {
    public static void main(String[] args) {
        int[] brojevi = randomBrojevi();
        System.out.println("Generisani brojevi: " + Arrays.toString(brojevi));
    }
    public static int[] randomBrojevi() {
        int[] brojevi = new int[30];
        for (int i = 0; i < brojevi.length; i++) {
            double nasumicanBroj = Math.random() * 100; // generiše broj između 0 i 100
            brojevi[i] = (int) nasumicanBroj; // pretvara double u int
        }
        return brojevi;
    }

}
