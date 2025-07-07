package chapter04.function.exercice.project.refractor;

public class FunctionRefactorFullPyramid {

    public static void main(String[] args) {

        int numberOfRows = 10;
        int lign = 1;

        for (lign = 1; lign <= numberOfRows; lign++) {

            int empty = numberOfRows - lign;
            int stars = 2 * lign - 1;

            displayPyramid(empty,stars,' ', '*');
            System.out.println();
        }
    }

    /**
     * Displays a single line of the pyramid by printing spaces followed by stars.
     * @param countSpace number of spaces to print before the stars
     * @param countStars number of stars to print
     * @param space      character used for spacing (usually a space)
     * @param stars      character used to represent stars
     */
    public static void displayPyramid(int countSpace, int countStars, char space, char stars) {
        displaySpaces(countSpace, space);
        displayStars(countStars, stars);

    }

    /**
     * Prints a given number of space characters.
     * @param count     number of space characters to print
     * @param character the space character (usually ' ')
     */
    public static void displaySpaces(int count, char character) {
        while (count != 0) {
            System.out.print(character);
            count--;
        }
    }

    /**
     * Prints a given number of star characters.
     * @param count     number of star characters to print
     * @param character the star character (usually '*')
     */
    public static void displayStars(int count, char character) {
        while (count != 0) {
            System.out.print(character);
            count--;
        }
    }
}


