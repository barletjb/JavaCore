package javacore.chapter03.loop.exercice;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        int compteurPremiers = 0;
        int compteurNonPremiers = 0;

        int startNumber;
        int maxNumber = 100;
        String premiers = "";
        String nonPremiers = "";

        // Start à 2 car 1 n'est pas un nombre premier
        for ( startNumber = 2; startNumber <= maxNumber; startNumber++ ) {

            boolean isPremier = true;

            for (int diviseur = 2; diviseur <= startNumber; diviseur++ ) {
                if (startNumber % diviseur == 0) {
                    compteurPremiers++;

                }
                else {
                    compteurNonPremiers++;
                    isPremier = false;
                }
            }
            if (isPremier){
                premiers += startNumber + " ";
            }
            else {
                nonPremiers += startNumber + " ";
            }
        }
        System.out.println("Les nombres non premiers sont les suivants : " + nonPremiers);
        System.out.println("Les nombres premiers sont les suivants : " + premiers);
        System.out.println("Le total de nombre premier est de : " + compteurPremiers);

    }
}
