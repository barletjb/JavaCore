package chapter04.function.exercice.project.refractor;

import java.util.Scanner;

public class FunctionRefactorAgeCategorisation {

    public static final int CHILD_AGE = 10;
    public static final int YOUNG_AGE = 18;
    public static final int YOUNG_ADULT_AGE = 25;
    public static final double ADULT_AGE = 65;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre âge");
        int age = scanner.nextInt();
        displayGeneration(age);
    }

    /**
     * Simple display
     * @param age
     */
    private static void displayOnlyAge(int age){
        System.out.println("Votre age est de : " + age + " ans.");
    }

    /**
     * Display generation
     * @param age
     */
    public static void displayGeneration(int age){
        displayOnlyAge(age);
        if ( age < CHILD_AGE ) {
            System.out.println("Vous êtes un enfant.");
        } else if (age < YOUNG_AGE ) {
            System.out.println("Vous êtes un adolescent.");
        } else if (age < YOUNG_ADULT_AGE) {
            System.out.println("Vous êtes un jeune adulte.");
        } else if (age < ADULT_AGE) {
            System.out.println("Vous êtes un adulte.");
        } else {
            System.out.println("Vous êtes un sénior.");
        }
    }
}
