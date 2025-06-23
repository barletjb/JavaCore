package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorCoinChangerV2 {

    public static final int EUR_50 = 50;
    public static final int EUR_20 = 20;
    public static final int EUR_10 = 10;
    public static final int EUR_5 = 5;
    public static final int EUR_2 = 2;
    public static final int EUR_1 = 1;

        public static void main(String[] args) {

            //Facture totale
            int totalBill = 73;
            //Montant payé
            int amountPaid = 200;


            //Initialisation stock distributeur
            int stockOf5O = 1;
            int stockOf20 = 2;
            int stockOf10 = 3;
            int stockOf5 = 1;
            int stockOf2 = 2;
            int stockOf1 = 3;

            int totalDistributeur = (stockOf5O * EUR_50) + (stockOf20 * EUR_20) + (stockOf10 * EUR_10)
                    + (stockOf5 * EUR_5) + (stockOf2 * EUR_2) + (stockOf1 * EUR_1);


            // Si le montant est insuffisant
            if (totalBill > amountPaid) {
                System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
            } else if (totalBill == amountPaid) {
                System.out.println("Le réglèment est accepté, pas besoin de rendre la monnaie");
            }
            // Si solde distributeur insuffisant
            else if (totalDistributeur < (amountPaid - totalBill)) {
                System.err.println("Le solde du distributeur est insuffisant : impossible de rendre la monnaie");
            }

            // Condition en cascade avec % et /
            else {
                int changeAmount = amountPaid - totalBill;

                // Combien de billet(s) de 50
                int requiredOf50 = calculNbChange(changeAmount, EUR_50, stockOf5O);
                if (requiredOf50 > 0) {
                    changeAmount -= requiredOf50 * EUR_50;
                    stockOf5O -= requiredOf50;
                    System.out.println("Le nombre de billet(s) de " + EUR_50 + " € rendu est de : " + requiredOf50);
                }

                // Combien de billet(s) de 20
                int requiredOf20 = calculNbChange(changeAmount, EUR_20, stockOf20);
                if (requiredOf20 > 0) {
                    changeAmount -= requiredOf20 * EUR_20;
                    stockOf20 -= requiredOf20;
                    System.out.println("Le nombre de billet(s) de " + EUR_20 + " € rendu est de : " + requiredOf20);
                }

                // Combien de billet(s) de 10
                int requiredOf10 = calculNbChange(changeAmount, EUR_10, stockOf10);
                if (requiredOf10 > 0) {
                    changeAmount -= requiredOf10 * EUR_10;
                    stockOf10 -= requiredOf10;
                    System.out.println("Le nombre de billet(s) de " + EUR_10 + " € rendu est de : " + requiredOf10);
                }

               // Combien de billet(s) de 5
                int requiredOf5 = calculNbChange(changeAmount, EUR_5, stockOf5);
                if (requiredOf5 > 0) {
                    changeAmount -= requiredOf5 * EUR_5;
                    stockOf5 -= requiredOf5;
                    System.out.println("Le nombre de billet(s) de " + EUR_5 + " € rendu est de : " + requiredOf5);
                }

                // Combien de pièce(s) de 2
                int requiredOf2 = calculNbChange(changeAmount, EUR_2, stockOf2);
                if (requiredOf2 > 0) {
                    changeAmount -= requiredOf2 * EUR_2;
                    stockOf2 -= requiredOf2;
                    System.out.println("Le nombre de billet(s) de " + EUR_2 + " € rendu est de : " + requiredOf2);
                }

                // Combien de pièce(s) de 1
                int requiredOf1 = calculNbChange(changeAmount, EUR_1, stockOf1);
                if (requiredOf1 > 0) {
                    changeAmount -= requiredOf1 * EUR_1;
                    stockOf1 -= requiredOf1;
                    System.out.println("Le nombre de billet(s) de " + EUR_1 + " € rendu est de : " + requiredOf1);
                }

                // Affichage descriptif TOTAL à rendre
                System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");

            }
        }

    /**
     * Returns the number of coins or bills to give back for a given value,
     * based on the available stock and remaining change.
     *
     * @param changeAmount the remaining change to give
     * @param EUR the coin or bill value
     * @param stockOf the number of coins or bills available
     * @return the number to return, limited by stock and change amount
     */
        public static int calculNbChange(int changeAmount, int EUR , int stockOf){
            if (changeAmount >= EUR && stockOf > 0) {
                int requiredOf = changeAmount / EUR;

                //Check stock billet
                if (requiredOf > stockOf) {
                    requiredOf = stockOf;
                }
                return requiredOf;
            }
            return 0;
        }

    }

