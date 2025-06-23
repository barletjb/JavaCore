package javacore.chapter04.function.exercice.project.refractor;

import java.util.Scanner;

public class FunctionRefractorAgeBasedDiscount {

    public static final int YOUNG_AGE = 25;
    public static final int OLD_AGE = 65;
    public static final double NORMAL_PRICE = 50.0;
    public static final double YOUNG_REDUC = 0.25;
    public static final double OLD_REDUC = 0.75;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez votre âge");
            int age = scanner.nextInt();

            double price = calculPrice(age);
            displayPrice(price,age);

        }

    /**
     * Simple display
     * @param price
     */
        public static void displayOnlyPrice(double price){
            System.out.println("Le prix de votre billet est de : " + price + " €");
        }

    /**
     * Display with param
     * @param price
     * @param age
     */
    public static void displayPrice(double price, int age) {

            if (age <= YOUNG_AGE){
                System.out.println("le Forfait Jeune s'applique.");
                displayOnlyPrice(price);
            }
            else if (age >= OLD_AGE) {
                System.out.println("le Forfait Senior s'applique.");
                displayOnlyPrice(price);
            }
            else {
                displayOnlyPrice(price);
            }
        }

    /**
     * Calcul inputPrice
     * @param age
     * @return price
     */
        public static double calculPrice(int age){

            if (age <= YOUNG_AGE) {
                return NORMAL_PRICE * ( 1.0 - YOUNG_REDUC);
            }
            else if (age >= OLD_AGE) {
                return NORMAL_PRICE * ( 1.0 - OLD_REDUC);
            }
            else {
                return NORMAL_PRICE;
            }
        }

    }


