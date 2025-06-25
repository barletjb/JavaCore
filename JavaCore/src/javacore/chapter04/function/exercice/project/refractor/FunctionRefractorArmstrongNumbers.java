package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorArmstrongNumbers {

    public static void main(String[] args) {

        int armstrongCount = 0;
        int currentNumber = 10;

        while (armstrongCount < 10) {

            int sumOfPowers = 0;
            int copyNumber = currentNumber;

            // Calcul exposant
            int power = countDigits(copyNumber);

            copyNumber = currentNumber;
            // Extraction chiffre
            while (copyNumber != 0) {

                int digit = copyNumber % 10;
                sumOfPowers += powerOfDigit(digit,power);
                copyNumber /= 10;
            }

            if (sumOfPowers == currentNumber) {
                armstrongCount++;
                System.out.println("Ce nombre : " + currentNumber + " est un nombre Armstrong");
            }
            currentNumber++;
        }

    }

    /**
     * Counts the number of digits in the given number.
     * @param number The number to count digits of.
     * @return Number of digits in the number.
     */
    public static int countDigits(int number) {
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
    public static int powerOfDigit(int digit, int exponent){
        int result = 1;
        while (exponent != 0) {
            result *= digit;
            exponent--;
        }
        return result;
    }

}
