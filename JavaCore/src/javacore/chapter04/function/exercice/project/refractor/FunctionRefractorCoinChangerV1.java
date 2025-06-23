package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorCoinChangerV1 {

    public static final int EUR_50 = 50;
    public static final int EUR_20 = 20;
    public static final int EUR_10 = 10;
    public static final int EUR_5 = 5;
    public static final int EUR_2 = 2;
    public static final int EUR_1 = 1;

        public static void main(String[] args) {

            //Facture totale
            int totalBill = 66;
            //Montant payé
            int amountPaid = 87;

            // Si le montant est insufisant
            if (totalBill > amountPaid) {
                System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
            }
            else if (totalBill == amountPaid) {
                System.out.println("Le réglement est effectué, pas besoin de rendre la monnaie");
            }
            // Condition en cascade avec % et /
            else {
                int changeAmount = amountPaid - totalBill;
                // Combien de billet(s) de 50
                changeAmount = calculChange(changeAmount, EUR_50);
                // Combien de billet(s) de 20
                changeAmount = calculChange(changeAmount, EUR_20);
                // Combien de billet(s) de 10
                changeAmount = calculChange(changeAmount, EUR_10);
                // Combien de billet(s) de 5
                changeAmount = calculChange(changeAmount,EUR_5);
                // Combien de pièce(s) de 2
                changeAmount = calculChange(changeAmount,EUR_2);
               // Combien de pièce(s) de 1
                changeAmount =calculChange(changeAmount, EUR_1);

                // Affichage descriptif TOTAL à rendre
                System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");
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
    public static int calculChange(int changeAmount, int EUR) {
            if (changeAmount >= EUR) {
                int nbr_bill = changeAmount / EUR;
                changeAmount %= EUR;
                System.out.println("Le nombre de pièce(s) de " + EUR + " € à rendre est de : " + nbr_bill);
            }
        return changeAmount;
        }

    }

