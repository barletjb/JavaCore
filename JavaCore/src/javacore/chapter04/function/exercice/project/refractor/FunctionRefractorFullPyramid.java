package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorFullPyramid {

    public static void main(String[] args) {

        int numberOfRows = 10;
        int lign = 1;

        for (lign = 1; lign <= numberOfRows; lign++) {

            int empty = numberOfRows - lign;
            int stars = 2 * lign - 1;

            displayPyramid(empty, ' ');
            displayPyramid(stars, '*');

            System.out.println();
        }
    }

    /**
     * Prints a character multiple times on the same line.
     *
     * @param count     the number of times the character should be printed
     * @param character the character to print (e.g., space or asterisk)
     */
    public static void displayPyramid(int count, char character) {
        while (count != 0) {
            System.out.print(character);
            count--;
        }

    }
}


