package chapter04.function.exercice;

public class FrenchNetSalaryCalculator {

    public static final int WEEKS_YEARS = 52;

    public static final double TAX_THRESHOLDS_1 = 11294;
    public static final double TAX_RATE_1 = 11 / 100.0;

    public static final double TAX_THRESHOLDS_2 = 28797;
    public static final double TAX_RATE_2 = 30 / 100.0;

    public static final double TAX_THRESHOLDS_3 = 82341;
    public static final double TAX_RATE_3 = 41 / 100.0;

    public static final double TAX_THRESHOLDS_4 = 177105;
    public static final double TAX_RATE_4 = 45 / 100.0;

    public static final float FRENCH_SMIC = 11.07f;
    public static final float FRENCH_MEDIAN_SALARY = 17.50f;
    public static final float FRENCH_MIDDLE_SALARY = 22.50f;
    public static final float FRENCH_UPPER_SALARY = 35.00f;

    public static double weekHour = 38.5;
    public static double socialTaxes = 10.5;

    public static void main(String[] args) {


        System.out.println("Affichage du SMIC Français :");
        displayFrenchSalary(FRENCH_SMIC);
        System.out.println();

        System.out.println("Affichage du Salaire Médian Français :");
        displayFrenchSalary(FRENCH_MEDIAN_SALARY);
        System.out.println();

        System.out.println("Affichage du Salaire Moyen Français :");
        displayFrenchSalary(FRENCH_MIDDLE_SALARY);
        System.out.println();

        System.out.println("Affichage du Seuil de Richesse Français :");
        displayFrenchSalary(FRENCH_UPPER_SALARY);
        System.out.println();

    }

    /**
     * Calculates the annual gross salary based on the given hourly gross salary.
     * Assumes WEEKS_YEARS working weeks in a year.
     * @param hourlyGrossSalary the hourly gross salary
     * @return the annual gross salary
     */
    public static double calculateAnnualGrossSalary(double hourlyGrossSalary) {
        return (hourlyGrossSalary * weekHour) * WEEKS_YEARS;
    }

    /**
     * Applies social charges to the annual gross salary to calculate the taxable net salary.
     * @param annualGrossSalary      the annual gross salary before social charges
     * @param socialChargePercentage the percentage of social charges to apply
     * @return the annual net salary after social charges
     */
    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage) {
        return annualGrossSalary - (annualGrossSalary * socialChargePercentage / 100);
    }

    /**
     * Applies progressive income tax brackets to the given annual net salary and returns
     * the final net salary after income tax deduction.
     * The method uses a tiered tax system where income is taxed differently across several thresholds
     * (TAX_THRESHOLDS_1 to TAX_THRESHOLDS_4) with corresponding tax rates (TAX_RATE_1 to TAX_RATE_4).
     * Tax is calculated from the highest bracket down to the lowest.
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
     * @param netTaxableSalary the total taxable income before deductions.
     * @param taxThreshold     the lower bound threshold for the current bracket.
     * @param taxRate          the applicable tax rate for the bracket.
     * @return the calculated tax amount for the income above the threshold; 0 if below threshold.
     */
    public static double calculateTaxForBracket(double netTaxableSalary, double taxThreshold, double taxRate) {
        if (netTaxableSalary > taxThreshold) {
            double amountAboveThreshold = netTaxableSalary - taxThreshold;
            return amountAboveThreshold * taxRate;
        }
        return 0;
    }

    /**
     * Displays the complete French salary calculation based on a given hourly gross wage.
     * The calculation includes:
     *   -The annual gross salary
     *   -The net salary after social charges deduction
     *   -The final net salary after applying progressive income tax
     * Each step is printed to the console with the corresponding amount.
     * @param hourlySalary The hourly gross wage in euros.
     */
    public static void displayFrenchSalary (double hourlySalary){
        System.out.println("-------------------------");
        System.out.println("* Votre salaire Brut annuel");
        double annualSalaryBrut = calculateAnnualGrossSalary(hourlySalary);
        System.out.println("--> " + annualSalaryBrut + " €");

        System.out.println("* Salaire net après cotisations");
        double annualSalaryNet = applySocialCharges(annualSalaryBrut, socialTaxes);
        System.out.println("--> " + annualSalaryNet + " €");

        System.out.println("* Salaire net après impositions");
        annualSalaryNet = applyRevenueTax(annualSalaryNet);
        System.out.println("--> " + annualSalaryNet + " €");
        System.out.println("-------------------------");
    }

}





