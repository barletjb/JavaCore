package chapter05.exercice;

import java.util.Scanner;

public class SubstitutionCipher {

    public static Scanner s = new Scanner(System.in);

    public static final String LATIN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    String latinAlphabet;
    String substitutionAlphabet;


    public SubstitutionCipher(String alphabet, String substitutionAlphabet) {
        this.latinAlphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }



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

    public String cipher2 (String textToEncrypt){

        char[] alreadyReplace = new char[26];
        String textCrypt = textToEncrypt;

        for (int i = 0; i < this.latinAlphabet.length(); i++){

            char originalLetter = this.latinAlphabet.charAt(i);
            char substitutionLetter = this.substitutionAlphabet.charAt(i);

            int index = originalLetter - 'a';
            int indexSubstitution = substitutionLetter -'a';

            if (alreadyReplace[index] != substitutionLetter) {

                textCrypt = textCrypt.replaceAll(String.valueOf(originalLetter), String.valueOf(substitutionLetter));


                alreadyReplace[index] = originalLetter;
                //alreadyReplace[indexSubstitution] = ;
            }
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



    public static String userChoice (){

        while (true) {
            try {
                System.out.print("Veuillez saisir votre alphabet de substitution :");
                String substitutionAlpha = s.nextLine().toLowerCase().trim();
                substitutionAlpha = substitutionAlpha.replaceAll("\\s+", "");

                validateSize(substitutionAlpha);
                validateChar(substitutionAlpha);
                validateRepetitionChar(substitutionAlpha);

                return substitutionAlpha;

            } catch (SizeException | RepetitionException | CharException e ){
                System.out.println("ERROR : " + e.getMessage());
            }

        }
    }


    public static class SizeException extends Exception{
        public SizeException(String message){
            super(message);
        }
    }

    public static void validateSize(String substitutionAlphabet) throws SizeException {
        if (substitutionAlphabet.length() != LATIN_ALPHABET.length()){
            throw new SizeException("Veuillez bien saisir 26 lettres");
        }

    }

    public static class CharException extends Exception{
        public CharException(String message){
            super(message);
        }
    }

    public static void validateChar(String substitutionAlphabet) throws CharException {

        for (int i = 0; i < substitutionAlphabet.length(); i++){

            char letter = substitutionAlphabet.charAt(i);

            if ( !(letter >= 'a' && letter <= 'z')) {
                throw new CharException("Vous ne devez saisir seulement que des lettres !");
            }
        }
    }

    public static class RepetitionException extends Exception{
        public RepetitionException(String message){
            super(message);
        }
    }

    public static void validateRepetitionChar(String substitutionAlphabet) throws RepetitionException{

        for (int i = 0; i < substitutionAlphabet.length(); i++){

            char letter = substitutionAlphabet.charAt(i);

            if (substitutionAlphabet.indexOf(letter,i + 1) >= 0) {
                throw new RepetitionException("Vous ne pouvez pas mettre plusieurs fois la même lettre");
            }
        }

    }


    public static void main(String[] args) {

        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // A copier dans la console pour tester :
        String randomAlphabet = "  qazwsxedcrfvt gbyhnuj mikolp  ";

        String userChoice1 = userChoice();
        SubstitutionCipher  firstCipher = new SubstitutionCipher(LATIN_ALPHABET,userChoice1);

        System.out.println("Attention message en cours de cryptage .... ");
        int numberIterations = 10;
        String textCrypt = firstCipher.cipher(textToEncrypt,numberIterations);
        System.out.println("Voici votre message crypté : " + textCrypt);


        System.out.println("CYPER 2");
        String textCrypt2 = firstCipher.cipher2(textToEncrypt);
        System.out.println(textCrypt2);





    }
}
