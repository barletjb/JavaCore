package chapter03.loop.exercice;

public class WhileLoopExample {

    public static void main(String[] args) {
        // Exo n°1
        int loopCounter = 1;
        int maxLoop1 = 1000;

        //Cas n°1
//        while (loopCounter <= 10) {
//            System.out.println("Hello world n° " + loopCounter);
//            loopCounter++;
//        }

        //Cas n°2
        while (loopCounter <= maxLoop1) {
            System.out.println("Hello world n° " + loopCounter);
            loopCounter++;
        }

        //Exo n°2

        int numberOneToTen = 1;
        int maxLoop2 = 10;

        System.out.println("Affichage 1 à 10 nombre croissant");
        while (numberOneToTen <= maxLoop2) {
            System.out.println(numberOneToTen);
            numberOneToTen++;
        }

        int numberTenToOne = 10;

        System.out.println("Affichage 10 à 1 nombre décroissant");
        while (numberTenToOne > 0) {
            System.out.println(numberTenToOne);
            numberTenToOne--;
        }

        int numberPair = 0;
        int maxLoop3 = 20;

        System.out.println("Affichage nombre pair de 0 à 20");
        while (numberPair < maxLoop3) {
            numberPair += 2;
            System.out.println(numberPair);
        }


    }
}
