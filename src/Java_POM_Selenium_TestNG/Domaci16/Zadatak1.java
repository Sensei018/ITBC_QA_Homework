package Java_POM_Selenium_TestNG.Domaci16;

import java.util.ArrayList;

/*
    Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct
    u SQLu koristeci ArrayList<Integer>. Ne morate praviti drugu klasu sem main,
     a metode prihvataju ArrayList<Integer> kao parametar.
     Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove
     tipa int (za min, max i sum) i double (za avg)
 */
public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(32);
        numbers.add(4);
        numbers.add(13);
        numbers.add(13);
        numbers.add(35);

        int min = getMin(numbers);
        int max = getMax(numbers);
        int sum = getSum(numbers);
        double avg = getAverage(numbers);

        ArrayList<Integer> distinctNumbers = getDistinct(numbers);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Distinct numbers: " + distinctNumbers);

    }

    public static int getMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;

    }

    public static int getMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 1; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static double getAverage(ArrayList<Integer> numbers) {
        int sum = getSum(numbers);
        return (double) sum / numbers.size();
    }

    public static ArrayList<Integer> getDistinct(ArrayList<Integer> numbers) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }
}



