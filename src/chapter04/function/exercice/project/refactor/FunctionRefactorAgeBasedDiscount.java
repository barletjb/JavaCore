package chapter04.function.exercice.project.refactor;

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

        double discountRate = getDiscountRateByAge(age);
        double finalPrice = calculatePrice(NORMAL_PRICE, discountRate);

        System.out.println("Le prix  de votre billet est de " + finalPrice + " €");

    }

    /**
     * Determines the discount rate to apply based on the user's age.
     * - Applies a YOUNG_REDUC discount for customers aged 25 or less.
     * - Applies a OLD_REDUC discount for customers aged 65 or more.
     * - No discount for others.
     *
     * @param age the age of the customer
     * @return the discount rate (0.0 if no discount)
     */
    public static double getDiscountRateByAge(int age) {

        if (age <= YOUNG_AGE) {
            System.out.println("le Forfait Jeune s'applique.");
            return YOUNG_REDUC;
        }
        if (age >= OLD_AGE) {
            System.out.println("le Forfait Senior s'applique.");
            return OLD_REDUC;
        }

        return 0;
    }

    /**
     * Calculates the final price after applying the discount.
     *
     * @param NORMAL_PRICE the base price without any discount
     * @param discountRate the discount rate to apply (between 0.0 and 1.0)
     * @return the final ticket price after discount
     */
    private static double calculatePrice(final double NORMAL_PRICE, double discountRate) {

        return NORMAL_PRICE * (1.0 - discountRate);
    }


}


