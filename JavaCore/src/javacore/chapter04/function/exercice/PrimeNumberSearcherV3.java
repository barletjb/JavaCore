package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        int potentialPrimeNumber = 2;
        String premiers = "";


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

    public static boolean isPrimeNumber(int number) {

        boolean isPremier = true;

        for (int potentialDivisor = 2; potentialDivisor < number; potentialDivisor++) {
            if (number % potentialDivisor == 0) {
                isPremier = false;

                break;
            }

        }
        return isPremier;
    }
}
