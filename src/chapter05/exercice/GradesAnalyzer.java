package chapter05.exercice;

import java.util.Scanner;

public class GradesAnalyzer {

    public static Scanner s = new Scanner(System.in);

    public static final int RANGE_0_5_FROM = 0;
    public static final int RANGE_0_5_TO   = 5;

    public static final int RANGE_6_10_FROM = 6;
    public static final int RANGE_6_10_TO   = 10;

    public static final int RANGE_11_15_FROM = 11;
    public static final int RANGE_11_15_TO   = 15;

    public static final int RANGE_16_20_FROM = 16;
    public static final int RANGE_16_20_TO   = 20;

    public final int THRESHOLD= 12;

    private final int[] grades;

    public GradesAnalyzer() {

        this.grades = createArray();
        enterRating(this.grades);

    }

    // Gestion Exception pour erreur de taille
    public static class SizeException extends Exception {
        public SizeException(String message) {
            super(message);
        }
    }

    public static void validateSize(int size) throws SizeException {
        if (size < 2 || size > 30) {
            throw new SizeException("Vous ne pouvez ajouter que 2 à 30 notes !");
        }
    }

    public static int[] createArray() {
        int size;

        while (true) {
            try {
                System.out.print("Combien de notes souhaitez-vous entrer (entre 2 et 30) ? ");
                size = s.nextInt();
                validateSize(size);
                break;
            } catch (SizeException e) {
                System.out.println(e.getMessage());
            }
        }
        return new int[size];
    }


    // Gestion Exception pour erreur de note
    public static class RatingException extends Exception {
        public RatingException(String message) {
            super(message);
        }
    }

    public static void validateRating(int rating) throws RatingException {
        if (rating < 0 || rating > 20) {
            throw new RatingException("Votre note doit être comprise entre 0 et 20 !");
        }
    }

    public static void enterRating(int[] userArray) {
        int rating;

        for (int i = 0; i < userArray.length; i++) {
            while (true) {
                try {
                    System.out.print("Entrez une note (entre 0 et 20) : ");
                    rating = s.nextInt();
                    validateRating(rating);
                    userArray[i] = rating;
                    break;
                } catch (RatingException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void displayInformations() {
        System.out.println("---------- Notes saisies ----------");

        for (int i = 0; i < this.grades.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + this.grades[i]);
        }
        System.out.println();
        System.out.println("---------- Affichage ----------");
        System.out.println("La moyenne de l'élève est de : " + getAverage() + "/20");
        System.out.println("La note la plus haute est : " + getMaxGrade() + "/20");
        System.out.println("La note la plus petite est : " + getMinGrade() + "/20");
        System.out.println("Nombre de notes > " + THRESHOLD + " = " + getGradeCountAboveThreshold() + " (soit " + getPercentageAboveThreshold() + "%)");

    }

    public void displayGradeRanges() {
        System.out.println("---------- Répartition par intervalle ----------");

        int count_0_5 = getGradeCountBetweenRange(RANGE_0_5_FROM, RANGE_0_5_TO);
        int percent_0_5 = getPercentageBetweenRange(RANGE_0_5_FROM,RANGE_0_5_TO);
        System.out.println("Nombre de notes [0 - 5] = " + count_0_5 + " (soit " + percent_0_5 + "%)");

        int count_6_10 = getGradeCountBetweenRange(RANGE_6_10_FROM, RANGE_6_10_TO);
        int percent_6_10 = getPercentageBetweenRange(RANGE_6_10_FROM,RANGE_6_10_TO);
        System.out.println("Nombre de notes [6 - 10] = " + count_6_10 + " (soit " + percent_6_10 + "%)");

        int count_11_15 = getGradeCountBetweenRange(RANGE_11_15_FROM, RANGE_11_15_TO);
        int percent_11_15 = getPercentageBetweenRange(RANGE_11_15_FROM,RANGE_11_15_TO);
        System.out.println("Nombre de notes [11 - 15] = " + count_11_15 + " (soit " + percent_11_15 + "%)");

        int count_16_20 = getGradeCountBetweenRange(RANGE_16_20_FROM, RANGE_16_20_TO);
        int percent_16_20 = getPercentageBetweenRange(RANGE_16_20_FROM,RANGE_16_20_TO);
        System.out.println("Nombre de notes [16 - 20] = " + count_16_20 + " (soit " + percent_16_20 + "%)");
    }

    public double getAverage() {

        double totalRating = 0;

        for (int i = 0; i < this.grades.length; i++) {
            totalRating += this.grades[i];
        }

        return totalRating / this.grades.length;
    }

    public double getMinGrade() {

        double min = this.grades[0];

        for (int i = 0; i < this.grades.length; i++) {
            if (min > this.grades[i]) {
                min = this.grades[i];
            }
        }
        return min;
    }

    public double getMaxGrade() {
        double max = this.grades[0];

        for (int i = 0; i < this.grades.length; i++) {
            if (max < this.grades[i]) {
                max = this.grades[i];
            }
        }
        return max;
    }

    public int getGradeCountAboveThreshold() {

        int count = 0;

        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i] > THRESHOLD) {
                count++;
            }
        }
        return count;
    }

    public int getPercentageAboveThreshold() {
        return (getGradeCountAboveThreshold() * 100) / this.grades.length;
    }

    public int getGradeCountBetweenRange(int from, int to) {
        int count = 0;

        for (int i = 0; i < this.grades.length; i++) {
            int grade = this.grades[i];
            if (grade >= from && grade <= to) {
                count++;
            }
        }
        return count;
    }

    public int getPercentageBetweenRange(int from, int to) {
        return (getGradeCountBetweenRange(from,to) * 100) / this.grades.length;
    }


    public static void main(String[] args) {

        GradesAnalyzer analyzer = new GradesAnalyzer();
        analyzer.displayInformations();
        System.out.println();
        analyzer.displayGradeRanges();

    }
}
