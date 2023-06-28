package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;

public class Zadatak3 {
    public static void main(String[] args) {
        String original = "Ovo je originalni string.";
        String obrnuto = reverse(original);
        System.out.println(obrnuto);
    }
    public static String reverse(String rec) {
        String reversed = "";
        for (int i = rec.length() - 1; i >= 0; i--) {
            reversed += rec.charAt(i);
        }
        return reversed;
    }

}
