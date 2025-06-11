package javacore.chapter03.loop.exercice;

public class CoinChangerV3 {

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
        final int EUR_1 = 1;

        int compteur50 = 0;
        int compteur20 = 0;
        int compteur10 = 0;
        int compteur5 = 0;
        int compteur2 = 0;
        int compteur1 = 0;

        int changeAmount = amountPaid - totalBill;

        // Si le montant est insufisant
        if (totalBill > amountPaid) {
            System.err.println("Solde Insuffisant, le montant manquant est de : " + (totalBill - amountPaid) + " €");
        }

        if (totalBill == amountPaid) {
            System.out.println("Le réglement est effectué, pas besoin de rendre la monnaie");
        }

        while (changeAmount >= EUR_50){
            compteur50++;
            changeAmount -= EUR_50;
        }

        while (changeAmount >= EUR_20){
            compteur20++;
            changeAmount -= EUR_20;
        }

        while (changeAmount >= EUR_10){
            compteur10++;
            changeAmount -= EUR_10;
        }

        while (changeAmount >= EUR_5){
            compteur5++;
            changeAmount -= EUR_5;
        }

        while (changeAmount >= EUR_2){
            compteur2++;
            changeAmount -= EUR_2;
        }

        while (changeAmount >= EUR_1){
            compteur1++;
            changeAmount -= EUR_1;
        }

        System.out.println("Le montant totale à rendre est de : " + (amountPaid - totalBill) + " €");
        System.out.println("Le nombre de pièce(s) de 1 € à rendre est de : " + compteur1);
        System.out.println("Le nombre de pièce(s) de 2 € à rendre est de : " + compteur2);
        System.out.println("Le nombre de billet(s) de 5 € à rendre est de : " + compteur5);
        System.out.println("Le nombre de billet(s) de 10 € à rendre est de : " + compteur10);
        System.out.println("Le nombre de billet(s) de 20 € à rendre est de : " + compteur20);
        System.out.println("Le nombre de billet(s) de 50 € à rendre est de : " + compteur50);
        
    }
}



