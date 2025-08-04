package chapter05.exercice;

import java.util.Scanner;

public class SubstitutionCipher {

    public static final String LATIN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String SUBSTITUTION_ALPHABET = "ntrhwbgeyjzlsoaqdmcuvfpxik";


    /**
     * Encrypts a message using the substitution cipher without using {String.replaceAll}.
     * Only lowercase alphabetic characters are substituted. Spaces and exclamation marks
     * are preserved.
     *
     * @param textToEncrypt the original plain text message to encrypt
     * @return the encrypted message using the substitution cipher
     */
    public static String cryptMessageWithoutReplaceAll(String textToEncrypt) {

        String textCrypt = "";

        for (int index = 0; index < textToEncrypt.length(); index++) {

            char targetLetter = textToEncrypt.charAt(index);

            if (LATIN_ALPHABET.indexOf(targetLetter) >= 0) {
                textCrypt += SUBSTITUTION_ALPHABET.charAt(LATIN_ALPHABET.indexOf(targetLetter));

            } else {
                textCrypt += targetLetter;
            }
        }
        return textCrypt;
    }

    /**
     * Encrypts the given text using a substitution cipher with the provided alphabets.
     * Each character from the {@code latinAlphabet} is replaced by the corresponding character
     * in the {@code substitutionAlphabet}. A two-pass replacement using temporary placeholders
     * avoids accidental collisions during substitution.
     *
     * @param textToEncrypt        The original plain text to be encrypted.
     * @param latinAlphabet        The source alphabet used in the original text.
     * @param substitutionAlphabet The target alphabet used to replace characters from the source alphabet.
     *
     * @return The encrypted text with substitutions applied.
     */
    public static String cipher(String textToEncrypt, String latinAlphabet, String substitutionAlphabet){

        String textCrypt = textToEncrypt;

        for (int index = 0; index < latinAlphabet.length(); index++){

            String latinLetter = String.valueOf(latinAlphabet.charAt(index));
            String substitutionNumber = ("@" + index + "@");

            textCrypt = textCrypt.replaceAll(latinLetter, substitutionNumber);
        }

        for (int i = 0; i < substitutionAlphabet.length(); i++) {

            String substitutionNumber = ("@" + i + "@");
            String substitutionLetter = String.valueOf(substitutionAlphabet.charAt(i));

            textCrypt = textCrypt.replaceAll(substitutionNumber, substitutionLetter);
        }

        return textCrypt;
    }

    /**
     * Encrypts the given text using a substitution cipher repeatedly for a specified number of iterations.
     * Each iteration applies the same substitution cipher as defined by the provided alphabets.
     * This method internally uses {cipher(String, String, String)} to apply the cipher at each step.
     *
     * @param textToEncrypt        The original plain text to be encrypted.
     * @param alphabet             The source alphabet used in the substitution.
     * @param substitutionAlphabet The target alphabet used to replace characters from the source alphabet.
     * @param cipherIterations     The number of times to apply the substitution cipher.
     *
     * @return The encrypted text after the specified number of cipher iterations.
     */
    public static String cipher(String textToEncrypt, String alphabet, String substitutionAlphabet, int cipherIterations){
        String textCrypt = textToEncrypt;
        for (int i = 0; i < cipherIterations; i++){
            textCrypt = cipher(textCrypt,alphabet,substitutionAlphabet);
        }
        return textCrypt;
    }


    /**
     * Prompts the user to enter a custom substitution alphabet via the console,
     * and keeps asking until a valid input is provided.
     * A valid substitution alphabet must contain exactly 26 unique lowercase letters (a–z)
     * without any spaces, digits, or special characters.
     *
     * @return a valid substitution alphabet string entered by the user
     */
    public static String userChoice (){
        Scanner s = new Scanner(System.in);
        boolean isValid;
        String substitutionAlpha;

        do {
            System.out.println("Veuillez saisir votre alphabet de substituion :");
            substitutionAlpha = s.nextLine().toLowerCase().trim();

            substitutionAlpha = substitutionAlpha.replaceAll(" ", "");
            isValid = searchError(substitutionAlpha);

        } while (!isValid);

        s.close();

        return substitutionAlpha;
    }

    /**
     * Validates the given substitution alphabet.
     * The alphabet is considered valid if:
     * - It contains exactly 26 characters
     * - Each character is a lowercase letter (a–z)
     * - There are no duplicate characters
     * Displays an error message if a rule is violated.
     *
     * @param userSubstitutionAlphabet the substitution alphabet string to validate
     * @return {true} if the alphabet is valid; {false} otherwise
     */
    public static boolean searchError(String userSubstitutionAlphabet){

        if (userSubstitutionAlphabet.length() != LATIN_ALPHABET.length() ){
            System.err.println("Veuillez bien saisir 26 lettres");
            return false;
        }

        for (int i = 0; i < userSubstitutionAlphabet.length(); i++){

            char letter = userSubstitutionAlphabet.charAt(i);

            if (userSubstitutionAlphabet.indexOf(letter,i + 1) >= 0){
                System.err.println("Vous ne pouvez pas mettre plusieurs fois la même lettre");
                return false;

            } else if ( !(letter >= 'a' && letter <= 'z')) {
                System.err.println("Vous ne devez saisir seulement que des lettres !");
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";


        // Ecrivez le code ci-dessous

        System.out.println("-------------- METHODE n°1 --------------");
        String textCrypt = cryptMessageWithoutReplaceAll(textToEncrypt);
        System.out.println("Veuillez transmettre ce message de toute urgence : " + textCrypt);
        System.out.println();

        System.out.println("-------------- METHODE n°2 --------------");
        String textCrypt2 = cipher(textToEncrypt, latinAlphabet, substitutionAlphabet);
        System.out.println("Veuillez transmettre ce message de toute urgence : " + textCrypt2);
        System.out.println();

        System.out.println("-------------- Test Cypher --------------");
        String textCrypt3 = cipher("animal", latinAlphabet, substitutionAlphabet, 3);
        System.out.println(textCrypt3);

        System.out.println("-------------- Choix Utilisateur --------------");
        String userSubstituionAlphabet = userChoice();
        System.out.println("Votre alphabet de substitution pour crypter vos messages est le suivant : " + userSubstituionAlphabet);

    }
}
