package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        int compteurNonPremiers = 0;

        int potentialPrimeNumber;
        int maxNumber = 100;
        String premiers = "";
        String nonPremiers = "";

        // Start à 2 car 1 n'est pas un nombre premier


        for (potentialPrimeNumber = 2; potentialPrimeNumber <= maxNumber; potentialPrimeNumber++) {

            boolean isPremier = true;

            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

                if (potentialPrimeNumber % potentialDivisor == 0) {
                    compteurPremiers++;
                    isPremier = false;
                }
            }
            if (isPremier) {
                compteurPremiers++;
                premiers += potentialPrimeNumber + " ";
            } else {
                compteurNonPremiers++;
                nonPremiers += potentialPrimeNumber + " ";
            }
        }
        System.out.println("Les nombres non premiers sont les suivants : " + nonPremiers);
        System.out.println("Les nombres premiers sont les suivants : " + premiers);
        System.out.println("Le total de nombre premier est de : " + compteurPremiers);
    }
}
