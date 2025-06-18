package javacore.chapter03.loop.exercice;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int amstrongCount = 0;
        int exposant = 0;

        while (amstrongCount <= 10) {
           int potentialAmstrongNumber = 10;


            int copyNumber = potentialAmstrongNumber;
            System.out.println("Temp number1 : " + copyNumber);

            // Calcul exposant
            while (copyNumber != 0) {
                exposant++;
                copyNumber /= 10;
            }

            System.out.println("Exposant : " + exposant);
            copyNumber = potentialAmstrongNumber;
            System.out.println("Temp number2 : " + copyNumber);

            // Extraction chiffre
            while (copyNumber != 0) {
                int soloNumber = copyNumber % 10;

                int result = 1;
                int finalResult = 0;

                while (exposant != 0) {
                    result = result * soloNumber;
                    finalResult += result;
                    exposant--;
                }
                System.out.println(finalResult);

                if (finalResult == potentialAmstrongNumber) {
                    amstrongCount++;
                    System.out.println("Ce nombre : " + potentialAmstrongNumber + " est un nombre Amstrong");
                    potentialAmstrongNumber++;
                } else {
                    potentialAmstrongNumber++;
                }

            }

        }

    }
}