package javacore.chapter03.loop.exercice;

public class FactorialCalculator {

    public static void main(String[] args) {

        // Random Number
//        int number = 15;
//
//        // Result Factorielle
//        long result = 1L;
//
//        while (number > 0) {
//            result *= number;
//            number--;
//
//        }
//        System.out.println("Le resultat factorielle du nombre 15 est de " + result);

        //Test spé number : 7, 9, 11, 20 et 21
        int number7 = 7;
        int number9 = 9;
        int number11 = 11;
        int number20 = 20;
        int number = -1;

        long newResult = 1L;

        if (number < 0) {
            System.err.println("Le nombre doit être positif");
        }
        else if (number == 0 ){
            newResult = 1;
            System.out.println("La factorielle de 0 est forcément : " + newResult);
        }
        else {
            while (number > 0) {
                newResult *= number;
                number--;
            }
            System.out.println("Le resultat factorielle du nombre 21 est de " + newResult);
        }

        //Factorielle de 21 trop long pour un long !
        //Affichage du resultat en négatif, pour ce calcul 20 est donc la limite pour un long.



    }
}
