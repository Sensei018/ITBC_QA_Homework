package Java_POM_Selenium_TestNG.Bonus_Domaci.Java_Bonus_Zadaci;

public class Zadatak5 {

    /*
    5.	Napisati program koji sabira parne prirodne brojeve
    do 100.
     */
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i <= 100; i += 2) {

            sum += i;
            System.out.println("Suma parnih brojeva do 100 je: " + sum);

        }
    }
}
