package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcherV2 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        int countDivisor = 0;
        int countDivisorWithoutBreak = 0;

        int compteurNonPremiers = 0;
        int totalAnalyzed = 0;

        int potentialPrimeNumber = 2;
        String premiers = "";
        String nonPremiers = "";


        // Methode avec break
        while (compteurPremiers < 1000) {
            //Méthode n°1
            //for (potentialPrimeNumber = 2; potentialPrimeNumber <= maxNumber; potentialPrimeNumber++) {
            boolean isPremier = true;

            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {
                if (potentialPrimeNumber % potentialDivisor == 0) {
                    isPremier = false;
                    countDivisor += potentialDivisor;
                    break;
                }
            }

            if (isPremier) {
                compteurPremiers++;
                premiers += potentialPrimeNumber + " ";
            }
            else {
                compteurNonPremiers++;
                nonPremiers += potentialPrimeNumber + " ";
            }
            potentialPrimeNumber++;
            totalAnalyzed++;
        }

        System.out.println("Affichage avec méthode utilisant un break:");
        System.out.println("-----------------------------------------");
        System.out.println("-> Les nombres premiers sont les suivants : " + premiers);
        System.out.println("-> Le total de nombre premier est de : " + compteurPremiers);
        System.out.println();
        System.out.println("Affichage  des tests :");
        System.out.println("-----------------------------------------");
        System.out.println("-> Le total de diviseur testé est de : " + countDivisor);
        System.out.println("-> Le total de nombre testé est de : " + totalAnalyzed);


        compteurPremiers = 0;
        compteurNonPremiers = 0;
        totalAnalyzed = 0;
        potentialPrimeNumber = 2;
        // Methode Sans Break
        while (compteurPremiers < 1000) {
            //Méthode n°1
            //for (potentialPrimeNumber = 2; potentialPrimeNumber <= maxNumber; potentialPrimeNumber++) {
            boolean isPremier = true;

            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {
                if (potentialPrimeNumber % potentialDivisor == 0) {
                    isPremier = false;
                    countDivisorWithoutBreak += potentialDivisor;
                }
            }

            if (isPremier) {
                compteurPremiers++;
                premiers += potentialPrimeNumber + " ";
            }
            else {
                compteurNonPremiers++;
                nonPremiers += potentialPrimeNumber + " ";
            }
            potentialPrimeNumber++;
            totalAnalyzed++;
        }

        System.out.println();
        System.out.println();
        System.out.println("Affichage avec méthode utilisant un break:");
        System.out.println("-----------------------------------------");
        System.out.println("-> Les nombres premiers sont les suivants : " + premiers);
        System.out.println("-> Le total de nombre premier est de : " + compteurPremiers);
        System.out.println();
        System.out.println("Affichage tests :");
        System.out.println("-----------------------------------------");
        System.out.println("-> Le total de diviseur testé est de : " + countDivisorWithoutBreak);
        System.out.println("-> Le total de nombre testé est de : " + totalAnalyzed);

        System.out.println();
        System.out.println("Affichage infos non premiers:");
        System.out.println("-----------------------------------------");
        System.out.println("-> Le total de nombre non premier est de : " + compteurNonPremiers);
        System.err.println("-> Les nombres non premiers sont les suivants : " + nonPremiers);;

    }

}
