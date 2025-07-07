package chapter03.loop.exercice;

public class ForLoopExample {

    public static void main(String[] args) {

        int randomNumber;
        int maxNumber = 10;
        int minNumber = 0;

        // Nombre de 1 à 10
        for (randomNumber = 1; randomNumber <= maxNumber; randomNumber++) {
            System.out.print(randomNumber + " ");
        }

        System.out.println();

        // Nombre de 1à à 1
        for (randomNumber = 10; randomNumber > minNumber; randomNumber--) {
            System.out.print(randomNumber + " ");
        }

        System.out.println();

        // Lettre de A à Z
        char letter;

        for (letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }

        System.out.println();

        // Factorielle de 4

        int factorielleNumber;
        int result = 1;

        for (factorielleNumber = 4; factorielleNumber > minNumber; factorielleNumber--) {
            result *= factorielleNumber;
        }

        System.out.println("Le resultat de la factorielle de 4 est de : " + result);




    }
}
