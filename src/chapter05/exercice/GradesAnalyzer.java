package chapter05.exercice;

import java.util.Scanner;

public class GradesAnalyzer {

    private static final Scanner s = new Scanner(System.in);

    public static final int RANGE_0_5_FROM = 0;
    public static final int RANGE_0_5_TO = 5;

    public static final int RANGE_6_10_FROM = 6;
    public static final int RANGE_6_10_TO = 10;

    public static final int RANGE_11_15_FROM = 11;
    public static final int RANGE_11_15_TO = 15;

    public static final int RANGE_16_20_FROM = 16;
    public static final int RANGE_16_20_TO = 20;

    public final int THRESHOLD = 12;

    private final int[] grades;

    /**
     * Creates a GradesAnalyzer with a predefined array of grades.
     *
     * @param grades an array of integer grades
     */
    public GradesAnalyzer(int[] grades) {
        this.grades = grades;
    }

    // ==================== Exceptions ====================

    /**
     * Thrown when the size of the grade array is invalid (not between 2 and 30).
     */
    private static class AnalyzerArraySizeException extends Exception {
        public AnalyzerArraySizeException(String message) {
            super(message);
        }
    }

    /**
     * Thrown when a grade is out of the valid range (0 to 20).
     */
    private static class AnalyzerRateIntervalException extends Exception {
        public AnalyzerRateIntervalException(String message) {
            super(message);
        }
    }

    // ==================== Static Utilities ====================

    /**
     * Validates the size of a grade array.
     *
     * @param size the size to validate
     * @throws AnalyzerArraySizeException if size is not between 2 and 30
     */
    private static void validateSize(int size) throws AnalyzerArraySizeException {
        if (size < 2 || size > 30) {
            throw new AnalyzerArraySizeException("Vous ne pouvez ajouter que 2 à 30 notes !");
        }
    }

    /**
     * Prompts the user to define the number of grades and returns a properly sized array.
     *
     * @return an integer array with user-defined size
     */
    public static int[] createArray() {
        int size;

        while (true) {
            try {
                System.out.print("Combien de notes souhaitez-vous entrer (entre 2 et 30) ? ");
                size = s.nextInt();
                validateSize(size);
                break;
            } catch (AnalyzerArraySizeException e) {
                System.out.println(e.getMessage());
            }
        }
        return new int[size];
    }

    /**
     * Validates a single grade value.
     *
     * @param rating the grade to validate
     * @throws AnalyzerRateIntervalException if the grade is not between 0 and 20
     */
    private static void validateRating(int rating) throws AnalyzerRateIntervalException {
        if (rating < 0 || rating > 20) {
            throw new AnalyzerRateIntervalException("Votre note doit être comprise entre 0 et 20 !");
        }
    }

