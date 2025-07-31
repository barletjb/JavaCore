package chapter05.exercice;

import java.util.Scanner;

public class VowelCounter {

    private static final String VOWELS = "aeiouy";

    /**
     * Counts the number of occurrences of each vowel in the given text.
     *
     * @param text the input string to analyze
     * @return an array of 6 integers representing the counts of 'a', 'e', 'i', 'o', 'u', 'y' respectively
     */
    public static int[] countVowels(String text) {

        int[] vowelCounts = new int[6];
        String lowerText = text.toLowerCase();

        for (int i = 0; i < VOWELS.length(); i++) {
            char vowel = VOWELS.charAt(i);
            int index = -1;

            while ((index = lowerText.indexOf(vowel, index + 1)) != -1) {
                switch (vowel) {
                    case 'a':
                        vowelCounts[0]++;
                        break;
                    case 'e':
                        vowelCounts[1]++;
                        break;
                    case 'i':
                        vowelCounts[2]++;
                        break;
                    case 'o':
                        vowelCounts[3]++;
                        break;
                    case 'u':
                        vowelCounts[4]++;
                        break;
                    case 'y':
                        vowelCounts[5]++;
                        break;
                }
            }
        }
        return vowelCounts;
    }

    /**
     * Displays the count of each vowel from the provided array.
     *
     * @param vowelCounts an array of vowel counts corresponding to 'a', 'e', 'i', 'o', 'u', 'y'
     */
    public static void displayVowels(int[] vowelCounts) {
        System.out.println("------------- Affichage des voyelles du String  ------------- ");
        for (int i = 0; i < VOWELS.length(); i++) {
            char vowel = VOWELS.charAt(i);
            System.out.println("Le nombre de la voyelle (" + vowel + ") est de : " + vowelCounts[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";


        // Process Lorem Ipsum text
        int[] vowelsFound = countVowels(loremIpsum.toLowerCase());
        displayVowels(vowelsFound);

        // User Input
        System.out.print("Entrez votre String : ");
        String userString = scanner.nextLine();
        int [] vowelsFound2 = countVowels(userString);
        displayVowels(vowelsFound2);

        char targetLetter = 'e';
        int index = userString.indexOf(targetLetter);
        while (index != -1) {
            System.out.println("Lettre '" + targetLetter + "' trouvée à l'indice : " + index);
            index = userString.indexOf(targetLetter, index + 1);
        }

        scanner.close();
    }
}
