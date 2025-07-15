package chapter04.function.exercice.project.refactor;

public class FunctionRefactorCoinChangerV1 {

    public static final int EUR_50 = 50;
    public static final int EUR_20 = 20;
    public static final int EUR_10 = 10;
    public static final int EUR_5 = 5;
    public static final int EUR_2 = 2;
    public static final int EUR_1 = 1;
    public static final String COINS = "pièce(s)";
    public static final String BILLS = "billet(s)";

        public static void main(String[] args) {

            int totalBill = 66;
            int amountPaid = 87;

            int changeAmount = amountPaid - totalBill;

            if (changeAmount < 0) {
                System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
            }
            else if (amountPaid == 0) {
                System.out.println("Le réglement est effectué, pas besoin de rendre la monnaie");
            }
            // Cascading condition using % and /
            else {
                // Number of 50€ bills
                changeAmount = calculChange(changeAmount, EUR_50, BILLS);

                // Number of 20€ bills
                changeAmount = calculChange(changeAmount, EUR_20, BILLS);

                // Number of 10€ bills
                changeAmount = calculChange(changeAmount, EUR_10, BILLS);

                // Number of 5€ bills
                changeAmount = calculChange(changeAmount,EUR_5, BILLS);

                // Number of 2€ coins
                changeAmount = calculChange(changeAmount,EUR_2, COINS);

                // Number of 1€ coins
                changeAmount =calculChange(changeAmount, EUR_1, COINS);

                System.out.println("Le montant total à rendre est de : " + (amountPaid - totalBill) + " €");
            }

        }

    /**
     * Calculates and displays how many coins or bills of a given value to return,
     * and updates the remaining change amount.
     *
     * @param changeAmount the current change to give
     * @param EUR the value of the coin or bill
     * @return the updated remaining change after giving this denomination
     */
    public static int calculChange(int changeAmount, int EUR, String typeChange) {
            if (changeAmount >= EUR) {
                int nbr_bill = changeAmount / EUR;
                changeAmount %= EUR;
                System.out.println("Le nombre de " + typeChange + " de " + EUR + " € à rendre est de : " + nbr_bill);
            }
        return changeAmount;
        }


    /**
     * Displays the number of coins or bills returned for a given denomination.
     * @param eur        the value of the coin or bill
     * @param requiredOf the quantity of coins or bills to return
     * @param typeChange the type of currency: "bill(s)" or "coin(s)"
     */
    public static void displayChange(int eur, int requiredOf, String typeChange) {
        System.out.println("Le nombre de " + typeChange + " de " + eur + " € rendu est de : " + requiredOf);
    }

    }