    /**
     * Prompts the user to enter grades into the given array, validating each entry.
     *
     * @param userArray the array to fill with grades
     */
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
                } catch (AnalyzerRateIntervalException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

// ==================== Instance Methods ====================

    /**
     * Displays all the grades along with statistical analysis.
     *
     * @param average               the average grade
     * @param maxGrade              the maximum grade
     * @param minGrade              the minimum grade
     * @param gradeCountAboveThreshold number of grades above the threshold
     * @param percentageAboveThreshold percentage of grades above the threshold
     */
    public void displayInformations(double average, double maxGrade, double minGrade, int gradeCountAboveThreshold, int percentageAboveThreshold) {
        System.out.println("---------- Notes saisies ----------");

        for (int i = 0; i < this.grades.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + this.grades[i]);
        }
        System.out.println();
        System.out.println("---------- Affichage ----------");
        System.out.println("La moyenne de l'élève est de : " + average + "/20");
        System.out.println("La note la plus haute est : " + maxGrade + "/20");
        System.out.println("La note la plus petite est : " + minGrade + "/20");
        System.out.println("Nombre de notes > " + this.THRESHOLD + " = " + gradeCountAboveThreshold + " (soit " + percentageAboveThreshold + "%)");

    }

    /**
     * Displays the count and percentage of grades within a given range.
     *
     * @param count     number of grades in the range
     * @param percent   percentage of grades in the range
     * @param rangeFrom start of the range (inclusive)
     * @param rangeTo   end of the range (inclusive)
     */
    public void displayGradeRange(int count, int percent, int rangeFrom, int rangeTo) {
        System.out.println("Nombre de note [" + rangeFrom + "-" + rangeTo + "] = " + count + " (soit " + percent + "%)");
    }

    /**
     * Computes the average of all grades.
     *
     * @return the average grade
     */
    public double getAverage() {
        double totalRating = 0;

        for (int i = 0; i < this.grades.length; i++) {
            totalRating += this.grades[i];
        }

        return totalRating / this.grades.length;
    }

    /**
     * Returns the minimum grade.
     *
     * @return the smallest grade
     */
    public double getMinGrade() {

        double min = this.grades[0];

        for (int i = 0; i < this.grades.length; i++) {
            if (min > this.grades[i]) {
                min = this.grades[i];
            }
        }
        return min;
    }

    /**
     * Returns the maximum grade.
     *
     * @return the biggest grade
     */
    public double getMaxGrade() {
        double max = this.grades[0];

        for (int i = 0; i < this.grades.length; i++) {
            if (max < this.grades[i]) {
                max = this.grades[i];
            }
        }
        return max;
    }

    /**
     * Counts the number of grades above the threshold.
     *
     * @return count of grades above threshold
     */
    public int getGradeCountAboveThreshold() {

        int count = 0;

        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i] > THRESHOLD) {
                count++;
            }
        }
        return count;
    }

    /**
     * Computes the percentage of grades above the threshold.
     *
     * @return percentage of grades above threshold
     */
    public int getPercentageAboveThreshold() {
        return (getGradeCountAboveThreshold() * 100) / this.grades.length;
    }

    /**
     * Counts the number of grades within a specific range.
     *
     * @param from start of the range (inclusive)
     * @param to   end of the range (inclusive)
     * @return number of grades in range
     */
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

    /**
     * Computes the percentage of grades within a specific range.
     *
     * @param from start of the range (inclusive)
     * @param to   end of the range (inclusive)
     * @return percentage of grades in range
     */
    public int getPercentageBetweenRange(int from, int to) {
        return (getGradeCountBetweenRange(from, to) * 100) / this.grades.length;
    }


    public static void main(String[] args) {

        int[] notes = GradesAnalyzer.createArray();
        GradesAnalyzer.enterRating(notes);

        GradesAnalyzer analyzer = new GradesAnalyzer(notes);
        analyzer.displayInformations(
                analyzer.getAverage(),
                analyzer.getMaxGrade(),
                analyzer.getMinGrade(),
                analyzer.getGradeCountAboveThreshold(),
                analyzer.getPercentageAboveThreshold());
        System.out.println();
        System.out.println("---------- Répartition par intervalle ----------");
        analyzer.displayGradeRange(analyzer.getGradeCountBetweenRange(RANGE_0_5_FROM, RANGE_0_5_TO),
                analyzer.getPercentageBetweenRange(RANGE_0_5_FROM, RANGE_0_5_TO),
                RANGE_0_5_FROM, RANGE_0_5_TO);
        analyzer.displayGradeRange(analyzer.getGradeCountBetweenRange(RANGE_6_10_FROM, RANGE_6_10_TO),
                analyzer.getPercentageBetweenRange(RANGE_6_10_FROM, RANGE_6_10_TO),
                RANGE_6_10_FROM, RANGE_6_10_TO);
        analyzer.displayGradeRange(analyzer.getGradeCountBetweenRange(RANGE_11_15_FROM, RANGE_11_15_TO),
                analyzer.getPercentageBetweenRange(RANGE_11_15_FROM, RANGE_11_15_TO),
                RANGE_11_15_FROM, RANGE_11_15_TO);
        analyzer.displayGradeRange(analyzer.getGradeCountBetweenRange(RANGE_16_20_FROM, RANGE_16_20_TO),
                analyzer.getPercentageBetweenRange(RANGE_16_20_FROM, RANGE_16_20_TO),
                RANGE_16_20_FROM, RANGE_16_20_TO);
    }

}
