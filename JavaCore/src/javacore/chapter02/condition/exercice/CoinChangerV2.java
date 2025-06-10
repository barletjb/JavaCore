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
        final int EUR_1= 1;

        //Initialisation stock distributeur
        int available5O = 1;
        int available20 = 2;
        int available10 = 3;
        int available5 = 1;
        int available2 = 2;
        int available1 = 3;
        int totalDistributeur = (available5O * EUR_50) + (available20 * EUR_20) + (available10 * EUR_10)
                                + (available5 * EUR_5) + (available2 * EUR_2) + (available1 * EUR_1);


        // Si le montant est insuffisant
        if (totalBill > amountPaid) {
            System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
        }
        else if (totalBill == amountPaid) {
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
            if (changeAmount >= EUR_50 && available5O > 0) {
                int requiredOf50 = changeAmount / EUR_50;

                //Check stock billet de 50, si insuffisant else
                if (requiredOf50 <= available5O ) {
                    changeAmount %= EUR_50;
                    System.out.println("Le nombre de billet(s) de 50 € rendu est de : " + requiredOf50);
                    available5O -= requiredOf50;
                }
                else {
                    changeAmount -= (available5O * EUR_50);
                    System.out.println("Le nombre de billet(s) de 50 € rendu est de : " + available5O);
                    available5O = 0;
                }
            }

            // Combien de billet(s) de 20
            if (changeAmount >= EUR_20 && available20 > 0) {
                int requiredOf20 = changeAmount / EUR_20;

                //Check stock billet de 20, si insuffisant else
                if (requiredOf20 <= available20) {
                    changeAmount %= EUR_20;
                    System.out.println("Le nombre de billet(s) de 20 € rendu est de : " + requiredOf20);
                    available20 -= requiredOf20;
                }
                else {
                    changeAmount -= (available20 * EUR_20);
                    System.out.println("Le nombre de billet(s) de 20 € rendu est de : " + available20);
                    available20 = 0;
                }
            }

            // Combien de billet(s) de 10
            if (changeAmount >= EUR_10 && available10 > 0) {
                int requiredOf10 = changeAmount / EUR_10;

                //Chekc stock billet de 10, si insuffisant else
                if (requiredOf10 <= available10) {
                    changeAmount %= EUR_10;
                    System.out.println("Le nombre de billet(s) de 10 € rendu est de : " + requiredOf10);
                    available10 -= requiredOf10;
                }
                else {
                    changeAmount -= (available10 * EUR_10);
                    System.out.println("Le nombre de billet(s) de 10 € rendu est de : " + available10);
                    available10 = 0;
                }

            }

//            // Combien de billet(s) de 5
            if (changeAmount >= EUR_5 && available5 > 0 ) {
                int requiredOf5 = changeAmount / EUR_5;

                //Check stock billet de 5, si insuffisant else
                if (requiredOf5 <= available5) {
                    changeAmount %= EUR_5;
                    System.out.println("Le nombre de billet(s) de 5 € rendu est de : " + requiredOf5);
                    available5 -= requiredOf5;
                }
                else {
                    changeAmount -= (available5 * EUR_5);
                    System.out.println("Le nombre de billet(s) de 5 € rendu est de : " + available5);
                    available5 = 0;
                }
            }

            // Combien de pièce(s) de 2
            if (changeAmount >= EUR_2 && available2 > 0) {
                int requiredOf2 = changeAmount / EUR_2;

                //Check stock piece de 2, si insuffisant else
                if (requiredOf2 <= available2) {
                    changeAmount %= EUR_2;
                    System.out.println("Le nombre de pièce(s) de 2 € rendu est de : " + requiredOf2);
                    available2 -= requiredOf2;
                }
                else {
                    changeAmount -= (available2 * EUR_2);
                    System.out.println("Le nombre de pièce(s) de 2 € rendu est de : " + available2);
                    available2 = 0;
                }

            }
            // Combien de pièce(s) de 1
            if (changeAmount >= EUR_1 && available1 > 0) {
                int requiredOf1 = changeAmount / EUR_1;

                //Chekc stock pièce de 1, si insuffisant else
                if (requiredOf1 <= available1) {
                    changeAmount %= EUR_1;
                    System.out.println("Le nombre de piece(s) de 1 € rendu est de : " + requiredOf1);
                    available1 -= requiredOf1;
                }
                else {
                    changeAmount -= (available1 * EUR_1);
                    System.out.println("Le nombre de pièce(s) de 1 € rendu est de : " + available1);
                    available1 = 0;
                }
            }

            // Affichage descriptif TOTAL à rendre
            System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");
        }
    }
}
