package javacore.chapter03.loop.exercice;

public class AlphabetPrinter {

    public static void main(String[] args) {

        char letter = 'A';

        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();

        // Reinitialisation de letter
        letter = 'A';

        // Affichage de 'a' à 'z' en partant de 'A'
        while (letter <= 'z') {
            if (letter == 'a') {
                while (letter <= 'z') {
                    System.out.print(letter + " ");
                    letter++;
                }
            }
            letter++;
        }

    }
}
