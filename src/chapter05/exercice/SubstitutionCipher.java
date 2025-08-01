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
     * Encrypts a message using the substitution cipher and intermediate placeholders with {String.replaceAll}.
     * The encryption is done in two passes:
     *  - Each Latin letter is temporarily replaced by a placeholder (@index@).
     *  - The placeholders are then replaced by the corresponding substitution characters.
     * This avoids conflict when replacement letters are also part of the source text.
     *
     * @param textToEncrypt the original plain text message to encrypt
     * @return the encrypted message using the substitution cipher
     */
    public static String cryptMessageWithReplaceAll(String textToEncrypt){

        String textCrypt = textToEncrypt;

        for (int index = 0; index < LATIN_ALPHABET.length(); index++){

            String latinLetter = String.valueOf(LATIN_ALPHABET.charAt(index));
            String substitutionNumber = ("@" + index + "@");

            textCrypt = textCrypt.replaceAll(latinLetter, substitutionNumber);
        }

        for (int i = 0; i < SUBSTITUTION_ALPHABET.length(); i++) {

            String substitutionNumber = ("@" + i + "@");
            String substitutionLetter = String.valueOf(SUBSTITUTION_ALPHABET.charAt(i));

            textCrypt = textCrypt.replaceAll(substitutionNumber, substitutionLetter);
        }

        return textCrypt;
    }



    public static void main(String[] args) {

        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // Ecrivez le code ci-dessous

        System.out.println("-------------- METHODE n°1 --------------");
        String textCrypt = cryptMessageWithoutReplaceAll(textToEncrypt);
        System.out.println("Veuillez transmettre ce message de toute urgence : " + textCrypt);
        System.out.println();

        System.out.println("-------------- METHODE n°2 --------------");
        String textCrypt2 = cryptMessageWithReplaceAll(textToEncrypt);
        System.out.println("Veuillez transmettre ce message de toute urgence : " + textCrypt2);
        System.out.println();
        
    }
}
