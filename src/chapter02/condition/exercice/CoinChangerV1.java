package chapter02.condition.exercice;

public class CoinChangerV1 {

    public static void main(String[] args) {

        //Facture totale
        int totalBill = 66;
        //Montant payé
        int amountPaid = 87;

        //Initialisation constantes
        final int EUR_50 = 50;
        final int EUR_20 = 20;
        final int EUR_10 = 10;
        final int EUR_5 = 5;
        final int EUR_2 = 2;
        final int EUR_1= 1;


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
            if (changeAmount >= EUR_50) {
                int nbr_bill_50_eur = changeAmount / EUR_50;
                changeAmount %= EUR_50;
                System.out.println("Le nombre de billet(s) de 50 € à rendre est de : " + nbr_bill_50_eur);
            }

            // Combien de billet(s) de 20
            if (changeAmount >= EUR_20) {
                int nbr_bill_20_eur = changeAmount / EUR_20;
                changeAmount %= EUR_20;
                System.out.println("Le nombre de billet(s) de 20 € à rendre est de : " + nbr_bill_20_eur);
            }

            // Combien de billet(s) de 10
            if (changeAmount >= EUR_10) {
                int nbr_bill_1O_eur = changeAmount / EUR_10;
                changeAmount %= EUR_10;
                System.out.println("Le nombre de billet(s) de 10 € à rendre est de : " + nbr_bill_1O_eur);
            }

            // Combien de billet(s) de 5
            if (changeAmount >= EUR_5) {
                int nbr_bill_5_eur = changeAmount / EUR_5;
                changeAmount %= EUR_5;
                System.out.println("Le nombre de billet(s) de 5 € à rendre est de : " + nbr_bill_5_eur);
            }

            // Combien de pièce(s) de 2
            if (changeAmount >= EUR_2) {
                int nbr_bill_2_eur = changeAmount / EUR_2;
                changeAmount %= EUR_2;
                System.out.println("Le nombre de pièce(s) de 2 € à rendre est de : " + nbr_bill_2_eur);
            }
            // Combien de pièce(s) de 1
            if (changeAmount >= EUR_1) {
                int nbr_bill_1_eur = changeAmount / EUR_1;
                changeAmount %= EUR_1;
                System.out.println("Le nombre de pièce(s) de 1 € à rendre est de : " + nbr_bill_1_eur);
            }

            // Affichage descriptif TOTAL à rendre
            System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");
        }
    }
}
