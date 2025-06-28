package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefactorArmstrongNumbers {

    public static void main(String[] args) {

        int armstrongCount = 0;
        int potentialArmstrongNumber = 10;

        while (armstrongCount < 10) {

            boolean isPerfectNumber = testArmstrongNumber(potentialArmstrongNumber);

            if (isPerfectNumber) {
                armstrongCount++;
                System.out.println("Ce nombre : " + potentialArmstrongNumber + " est un nombre Armstrong");
            }
            potentialArmstrongNumber++;
        }

    }
    /**
     * Checks whether a given number is an Armstrong number.
     * An Armstrong number (also known as a narcissistic number) is a number that is equal
     * to the sum of its own digits each raised to the power of the number of digits.
     * Example:
     *     153 is an Armstrong number: 1³ + 5³ + 3³ = 153
     *     9474 is an Armstrong number: 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474
     * @param potentialArmstrongNumber the number to test
     * @return true if the number is an Armstrong number, false otherwise
     */
    public static boolean testArmstrongNumber(int potentialArmstrongNumber) {
        int sumOfPowers = 0;
        int copyNumber = potentialArmstrongNumber;

        // Calcul exposant
        int power = countDigits(copyNumber);

        // Extraction chiffre
        while (copyNumber != 0) {

            int digit = copyNumber % 10;
            sumOfPowers += powerOfDigit(digit, power);
            copyNumber /= 10;
        }

        return sumOfPowers == potentialArmstrongNumber;
    }

    /**
     * Counts the number of digits in the given number.
     * @param number The number to count digits of.
     * @return Number of digits in the number.
     */
    private static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    /**
     * Raises the digit to the specified exponent.
     * @param digit    The base digit.
     * @param exponent The exponent to raise the digit to.
     * @return digit raised to the power exponent.
     */
    private static int powerOfDigit(int digit, int exponent){
        int result = 1;
        while (exponent != 0) {
            result *= digit;
            exponent--;
        }
        return result;
    }

}
