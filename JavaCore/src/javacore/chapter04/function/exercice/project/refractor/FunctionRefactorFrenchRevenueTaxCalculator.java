package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefactorFrenchRevenueTaxCalculator {

    public static final double TAX_THRESHOLDS_1 = 11294;
    public static final double TAX_RATE_1 = 11 / 100.0;

    public static final double TAX_THRESHOLDS_2 = 28797;
    public static final double TAX_RATE_2 = 30 / 100.0;

    public static final double TAX_THRESHOLDS_3 = 82341;
    public static final double TAX_RATE_3 = 41 / 100.0;

    public static final double TAX_THRESHOLDS_4 = 177105;
    public static final double TAX_RATE_4 = 45 / 100.0;

    public static void main(String[] args) {

        // Valeur salaire net imposable à tester : 8000, 20000, 50000, 100000
        double netTaxableSalary_5 = 180000;

        // Initialisation Total impot.
        double totalTax =  0;

        // Initialisation Barème.
        String bracket4Label = ("Barème : Supérieur à : " + TAX_THRESHOLDS_4 + "  est de "+ TAX_RATE_4 + " %.");
        String bracket3Label = buildTaxBracketLabel(TAX_THRESHOLDS_4, TAX_THRESHOLDS_3, TAX_RATE_3);
        String bracket2Label = buildTaxBracketLabel(TAX_THRESHOLDS_3, TAX_THRESHOLDS_2, TAX_RATE_2);
        String bracket1Label = buildTaxBracketLabel(TAX_THRESHOLDS_2, TAX_THRESHOLDS_1, TAX_RATE_1);


        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + netTaxableSalary_5+ " €");
        System.out.println("------ Calcul de vos Impots ------");

        double salaryCopy = netTaxableSalary_5;
        // Conditions en cascade , avec soustraction pour chaque tranche.
        //  > Tranche 1
        if (salaryCopy < TAX_THRESHOLDS_1){
            System.out.println("Aucune impôt à payer");
        }
        else {

            double bracket4Tax = calculateTaxForBracket(salaryCopy, TAX_THRESHOLDS_4, TAX_RATE_4, bracket4Label);
                 if (bracket4Tax > 0){
                     totalTax += bracket4Tax;
                     salaryCopy = TAX_THRESHOLDS_4;
                 }

            double bracket3Tax = calculateTaxForBracket(salaryCopy, TAX_THRESHOLDS_3, TAX_RATE_3, bracket3Label);
                if (bracket3Tax > 0){
                    totalTax += bracket3Tax;
                    salaryCopy = TAX_THRESHOLDS_3;
                }

            double bracket2Tax = calculateTaxForBracket(salaryCopy, TAX_THRESHOLDS_2, TAX_RATE_2, bracket2Label);
                if (bracket2Tax > 0) {
                    totalTax += bracket2Tax;
                    salaryCopy= TAX_THRESHOLDS_2;
                }

            double bracket1Tax = calculateTaxForBracket(salaryCopy, TAX_THRESHOLDS_1, TAX_RATE_1, bracket1Label);
                if (bracket1Tax > 0){
                    totalTax += bracket1Tax;
                    salaryCopy = TAX_THRESHOLDS_1;
                }
        }
        // Total
        System.out.println("Le total de vos impôts est de : " + totalTax);
    }

    /**
     * Calculates the income tax for a given tax bracket.
     * @param netTaxableSalary the total taxable income before deductions.
     * @param taxThreshold the lower bound threshold for the current bracket.
     * @param taxRate the applicable tax rate for the bracket.
     * @param bracketLabel the textual label describing the bracket, used for display.
     * @return the calculated tax amount for the income above the threshold; 0 if below threshold.
     */
    public static double calculateTaxForBracket(double netTaxableSalary , double taxThreshold, double taxRate, String bracketLabel){
        if (netTaxableSalary > taxThreshold) {
            double amountAboveThreshold = netTaxableSalary - taxThreshold;
            double ir = amountAboveThreshold * taxRate;
            System.out.println(bracketLabel);
            return ir;
        }
        return 0;
    }


    /**
     * Builds a descriptive label for a given tax bracket range and rate.
     * @param upperThreshold upper limit of the bracket.
     * @param lowerThreshold the lower limit of the bracket.
     * @param taxRate the tax rate for this bracket
     * @return a formatted string describing the bracket and its rate.
     */
    public static String buildTaxBracketLabel(double upperThreshold, double lowerThreshold, double taxRate){
        String displayBareme = "Barème : Entre : " + upperThreshold + " et " + lowerThreshold + " est de " + taxRate + " %.";
        return displayBareme;
    }

}








