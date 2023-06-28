package Java_POM_Selenium_TestNG.Bonus_Domaci_Java;

public class Zadatak4 {
           public static void main(String[] args) {
            String[] niz = {"Ovo", "je", "prvi", "string", "u", "nizu", "koji", "zelimo", "da", "zamenimo"};
            replaceWith(niz, "je", "nije");

            for (String s : niz) {
                System.out.print(s + " ");
            }
        }

        public static void replaceWith(String[] niz, String oldString, String newString) {

            for (int i = 0; i < niz.length; i++) {
                 if (niz[i].equals(oldString)) {
                    niz[i] = newString;
                }
            }
        }
    }
