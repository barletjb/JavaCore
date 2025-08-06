package chapter05.exercice;

import java.util.Scanner;

public class GradesAnalyzer {

    public static Scanner s = new Scanner(System.in);

    public double average;
    public double max;
    public double min;
    public int threshold;
    public int countAboveThreshold;
    public int percentageAboveThreshold;

    public GradesAnalyzer(double average, double max, double min, int threshold, int count, int percentage) {
        this.average = average;
        this.max = max;
        this.min = min;
        this.threshold = threshold;
        this.countAboveThreshold = count;
        this.percentageAboveThreshold = percentage;
    }


    public static void displayInformations(int[] userArray, GradesAnalyzer infos) {
        System.out.println("---------- Notes saisies ----------");

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + userArray[i]);
        }
        System.out.println();
        System.out.println("---------- Affichage ----------");
        System.out.println("La moyenne de l'élève est de : " + infos.average + "/20");
        System.out.println("La note la plus haute est : " + infos.max + "/20");
        System.out.println("La note la plus petite est : " + infos.min + "/20");
        System.out.println("Nombre de notes > " + infos.threshold  + " = " + infos.countAboveThreshold + " (soit " + infos.percentageAboveThreshold + "%)");

    }

    public static void displayGradeRanges(int[] gradesArray) {
        System.out.println("---------- Répartition par intervalle ----------");

        int count_0_5 = getGradeCountBetweenRange(gradesArray, 0, 5);
        int percent_0_5 = getPercentageAboveThreshold(gradesArray, count_0_5);
        System.out.println("Nombre de notes [0 - 5] = " + count_0_5 + " (soit " + percent_0_5 + "%)");

        int count_6_10 = getGradeCountBetweenRange(gradesArray, 6, 10);
        int percent_6_10 = getPercentageAboveThreshold(gradesArray, count_6_10);
        System.out.println("Nombre de notes [6 - 10] = " + count_6_10 + " (soit " + percent_6_10 + "%)");

        int count_11_15 = getGradeCountBetweenRange(gradesArray, 11, 15);
        int percent_11_15 = getPercentageAboveThreshold(gradesArray, count_11_15);
        System.out.println("Nombre de notes [11 - 15] = " + count_11_15 + " (soit " + percent_11_15 + "%)");

        int count_16_20 = getGradeCountBetweenRange(gradesArray, 16, 20);
        int percent_16_20 = getPercentageAboveThreshold(gradesArray, count_16_20);
        System.out.println("Nombre de notes [16 - 20] = " + count_16_20 + " (soit " + percent_16_20 + "%)");
    }

    public static int[] createArray(){

        int size;
        boolean isValid;

        do {
            System.out.print("Combien de notes souhaitez-vous entrer (entre 2 et 30) ? ");
            size = s.nextInt();

            isValid = searchSizeError(size);

        }while (!isValid);

        return new int[size];
    }

    public static void enterRating(int[] userArray){

        boolean isValid;
        int rating;

        for (int i = 0; i < userArray.length; i ++) {
            do {
                System.out.print("Entrez une note (entre 0 et 20) : ");
                rating = s.nextInt();
                isValid = searchRatingError(rating);

            } while (!isValid);

        userArray[i] = rating;

        }

    }

    public static double getAverage(int[] gradesArray){

        double totalRating = 0;

        for ( int i = 0 ; i < gradesArray.length; i++){
            totalRating += gradesArray[i];
        }

        return totalRating / gradesArray.length;
    }

    public static double getMinGrade(int[] gradesArray){

        double min = gradesArray[0];

        for ( int i = 0 ; i < gradesArray.length; i++){
            if (min > gradesArray[i]){
                min = gradesArray[i];
            }
        }
        return min;
    }

    public static double getMaxGrade(int[] gradesArray){
        double max = gradesArray[0];

        for ( int i = 0 ; i < gradesArray.length; i++){
            if (max < gradesArray[i]){
                max = gradesArray[i];
            }
        }
        return max;
    }

    public static int getGradeCountAboveThreshold(int[] gradesArray, int threshold){

        int count = 0;

        for ( int i = 0 ; i < gradesArray.length; i++){
            if (gradesArray[i] > threshold){
                count++;
            }
        }
        return count;
    }

    public static int getGradeCountBetweenRange(int[] gradesArray, int from, int to) {
        int count = 0;

        for (int i = 0; i < gradesArray.length; i++) {
            int grade = gradesArray[i];
            if (grade >= from && grade <= to) {
                count++;
            }
        }
        return count;
    }

    public static int getPercentageAboveThreshold(int[] gradesArray, int count){
        return (count * 100) / gradesArray.length;
    }


    public static boolean searchSizeError(int size){

        if (size >= 2 && size <= 30){
            return true;
        } else {
            System.out.println("Vous ne pouvez ajouter que 2 à 30 notes !");
            return false;
        }
    }

    public static boolean searchRatingError(int userRating){

        if (userRating >= 0 && userRating <= 20){
            return true;
        } else {
            System.out.println("Votre note doit être comprise entre 0 et 20 !");
            return false;
        }
    }


    public static void main(String[] args) {

        int threshold = 12;

        int[] userArray = createArray();
        System.out.println(userArray.length);
        enterRating(userArray);
        double average = getAverage(userArray);
        double min = getMinGrade(userArray);
        double max = getMaxGrade(userArray);
        int count = getGradeCountAboveThreshold(userArray, threshold);
        int percentage = getPercentageAboveThreshold(userArray, count);

        GradesAnalyzer report = new GradesAnalyzer(average,max,min,threshold,count,percentage);

        displayInformations(userArray,report);
        System.out.println();
        displayGradeRanges(userArray);

    }
}
