package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorPerfectNumberFinder {

    public static void main(String[] args) {

        int end = 10000;
        int perfectNumberCount = 0;
        String perfectNumbersList = "";

        for (int start = 2; start <= end; start++) {

            if (isPerfectNumber(start)) {
                perfectNumberCount++;
                perfectNumbersList += start + " ";
            }
        }

        System.out.println("Les nombres parfaits sont les suivants : ");
        System.out.print(perfectNumbersList);
        System.out.println();
        System.out.println("Le nombre total de nombre parfait est de " + perfectNumberCount);
    }

    /**
     * Checks if a number is a perfect number.
     *
     * @param number The number to check.
     * @return true if the number is perfect, false otherwise.
     */
    public static boolean isPerfectNumber(int number) {
        return sumOfDivisors(number) == number;
    }

    /**
     * Calculates the sum of all proper divisors of a number (excluding the number itself).
     *
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
