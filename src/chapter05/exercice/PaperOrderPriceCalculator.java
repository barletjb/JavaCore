package chapter05.exercice;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    public static final int MIN_ORDER_PAGES = 200;
    public static final int MAX_ORDER_PAGES = 200000;

    public static final int TVA = 20;
    public static final double DELIVERY_CHARGE = 9.99;

    public static final int FIRST_TIER_LIMIT = 10000;
    public static final int SECOND_TIER_LIMIT = 30000;

    public static final double FIRST_TIER_UNIT_PRICE = 0.01;
    public static final double SECOND_TIER_UNIT_PRICE = 0.005;
    public static final double THIRD_TIER_UNIT_PRICE = 0.0025;


    /**
     * Calculates the HT price based on volume thresholds and discounts.
     *
     * @param pages number of pages ordered
     * @return price without TVA
     */
    public static double calculatePriceForThresholds(int pages) {

        double totalprice = 0;

        if (pages > SECOND_TIER_LIMIT) {
            double priceAboveThreshold2 = (pages - SECOND_TIER_LIMIT) * THIRD_TIER_UNIT_PRICE;
            totalprice += priceAboveThreshold2;
            pages = SECOND_TIER_LIMIT;
        }

        if (pages > FIRST_TIER_LIMIT) {
            double priceAboveThreshold1 = (pages - FIRST_TIER_LIMIT) * SECOND_TIER_UNIT_PRICE;
            totalprice += priceAboveThreshold1;
            pages = FIRST_TIER_LIMIT;
        }

        if (pages <= FIRST_TIER_LIMIT) {
            double priceBelowThreshold1 = pages * FIRST_TIER_UNIT_PRICE;
            totalprice += priceBelowThreshold1;
        }
        return totalprice;
    }

    /**
     * Calculates the TTC price (HT + TVA).
     *
     * @param priceWithoutTva price excluding VAT
     * @param TVA TVA percentage to apply
     * @return price including TVA
     */
    public static double calculatePriceWithTva (double priceWithoutTva, final int TVA){
        return priceWithoutTva + (priceWithoutTva * TVA / 100);
    }

    /**
     * Determines whether a delivery charge applies.
     *
     * @param price price excluding TVA
     * @return {true} if delivery charge should be applied, {false} otherwise
     */
    public static boolean hasDeliveryCharge(double price) {
        return price < 200;
    }

    /**
     * Prints the full order summary (HT, TTC, and final price).
     *
     * @param priceHt         price excluding VAT
     * @param priceTtc        price including VAT
     * @param fraisLivraison  whether delivery charge applies
     */
    public static void printFinalOrderSummary(double priceHt, double priceTtc, boolean fraisLivraison) {
        System.out.println("Le prix total de votre commande HT est de : " + priceHt + "€ ");
        System.out.println("Le prix total de votre commande TTC est de : " + priceTtc + "€ ");

        if (fraisLivraison) {
            double finalPrice = priceTtc + DELIVERY_CHARGE;
            System.out.println("Le prix final est de " + finalPrice + " € | Dont : " + DELIVERY_CHARGE + "€ de frais de livraison.");
        } else {
            System.out.println("Les frais de livraison sont offerts.");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPages;
        int userTry = 5;

        do {
            System.out.print("Veuillez saisir le nombre de pages à imprimer pour votre commande (Min : " + MIN_ORDER_PAGES + " | Max : " + MAX_ORDER_PAGES + ") :");
            numberOfPages = scanner.nextInt();

            if (numberOfPages < MIN_ORDER_PAGES) {
                System.out.println("Une commande ne peut pas faire moins de " + MIN_ORDER_PAGES + " pages.");
            } else if (numberOfPages > MAX_ORDER_PAGES) {
                System.out.println("Une commande ne peut pas faire plus de " + MAX_ORDER_PAGES + " pages.");
            } else {
                System.out.println("Votre commande est de " + numberOfPages + " pages");
                break;
            }

            userTry--;

            if (userTry > 0 ) {
                System.out.println("Il vous reste : " + userTry + " tentatives.");
            }
            else {
                System.out.println("Vous n'avez plus de tentatives. Le programme s'arrête");
            }

        } while ((numberOfPages < MIN_ORDER_PAGES || numberOfPages > MAX_ORDER_PAGES) && userTry > 0);


        if (numberOfPages >= 200) {
            double priceWithoutTva = calculatePriceForThresholds(numberOfPages);
            double priceWithTva = calculatePriceWithTva(priceWithoutTva, TVA);
            boolean hasDelivery = hasDeliveryCharge(priceWithoutTva);

            printFinalOrderSummary(priceWithoutTva, priceWithTva, hasDelivery);
        }

    }
}

