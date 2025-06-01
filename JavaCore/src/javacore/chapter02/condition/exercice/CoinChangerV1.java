package javacore.chapter02.condition.exercice;

public class CoinChangerV1 {

    public static void main(String[] args) {

        //Facture totale
        int totalBill = 66;

        //Montant payé
        int amountPaid = 55;

        // Condition en cascade avec % et /
        if (amountPaid > totalBill) {
            int changeAmount = amountPaid - totalBill;

            // Combien de billet de 50
            if (changeAmount >= 50) {
                int bill_50_eur = 0;
                bill_50_eur = changeAmount / 50;
                changeAmount %= 50;
                System.out.println("Le nombre de billet(s) de 50 € à rendre est de : " + bill_50_eur);
            }

            // Combient de billet de 20
            if (changeAmount >= 20) {
                int bill_20_eur = 0;
                bill_20_eur = changeAmount / 20;
                changeAmount %= 20;
                System.out.println("Le nombre de billet(s) de 20 € à rendre est de : " + bill_20_eur);
            }

            // Combien de bilelt de 10
            if (changeAmount >= 10) {
                int bill_1O_eur = 0;
                bill_1O_eur = changeAmount / 10;
                changeAmount %= 10;
                System.out.println("Le nombre de billet(s) de 10 € à rendre est de : " + bill_1O_eur);
            }

            // Combien de billet de 5
            if (changeAmount >= 5) {
                int bill_5_eur = 0;
                bill_5_eur = changeAmount / 5;
                changeAmount %= 5;
                System.out.println("Le nombre de billet(s) de 5 € à rendre est de : " + bill_5_eur);
            }

            // Combien de pièces de 2
            if (changeAmount >= 2) {
                int bill_2_eur = 0;
                bill_2_eur = changeAmount / 2;
                changeAmount %= 2;
                System.out.println("Le nombre de pièce(s) de 2 € à rendre est de : " + bill_2_eur);
            }
            // Combien de pièces de 1
            if (changeAmount >= 1) {
                int bill_1_eur = 0;
                bill_1_eur = changeAmount / 1;
                changeAmount %= 1;
                System.out.println("Le nombre de pièce(s) de 1 € à rendre est de : " + bill_1_eur);
            }

            // Affichage descriptif total à rendre
            System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");

        // Si montant insuffisant
        } else {
            System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €" );
        }




    }
}
