package chapter04.function.exercice.project.refractor;

import java.util.Scanner;

public class FunctionRefactorAgeBasedDiscount {

    public static final int YOUNG_AGE = 25;
    public static final int OLD_AGE = 65;
    public static final double NORMAL_PRICE = 50.0;
    public static final double YOUNG_REDUC = 0.25;
    public static final double OLD_REDUC = 0.75;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre âge");
        int age = scanner.nextInt();

        displayPrice(age);

    }

    /**
     * Calculates and displays the ticket price based on the user's age.
     * Applies a youth discount for users aged 25 or under, and a senior discount
     * for users aged 65 or older. Then displays the applicable message and final price.
     * @param age the age of the user
     */
    public static void displayPrice(int age) {

        double price = calculatePrice(age);

        if (age <= YOUNG_AGE) {
            System.out.println("le Forfait Jeune s'applique.");
        }
        if (age >= OLD_AGE) {
            System.out.println("le Forfait Senior s'applique.");
        }
        displayOnlyPrice(price);
    }

    /**
     * Simple display
     *
     * @param price
     */
    private static void displayOnlyPrice(double price) {
        System.out.println("Le prix de votre billet est de : " + price + " €");
    }

    /**
     * Calcul inputPrice
     *
     * @param age
     * @return price
     */
    private static double calculatePrice(int age) {

        if (age <= YOUNG_AGE) {
            return NORMAL_PRICE * (1.0 - YOUNG_REDUC);
        }
        if (age >= OLD_AGE) {
            return NORMAL_PRICE * (1.0 - OLD_REDUC);
        }

        return NORMAL_PRICE;
    }

}


