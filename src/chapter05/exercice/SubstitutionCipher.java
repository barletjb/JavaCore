package chapter05.exercice;

public class SubstitutionCipher {


    public static void main(String[] args) {

        /**
         * Alphabet Standard (Latin)
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        /**
         *  Alphabet de Substitution
         */
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

        /**
         *  Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";


        // Ecrivez le code ci-dessous

        char[] latinCharAlphabet = new char[26];
        char[] substitutionCharAlphabet = new char[26];

        String textCrypt = "";

        for (int index = 0; index < latinCharAlphabet.length; index++) {
            char letterAlphabet = latinAlphabet.charAt(index);
            latinCharAlphabet[index] = letterAlphabet;

            char letterSubstitutionAlphabet = substitutionAlphabet.charAt(index);
            substitutionCharAlphabet[index] = letterSubstitutionAlphabet;
        }

        for (int index = 0; index < textToEncrypt.length(); index++) {

            char targetLetter = textToEncrypt.charAt(index);

            for (int i = 0; i < latinCharAlphabet.length; i++) {

                if (targetLetter == latinCharAlphabet[i]) {
                    textCrypt += substitutionCharAlphabet[i];
                    break;
                }
                else if (targetLetter == ' '){
                    textCrypt += ' ';
                    break;
                }

            }
        }

        System.out.println(textCrypt);


    }

}
