package javacore.chapter03.loop.exercice;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int amstrongCount = 0;
        int currentNumber = 10;

        while (amstrongCount < 15) {

            int power = 0;
            int sumOfPowers = 0;

            int copyNumber = currentNumber;
            // Calcul exposant
            while (copyNumber != 0) {
                power++;
                copyNumber /= 10;
            }

            copyNumber = currentNumber;
            // Extraction chiffre
            while (copyNumber != 0) {

                int digit = copyNumber % 10;
                int digitPowered = 1;
                int copyPower = power;

                // Calcul modulo ^power
                while (copyPower != 0) {
                    digitPowered = digitPowered * digit;
                    copyPower--;
                }

                sumOfPowers += digitPowered;
                copyNumber /= 10;
            }
            if (sumOfPowers == currentNumber) {
                amstrongCount++;
                System.out.println("Ce nombre : " + currentNumber + " est un nombre Amstrong");
            }
            currentNumber++;
        }

    }
}