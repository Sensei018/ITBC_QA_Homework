package Java_POM_Selenium_TestNG.Domaci10;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Unesite dan rođenja: ");
        int dan = input.nextInt();

        System.out.print("Unesite mesec rođenja (broj): ");
        int mesec = input.nextInt();


        String horoskop = "";
        switch (mesec) {
            case 1:
                if (dan >= 20) {
                    horoskop = "Vodolija";
                } else {
                    horoskop = "Jarac";
                }
                break;
            case 2:
                if (dan >= 19) {
                    horoskop = "Ribe";
                } else {
                    horoskop = "Vodolija";
                }
                break;
            case 3:
                if (dan >= 21) {
                    horoskop = "Ovan";
                } else {
                    horoskop = "Ribe";
                }
                break;
            case 4:
                if (dan >= 20) {
                    horoskop = "Bik";
                } else {
                    horoskop = "Ovan";
                }
                break;
            case 5:
                if (dan >= 21) {
                    horoskop = "Blizanci";
                } else {
                    horoskop = "Bik";
                }
                break;
            case 6:
                if (dan >= 21) {
                    horoskop = "Rak";
                } else {
                    horoskop = "Blizanci";
                }
                break;
            case 7:
                if (dan >= 23) {
                    horoskop = "Lav";
                } else {
                    horoskop = "Rak";
                }
                break;
            case 8:
                if (dan >= 23) {
                    horoskop = "Devica";
                } else {
                    horoskop = "Lav";
                }
                break;
            case 9:
                if (dan >= 23) {
                    horoskop = "Vaga";
                } else {
                    horoskop = "Devica";
                }
                break;
            case 10:
                if (dan >= 23) {
                    horoskop = "Škorpija";
                } else {
                    horoskop = "Vaga";
                }
                break;
            case 11:
                if (dan >= 22) {
                    horoskop = "Strelac";
                } else {
                    horoskop = "Škorpija";
                }
                break;
            case 12:
                if (dan >= 22) {
                    horoskop = "Jarac";
                } else {
                    horoskop = "Strelac";
                }
                break;
            default:
                System.out.println("Uneli ste nevalidan datum.");
                input.close();
                return;
        }

        System.out.println("Vaš horoskopski znak je: " + horoskop);

        input.close();
    }
}
