package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        String premiers = "";


        int potentialPrimeNumber = 2;
        while (compteurPremiers < 50) {

            boolean isPremier = isPrimeNumber(potentialPrimeNumber);

            if (isPremier) {
                compteurPremiers++;
                premiers += potentialPrimeNumber + " ";
            }

            potentialPrimeNumber++;

        }

        System.out.println("Affichage avec méthode utilisant un break:");
        System.out.println("-----------------------------------------");
        System.out.println("-> Les nombres premiers sont les suivants : " + premiers);
        System.out.println("-> Le total de nombre premier est de : " + compteurPremiers);
    }

    public static boolean isPrimeNumber(int potentialPrimeNumber) {

        for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {
            if (potentialPrimeNumber % potentialDivisor == 0) {
                return false;
            }

        }
        return true;
    }
}
