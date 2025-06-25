package javacore.chapter04.function.exercice.project.refractor;

public class FunctionRefractorAlphabetPrinter {

        public static void main(String[] args) {

            displayLetter('A', 'Z');
            System.out.println();

            char letter = 'A';
            // Affichage de 'a' à 'z' en partant de 'A'
            while (letter <= 'z') {
                if (letter == 'a') {
                    displayLetter(letter, 'z');
                }
                letter++;
            }

        }

    /**
     * Displays all characters from the specified start letter to the end letter, inclusive.
     * @param startLetter the character to start printing from.
     * @param endLetter   the character to stop printing at.
     */
        public static void displayLetter(char startLetter, char endLetter){
            while (startLetter <= endLetter) {
                System.out.print(startLetter + " ");
                startLetter++;
            }
        }

    }

