package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

public class Zadatak18 {
    /*
    18.	Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b). Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika.
    Pozvati 3 puta metod sa razlicitim vrednostima.
     */
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 10;
        int povrsina1 = povrsina(a1, b1);

        System.out.println("Povrsina pravougaonika sa a=" + a1 + "i b=" + b1 + " je " + povrsina1);

        int a2 = 8;
        int b2 = 12;
        int povrsina2 = povrsina(a2, b2);
        System.out.println("Povrsina pravougaonika sa a=" + a2 + " i b=" + b2 + " je " + povrsina2);

        int a3 = 3;
        int b3 = 7;
        int povrsina3 = povrsina(a3, b3);
        System.out.println("Povrsina pravougaonika sa a=" + a3 + " i b=" + b3 + " je " + povrsina3);


    }
    public static int povrsina(int a, int b) {
        return a*b;
    }
}
