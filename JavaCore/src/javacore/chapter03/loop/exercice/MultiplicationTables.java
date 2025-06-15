package javacore.chapter03.loop.exercice;

public class MultiplicationTables {

    public static void main(String[] args) {

        int number;
        int multipleNumber;
        final int MAX_NUMBER = 9;
        final int MAX_MULTIPLE_NUMBER = 10;

        //CONSIGNE N°1:
        for (number = 1; number <= MAX_NUMBER; number++) {
            System.out.println("Table de " + number + " :");
            for (multipleNumber = 1; multipleNumber <= MAX_MULTIPLE_NUMBER; multipleNumber++) {
                System.out.println(number + " + " + multipleNumber + " = " + (number * multipleNumber) );
            }
            System.out.println();
        }
        System.out.println();

        //CONSIGNE N°2:
        for (number = 1; number <= MAX_NUMBER; number++) {
            System.out.print("Table de " + number + " : ");
            for (multipleNumber = 1; multipleNumber <= MAX_MULTIPLE_NUMBER; multipleNumber++) {
                System.out.print(number * multipleNumber + " ");
            }
            System.out.println();
        }

    }
}
