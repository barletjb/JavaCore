package javacore.chapter02.condition.exercice;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // Valeur salaire net imposable annuel (après déduction cotisation sociale)
        double netTaxableSalary_1 = 8000;
        double netTaxableSalary_2 = 20000;
        double netTaxableSalary_3 = 50000;
        double netTaxableSalary_4 = 100000;
        double netTaxableSalary_5 = 180000;

        // Initialisation paliers IR
        double taxesThresholds_1 = 11294;
        double taxesThresholds_2 = 28797;
        double taxesThresholds_3 = 82341;
        double taxesThresholds_4  = 177105;
        
        // Initialisation Total impot.
        double irTotal =  0;

        // Initialisation Barème.
        String bareme4 = ("Barème : Supérieur à : " + taxesThresholds_4 + "  est de 45 %.");
        String bareme3 = ("Barème : Entre : " + taxesThresholds_3 + " et " + taxesThresholds_4 + "  est de 40 %.");
        String bareme2 = ("Barème : Entre : " + taxesThresholds_2 + " et " + taxesThresholds_3 + "  est de 30 %.");
        String bareme1 = ("Barème : Entre : " + taxesThresholds_1 + " et " + taxesThresholds_2 + " est de 11 %.");

        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + netTaxableSalary_5 + " €");
        System.out.println("------ Calcul de vos Impots ------");

        if (netTaxableSalary_5 > taxesThresholds_4){
            double diff = netTaxableSalary_5 -taxesThresholds_4;
            double tranche5Impot = diff * 0.45;
            irTotal += tranche5Impot;
            netTaxableSalary_5 -= diff;
            System.out.println(bareme4);
        }

        if (netTaxableSalary_5 > taxesThresholds_3) {
            double diff = netTaxableSalary_5 -taxesThresholds_3;
            double tranche4Impot = diff * 0.41;
            irTotal += tranche4Impot;
            netTaxableSalary_5 -= diff;
            System.out.println(bareme3);
        }

        if (netTaxableSalary_5 > taxesThresholds_2) {
            double diff = netTaxableSalary_5 -taxesThresholds_2;
            double tranche3Impot = diff * 0.30;
            irTotal += tranche3Impot;
            netTaxableSalary_5 -= diff;
            System.out.println(bareme2);
        }

        if (netTaxableSalary_5 > taxesThresholds_2) {
            double diff = netTaxableSalary_5 -taxesThresholds_2;
            double tranche2Impot = diff * 0.11;
            irTotal += tranche2Impot;
            netTaxableSalary_5 -= diff;
            System.out.println(bareme1);
        }

        System.out.println("Le total de vos impôts est de : " + irTotal);

    }
}

