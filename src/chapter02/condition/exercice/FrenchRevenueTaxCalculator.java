package chapter02.condition.exercice;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // Valeur salaire net imposable à tester : 8000, 20000, 50000, 100000
        double netTaxableSalary_5 = 180000;

        // Initialisation constante : Paliers + Pourcentage Impôts
        final double TAXES_THRESHOLDS_1  = 11294;
        final double TAXES_POURCENTAGE_1 = 11 / 100.0;

        final double TAXES_THRESHOLDS_2  = 28797;
        final double TAXES_POURCENTAGE_2 = 30 / 100.0;

        final double TAXES_THRESHOLDS_3  = 82341;
        final double TAXES_POURCENTAGE_3 = 41 / 100.0;

        final double TAXES_THRESHOLDS_4  = 177105;
        final double TAXES_POURCENTAGE_4 = 45 / 100.0;
        
        // Initialisation Total impot.
        double irTotal =  0;

        // Initialisation Barème.
        String bareme4 = ("Barème : Supérieur à : " + TAXES_THRESHOLDS_4 + "  est de "+ TAXES_POURCENTAGE_4+ " %.");
        String bareme3 = ("Barème : Entre : " + TAXES_THRESHOLDS_3 + " et " + TAXES_THRESHOLDS_4 + "  est de " + TAXES_POURCENTAGE_3 + " %.");
        String bareme2 = ("Barème : Entre : " + TAXES_THRESHOLDS_2 + " et " + TAXES_THRESHOLDS_3 + "  est de " + TAXES_POURCENTAGE_2 + " %.");
        String bareme1 = ("Barème : Entre : " + TAXES_THRESHOLDS_1 + " et " + TAXES_THRESHOLDS_2 + " est de " + TAXES_POURCENTAGE_1 + " %.");

        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + netTaxableSalary_5 + " €");
        System.out.println("------ Calcul de vos Impots ------");

        // Conditions en cascade , avec soustraction pour chaque tranche.

        //  > Tranche 1
        if (netTaxableSalary_5 < TAXES_THRESHOLDS_1){
            System.out.println("Aucune impôt à payer");
        }
        else {
            // Tranche 4
            if (netTaxableSalary_5 > TAXES_THRESHOLDS_4) {
                double amountAboveThreshold4 = netTaxableSalary_5 - TAXES_THRESHOLDS_4;
                irTotal += amountAboveThreshold4 * TAXES_POURCENTAGE_4;
                netTaxableSalary_5 = TAXES_THRESHOLDS_4;
                System.out.println(bareme4);
            }
            // Tranche 3
            if (netTaxableSalary_5 > TAXES_THRESHOLDS_3) {
                double amountAboveThreshold3 = netTaxableSalary_5 - TAXES_THRESHOLDS_3;
                irTotal += amountAboveThreshold3 * TAXES_POURCENTAGE_3;
                netTaxableSalary_5 = TAXES_THRESHOLDS_3;
                System.out.println(bareme3);
            }
            // Tranche 2
            if (netTaxableSalary_5 > TAXES_THRESHOLDS_2) {
                double amountAboveThreshold2 = netTaxableSalary_5 - TAXES_THRESHOLDS_2;
                irTotal += amountAboveThreshold2 * TAXES_POURCENTAGE_2;
                netTaxableSalary_5 = TAXES_THRESHOLDS_2;
                System.out.println(bareme2);
            }
            // Tranche 1
            if (netTaxableSalary_5 > TAXES_THRESHOLDS_1) {
                double amountAboveThreshold1 = netTaxableSalary_5 - TAXES_THRESHOLDS_1;
                irTotal += amountAboveThreshold1 * TAXES_POURCENTAGE_1;
                netTaxableSalary_5 = TAXES_THRESHOLDS_1;
                System.out.println(bareme1);
            }
        }
        // Total
        System.out.println("Le total de vos impôts est de : " + irTotal);

    }
}

