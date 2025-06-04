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
        int stockBillet50 = 1;
        int stockBillet20 = 2;
        int stockBillet10 = 3;
        int stockBillet5 = 1;
        int stockPiece2 = 2;
        int stockPiece1 = 3;
        int totalDistributeur = (stockBillet50 * EUR_50) + (stockBillet20 * EUR_20) + (stockBillet10 * EUR_10)
                                + (stockBillet5 * EUR_5) + (stockPiece2 * EUR_2) + (stockPiece1 * EUR_1);


        // Si le montant est insuffisant
        if (totalBill > amountPaid) {
            System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
        }

        // Si solde distributeur insuffisant
        else if (totalDistributeur < (amountPaid - totalBill)) {
            System.err.println("Le solde du distributeur est insuffisant : impossible de rendre la monnaie");
        }

        // Condition en cascade avec % et /
        else {
            int changeAmount = amountPaid - totalBill;

            // Combien de billet(s) de 50
            if (changeAmount >= EUR_50 && stockBillet50 != 0) {
                int nbr_bill_50_eur = changeAmount / EUR_50;

                //Check stock billet de 50, si insuffisant else
                if (stockBillet50 >= (changeAmount / EUR_50)) {
                    changeAmount %= EUR_50;
                    System.out.println("Le nombre de billet(s) de 50 € rendu est de : " + nbr_bill_50_eur);
                    stockBillet50 -= nbr_bill_50_eur;
                }
                else {
                    changeAmount -= (stockBillet50 * EUR_50);
                    System.out.println("Le nombre de billet(s) de 50 € rendu est de : " + stockBillet50);
                    stockBillet50 = 0;
                }
            }

            // Combien de billet(s) de 20
            if (changeAmount >= EUR_20 && stockBillet20 != 0) {
                int nbr_bill_20_eur = changeAmount / EUR_20;

                //Check stock billet de 20, si insuffisant else
                if (stockBillet20 >= (changeAmount / EUR_20)) {
                    changeAmount %= EUR_20;
                    System.out.println("Le nombre de billet(s) de 20 € rendu est de : " + nbr_bill_20_eur);
                    stockBillet20 -= nbr_bill_20_eur;
                }
                else {
                    changeAmount -= (stockBillet20 * EUR_20);
                    System.out.println("Le nombre de billet(s) de 20 € rendu est de : " + stockBillet20);
                    stockBillet20 = 0;
                }
            }

            // Combien de billet(s) de 10
            if (changeAmount >= EUR_10 && stockBillet10 != 0) {
                int nbr_bill_10_eur = changeAmount / EUR_10;

                //Chekc stock billet de 10, si insuffisant else
                if (stockBillet10 >= (changeAmount / EUR_10)) {
                    changeAmount %= EUR_10;
                    System.out.println("Le nombre de billet(s) de 10 € rendu est de : " + nbr_bill_10_eur);
                    stockBillet10 -= nbr_bill_10_eur;
                }
                else {
                    changeAmount -= (stockBillet10* EUR_10);
                    System.out.println("Le nombre de billet(s) de 10 € rendu est de : " + stockBillet10);
                    stockBillet10 = 0;
                }

            }

//            // Combien de billet(s) de 5
            if (changeAmount >= EUR_5 && stockBillet5 != 0 ) {
                int nbr_bill_5_eur = changeAmount / EUR_5;

                //Check stock billet de 5, si insuffisant else
                if (stockBillet5 >= (changeAmount / EUR_5)) {
                    changeAmount %= EUR_5;
                    System.out.println("Le nombre de billet(s) de 5 € rendu est de : " + nbr_bill_5_eur);
                    stockBillet5 -= nbr_bill_5_eur;
                }
                else {
                    changeAmount -= (stockBillet5 * EUR_5);
                    System.out.println("Le nombre de billet(s) de 5 € rendu est de : " + stockBillet5);
                    stockBillet5 = 0;
                }
            }

            // Combien de pièce(s) de 2
            if (changeAmount >= EUR_2 && stockPiece2 != 0) {
                int nbr_bill_2_eur = changeAmount / EUR_2;

                //Check stock piece de 2, si insuffisant else
                if (stockPiece2>= (changeAmount / EUR_2)) {
                    changeAmount %= EUR_2;
                    System.out.println("Le nombre de pièce(s) de 2 € rendu est de : " + nbr_bill_2_eur);
                    stockPiece2 -= nbr_bill_2_eur;
                }
                else {
                    changeAmount -= (stockPiece2 * EUR_2);
                    System.out.println("Le nombre de pièce(s) de 2 € rendu est de : " + stockPiece2);
                    stockPiece2 = 0;
                }

            }
            // Combien de pièce(s) de 1
            if (changeAmount >= EUR_1 && stockPiece1 != 0) {
                int nbr_bill_1_eur = changeAmount / EUR_1;

                //Chekc stock pièce de 1, si insuffisant else
                if (stockPiece1>= (changeAmount / EUR_1)) {
                    changeAmount %= EUR_1;
                    System.out.println("Le nombre de piece(s) de 1 € rendu est de : " + nbr_bill_1_eur);
                    stockPiece1 -= nbr_bill_1_eur;
                }
                else {
                    changeAmount -= (stockPiece1 * EUR_1);
                    System.out.println("Le nombre de pièce(s) de 1 € rendu est de : " + stockPiece1);
                    stockPiece1 = 0;
                }
            }

            // Affichage descriptif TOTAL à rendre
            System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");
        }
    }
}
