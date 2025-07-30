package chapter05.exercice;

import java.util.Scanner;

public class VowelCounter {

    private static final String VOWELS = "aeiouy";

    public static int[] countVowels(String text) {

        int[] vowelsCount = new int[6];
        String lowerText = text.toLowerCase();

        for (int i = 0; i < VOWELS.length(); i++) {
            char vowel = VOWELS.charAt(i);
            int index = -1;

            while ((index = lowerText.indexOf(vowel, index + 1)) != -1) {
                switch (vowel) {
                    case 'a':
                        vowelsCount[0]++;
                        break;
                    case 'e':
                        vowelsCount[1]++;
                        break;
                    case 'i':
                        vowelsCount[2]++;
                        break;
                    case 'o':
                        vowelsCount[3]++;
                        break;
                    case 'u':
                        vowelsCount[4]++;
                        break;
                    case 'y':
                        vowelsCount[5]++;
                        break;
                }
            }
        }
        return vowelsCount;
    }


    public static void displayVowels(int[] countVowels) {
        System.out.println("------------- Affichage des voyelles du String  ------------- ");
        for (int i = 0; i < VOWELS.length(); i++) {
            char vowel = VOWELS.charAt(i);
            System.out.println("Le nombre de la voyelle (" + vowel + ") est de : " + countVowels[i]);
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

        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";


        // Process Lorem Ipsum text
        int[] vowelsFound = countVowels(loremIpsum);
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
