package chapter05.exercice;

import java.util.Scanner;

public class VowelCounter {

    private static final String VOWELS = "aeiouy";


    /**
     * Searches and collects all vowels from the provided string.
     *
     * @param input The string to search for vowels.
     * @return An array containing the vowels found in the input string.
     *         The array length matches the input length, but only the first 'n' elements (up to the count of vowels)
     *         are valid vowels.
     */
    public static char[] searchVowelsInString(String input) {

        char[] vowelsFound = new char[input.length()];
        int count = 0;

        for (int index = 0; index < input.length(); index++) {
            char letter = input.charAt(index);

            if (VOWELS.indexOf(letter) != -1) {
                vowelsFound[count] = letter;
                count++;
            }
        }
        return vowelsFound;
    }

    /**
     * Displays the vowels in the given array, separated by commas.
     *
     * @param vowels The array of vowels to display.
     */
    public static void displayVowels(char[] vowels) {
        System.out.println("------------- Affichage des voyelles du String  ------------- ");
        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i]);
            if (i < vowels.length - 1) {
                System.out.print(",");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" +
                " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.");
        System.out.println();

        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" +
                " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";

        // Process Lorem Ipsum text
        char[] vowelsFound = searchVowelsInString(loremIpsum);
        displayVowels(vowelsFound);

       // User Input
        System.out.print("Entrez votre String : ");
        String userString = scanner.nextLine();
        char[] vowelsFound2 = searchVowelsInString(userString);
        displayVowels(vowelsFound2);

        char targetLetter ='e';
        int index = userString.indexOf(targetLetter);
        while (index != -1) {
            System.out.println("Lettre '" + targetLetter + "' trouvée à l'indice : " + index);
            index = userString.indexOf(targetLetter, index + 1);
        }

        scanner.close();
    }
}
