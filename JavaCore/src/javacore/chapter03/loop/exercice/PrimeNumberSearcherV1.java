package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        int compteurNonPremiers = 0;
        int totalAnalyzed = 0;

        int potentialPrimeNumber = 2;
        int maxNumber = 100;
        String premiers = "";
        String nonPremiers = "";


        while (compteurPremiers < 50) {

            //Méthode n°1
            //for (potentialPrimeNumber = 2; potentialPrimeNumber <= maxNumber; potentialPrimeNumber++) {

            boolean isPremier = true;

            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

                if (potentialPrimeNumber % potentialDivisor == 0) {
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
            potentialPrimeNumber++;
            totalAnalyzed++;
        }

        System.out.println("Les nombres non premiers sont les suivants : " + nonPremiers);
        System.out.println("Les nombres premiers sont les suivants : " + premiers);
        System.out.println("Le total de nombre premier est de : " + compteurPremiers);
        System.out.println("Le total de nombre testé est de : " + totalAnalyzed);



        // Solution 2 : Avec Break et decrémentation
        int n = 100;

        //Loop that iterates from 1 to n.
        for (int i = 1; i <= n; i++) {
            //variable that keeps track of the current number as prime or not.
            boolean isPrime = true;
            for (int j = i - 1; j >= 2; j--) {

                //If the number can divide then it cannot be prime.
                //So terminate the loop by marking it.
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            //If the variable is not modified by the inner loop then it is prime.
            if (isPrime)
                System.out.print(i + " ");
        }
    }

}
