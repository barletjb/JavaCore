package javacore.chapter04.function.exercice;

public class FrenchNetSalaryCalculator {

    public static final float WEEK_HOUR = 38.5F;
    public static final float SOCIAL_TAXES = 10.5F;

    public static final double TAX_THRESHOLDS_1 = 11294;
    public static final double TAX_RATE_1 = 11 / 100.0;

    public static final double TAX_THRESHOLDS_2 = 28797;
    public static final double TAX_RATE_2 = 30 / 100.0;

    public static final double TAX_THRESHOLDS_3 = 82341;
    public static final double TAX_RATE_3 = 41 / 100.0;

    public static final double TAX_THRESHOLDS_4 = 177105;
    public static final double TAX_RATE_4 = 45 / 100.0;

    public static void main(String[] args) {
        
        System.out.println("* Votre salaire Brut annuel");
        double annualSalaryBrut = calculateAnnualGrossSalary(25);
        System.out.println("--> " + annualSalaryBrut + " €");
        System.out.println("* Salaire net après cotisations");
        double annualSalaryNet = applySocialCharges(annualSalaryBrut, SOCIAL_TAXES);
        System.out.println("--> " + annualSalaryNet + " €");
        System.out.println("* Salaire net après impositions");
        annualSalaryNet = applyRevenueTax(annualSalaryNet);
        System.out.println("--> " + annualSalaryNet + " €");
    }

    /**
     * Calculates the annual gross salary based on the given hourly gross salary.
     * Assumes 52 working weeks in a year. (53 need too)
     *
     * @param hourlyGrossSalary the hourly gross salary
     * @return the annual gross salary
     */
    public static double calculateAnnualGrossSalary(double hourlyGrossSalary) {
        return (hourlyGrossSalary * WEEK_HOUR) * 52;
    }

    /**
     * Applies social charges to the annual gross salary to calculate the taxable net salary.
     *
     * @param annualGrossSalary      the annual gross salary before social charges
     * @param socialChargePercentage the percentage of social charges to apply
     * @return the annual net salary after social charges
     */
    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage) {
        return annualGrossSalary - (annualGrossSalary * socialChargePercentage / 100);
    }

    /**
     * Applies a tax allowance on the net taxable annual salary.
     * @param annualNetSalary        the annual net salary before tax allowance
     * @param taxAllowancePercentage the percentage of tax allowance to apply
     * @return the net taxable annual salary after applying the tax allowance
     */
    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage) {
        return annualNetSalary - (annualNetSalary * taxAllowancePercentage / 100);
    }

    /**
     * Applies progressive income tax brackets to the given annual net salary and returns
     * the final net salary after income tax deduction.
     * The method uses a tiered tax system where income is taxed differently across several thresholds
     * (TAX_THRESHOLDS_1 to TAX_THRESHOLDS_4) with corresponding tax rates (TAX_RATE_1 to TAX_RATE_4).
     * Tax is calculated from the highest bracket down to the lowest.
     *
     * @param annualNetSalary the annual net salary before income tax
     * @return the annual net salary after applying progressive income tax
     */
    public static double applyRevenueTax(double annualNetSalary) {
        double totalTax = 0;
        double copyAnnualNetSalary = annualNetSalary;

        if (copyAnnualNetSalary < TAX_THRESHOLDS_1) {
            System.out.println("Aucune impôt à payer");
            return copyAnnualNetSalary;

        } else {

            double bracket4Tax = calculateTaxForBracket(copyAnnualNetSalary, TAX_THRESHOLDS_4, TAX_RATE_4);
            if (bracket4Tax > 0) {
                totalTax += bracket4Tax;
                copyAnnualNetSalary = TAX_THRESHOLDS_4;
            }

            double bracket3Tax = calculateTaxForBracket(copyAnnualNetSalary, TAX_THRESHOLDS_3, TAX_RATE_3);
            if (bracket3Tax > 0) {
                totalTax += bracket3Tax;
                copyAnnualNetSalary = TAX_THRESHOLDS_3;
            }

            double bracket2Tax = calculateTaxForBracket(copyAnnualNetSalary, TAX_THRESHOLDS_2, TAX_RATE_2);
            if (bracket2Tax > 0) {
                totalTax += bracket2Tax;
                copyAnnualNetSalary = TAX_THRESHOLDS_2;
            }

            double bracket1Tax = calculateTaxForBracket(copyAnnualNetSalary, TAX_THRESHOLDS_1, TAX_RATE_1);
            if (bracket1Tax > 0) {
                totalTax += bracket1Tax;
                copyAnnualNetSalary = TAX_THRESHOLDS_1;
            }
            annualNetSalary -= totalTax;
            return annualNetSalary;
        }
    }

    /**
     * Calculates the income tax for a given tax bracket.
     *
     * @param netTaxableSalary the total taxable income before deductions.
     * @param taxThreshold     the lower bound threshold for the current bracket.
     * @param taxRate          the applicable tax rate for the bracket.
     * @return the calculated tax amount for the income above the threshold; 0 if below threshold.
     */
    public static double calculateTaxForBracket(double netTaxableSalary, double taxThreshold, double taxRate) {
        if (netTaxableSalary > taxThreshold) {
            double amountAboveThreshold = netTaxableSalary - taxThreshold;
            double ir = amountAboveThreshold * taxRate;
            return ir;
        }
        return 0;
    }

}





