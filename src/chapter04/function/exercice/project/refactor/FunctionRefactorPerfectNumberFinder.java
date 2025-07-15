package chapter04.function.exercice.project.refactor;

public class FunctionRefactorPerfectNumberFinder {

    public static void main(String[] args) {

        int maxNumberAnalyzed = 10000;
        int perfectNumberCount = 0;
        String perfectNumbersList = "";

        for (int potentialPerfectNumber = 2; potentialPerfectNumber <= maxNumberAnalyzed; potentialPerfectNumber++) {

            if (isPerfectNumber(potentialPerfectNumber)) {
                perfectNumberCount++;
                perfectNumbersList += potentialPerfectNumber + " ";
            }
        }

        System.out.println("Les nombres parfaits sont les suivants : ");
        System.out.print(perfectNumbersList);
        System.out.println();
        System.out.println("Le nombre total de nombre parfait est de " + perfectNumberCount);
    }

    /**
     * Checks if a number is a perfect number.
     * @param potentialPerfectNumber The number to check.
     * @return true if the number is perfect, false otherwise.
     */
    public static boolean isPerfectNumber(int potentialPerfectNumber) {
        return sumOfDivisors(potentialPerfectNumber) == potentialPerfectNumber;
    }

    /**
     * Calculates the sum of all proper divisors of a number (excluding the number itself).
     * @param number The number for which to calculate the sum of divisors.
     * @return The sum of proper divisors.
     */
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        return sum;
    }

}
