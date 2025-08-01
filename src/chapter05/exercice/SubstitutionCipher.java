package chapter05.exercice;

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
    public static String cryptMessageWithoutReplaceAll(String textToEncrypt){

        String textCrypt = "";

        for (int index = 0; index < textToEncrypt.length(); index++) {

            char targetLetter = textToEncrypt.charAt(index);

            if (targetLetter == '!'){
                textCrypt += targetLetter;
            }

            for (int i = 0; i < LATIN_ALPHABET.length(); i++) {

                if (targetLetter == LATIN_ALPHABET.charAt(i)) {
                    textCrypt += SUBSTITUTION_ALPHABET.charAt(i);
                    break;
                }
                else if (targetLetter == ' '){
                    textCrypt += ' ';
                    break;
                }
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

        String textCrypt3 = cipher("animal", latinAlphabet, substitutionAlphabet, 3);
        System.out.println(textCrypt3);

    }
}
