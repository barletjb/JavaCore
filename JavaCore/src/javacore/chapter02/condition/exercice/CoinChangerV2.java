package javacore.chapter02.condition.exercice;

public class CoinChangerV2 {

    public static void main(String[] args) {

        //Facture totale
        int totalBill = 73;
        //Montant payé
        int amountPaid = 200;

        //Initialisation constantes
        final int EUR_50 = 50;
        final int EUR_20 = 20;
        final int EUR_10 = 10;
        final int EUR_5 = 5;
        final int EUR_2 = 2;
        final int EUR_1 = 1;

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
            if (changeAmount >= EUR_50 && stockOf5O > 0) {
                int requiredOf50 = changeAmount / EUR_50;

                //Check stock billet de 50
                if (requiredOf50 > stockOf5O) {
                    requiredOf50 = stockOf5O;
                }
                changeAmount -= requiredOf50 * EUR_50;
                stockOf5O -= requiredOf50;
                System.out.println("Le nombre de billet(s) de 50 € rendu est de : " + requiredOf50);
            }

            // Combien de billet(s) de 20
            if (changeAmount >= EUR_20 && stockOf20 > 0) {
                int requiredOf20 = changeAmount / EUR_20;

                //Check stock billet de 20, si insuffisant else
                if (requiredOf20 > stockOf20) {
                    requiredOf20 = stockOf20;
                }
                changeAmount -= requiredOf20 * EUR_20;
                stockOf5O -= requiredOf20;
                System.out.println("Le nombre de billet(s) de 20 € rendu est de : " + requiredOf20);
            }

            // Combien de billet(s) de 10
            if (changeAmount >= EUR_10 && stockOf10 > 0) {
                int requiredOf10 = changeAmount / EUR_10;

                //Check stock billet de 10, si insuffisant else
                if (requiredOf10 > stockOf10) {
                    requiredOf10 = stockOf10;
                }
                changeAmount -= requiredOf10 * EUR_10;
                stockOf5O -= requiredOf10;
                System.out.println("Le nombre de billet(s) de 10 € rendu est de : " + requiredOf10);
            }

//            // Combien de billet(s) de 5
            if (changeAmount >= EUR_5 && stockOf5 > 0) {
                int requiredOf5 = changeAmount / EUR_5;

                //Check stock billet de 5, si insuffisant else
                if (requiredOf5 > stockOf5) {
                    requiredOf5 = stockOf5;
                }
                changeAmount -= requiredOf5 * EUR_5;
                stockOf5O -= requiredOf5;
                System.out.println("Le nombre de billet(s) de 5 € rendu est de : " + requiredOf5);
            }

            // Combien de pièce(s) de 2
            if (changeAmount >= EUR_2 && stockOf2 > 0) {
                int requiredOf2 = changeAmount / EUR_2;

                //Check stock piece de 2, si insuffisant else
                if (requiredOf2 > stockOf2) {
                    requiredOf2 = stockOf2;
                }
                changeAmount -= requiredOf2 * EUR_2;
                stockOf5O -= requiredOf2;
                System.out.println("Le nombre de pièce(s) de 2 € rendu est de : " + requiredOf2);
            }

            // Combien de pièce(s) de 1
            if (changeAmount >= EUR_1 && stockOf1 > 0) {
                int requiredOf1 = changeAmount / EUR_1;

                //Chekc stock pièce de 1, si insuffisant else
                if (requiredOf1 > stockOf1) {
                    requiredOf1 = stockOf1;
                }
                changeAmount -= requiredOf1 * EUR_1;
                stockOf5O -= requiredOf1;
                System.out.println("Le nombre de piece(s) de 1 € rendu est de : " + requiredOf1);
            }

            // Affichage descriptif TOTAL à rendre
            System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");

        }
    }
}