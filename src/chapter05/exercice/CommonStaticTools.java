package chapter05.exercice;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CommonStaticTools {

    public static void main(String[] args) {


        //Bubble Sorting :

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //Grade Analyzer :

        int threshold = 12;
        int[] newArray = GradesAnalyzer.createArray();
        GradesAnalyzer.enterRating(newArray);
        GradesAnalyzer analyzer = new GradesAnalyzer(newArray);

        double average = Arrays.stream(newArray).average().orElse(0);
        int maxRate = Arrays.stream(newArray).max().orElse(0);
        int minRate = Arrays.stream(newArray).min().orElse(0);
        int countAboveThreshold = (int) Arrays.stream(newArray).filter(filter -> filter > threshold).count();

        analyzer.displayInformations(average,maxRate,minRate,countAboveThreshold,analyzer.getPercentageAboveThreshold());
        System.out.println();


        //Racine carée et Puissance :
        System.out.println("---------- Racine carée et Puissance ----------");
        double r = Math.sqrt(25);
        System.out.println("Racine carrée de 25 est de : " + r);
        double p = Math.pow(2, 10);
        System.out.println("Le calcul de 2^10 est de : " + p);












    }
}
