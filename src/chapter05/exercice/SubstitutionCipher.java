package chapter05.exercice;

import java.util.Scanner;

public class SubstitutionCipher {

    public static final String LATIN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    String latinAlphabet;
    String substitutionAlphabet;


    public SubstitutionCipher(String alphabet, String substitutionAlphabet) {
        this.latinAlphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }


    /**
     * Encrypts a given text using the substitution cipher defined by this instance.
     * Each lowercase letter from the base alphabet is replaced by a unique placeholder
     * to avoid accidental double substitutions, and then
     * replaced with its corresponding letter from the substitution alphabet.
     *
     * This method preserves characters that are not in the base alphabet (spaces,
     * punctuation marks, etc.).
     *
     * @param textToEncrypt the plain text message to encrypt
     * @return the encrypted message
     */
    public String cipher(String textToEncrypt){

        String textCrypt = textToEncrypt;

        for (int index = 0; index < this.latinAlphabet.length(); index++){

            String latinLetter = String.valueOf(this.latinAlphabet.charAt(index));
            String substitutionNumber = ("@" + index + "@");

            textCrypt = textCrypt.replaceAll(latinLetter, substitutionNumber);
        }

        for (int i = 0; i < this.substitutionAlphabet.length(); i++) {

            String substitutionNumber = ("@" + i + "@");
            String substitutionLetter = String.valueOf(this.substitutionAlphabet.charAt(i));

            textCrypt = textCrypt.replaceAll(substitutionNumber, substitutionLetter);
        }

        return textCrypt;
    }


    /**
     * Applies the substitution cipher multiple times in succession to the given text.
     * This allows for multiple rounds of encryption, which can add complexity to the
     * resulting ciphertext.
     *
     * @param textToEncrypt the plain text message to encrypt
     * @param cipherIterations the number of times to apply the cipher
     * @return the encrypted message after the specified number of iterations
     */
    public String cipher(String textToEncrypt, int cipherIterations){
        String textCrypt = textToEncrypt;
        for (int i = 0; i < cipherIterations; i++){
            textCrypt = cipher(textCrypt);
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
            System.out.print("Veuillez saisir votre alphabet de substitution :");
            substitutionAlpha = s.nextLine().toLowerCase().trim();
            substitutionAlpha = substitutionAlpha.replaceAll(" ", "");

            isValid = searchError(substitutionAlpha);
            System.out.println();

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
            System.out.println("Veuillez bien saisir 26 lettres");
            return false;
        }

        for (int i = 0; i < userSubstitutionAlphabet.length(); i++){

            char letter = userSubstitutionAlphabet.charAt(i);

            if (userSubstitutionAlphabet.indexOf(letter,i + 1) >= 0){
                System.out.println("Vous ne pouvez pas mettre plusieurs fois la même lettre");
                return false;

            } else if ( !(letter >= 'a' && letter <= 'z')) {
                System.out.println("Vous ne devez saisir seulement que des lettres !");
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // A copier dans la console pour tester :
        String randomAlphabet = "  qazwsxedcrfvt gbyhnuj mikolp  ";

        String userChoice1 = userChoice();
        SubstitutionCipher  firstCipher = new SubstitutionCipher(LATIN_ALPHABET,userChoice1);

        System.out.println("Attention message en cours de cryptage .... ");
        String textCrypt = firstCipher.cipher(textToEncrypt,10);

        System.out.println("Voici votre message crypté : " + textCrypt);



    }
}
