package chapter05.exercice;

public class AlphabetVowelSearcher {


    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        // Ecrivez le code ci-dessous

        System.out.println("---------- Méthode sans indexOf ----------");

        for (int index = 0; index < alphabet.length(); index++){

            for (int i = 0; i< vowels.length(); i++){
                if ((alphabet.charAt(index)) == vowels.charAt(i)){
                    System.out.println("Cette lettre : (" + vowels.charAt(i) + ") est une voyelle. L'index correspondant dans l'alphabet est le (" + index + ").");
                }
            }
        }
        System.out.println();

        System.out.println("---------- Méthode avec indexOf ----------");

        for (int index = 0; index < alphabet.length(); index++) {
            char letter = alphabet.charAt(index);
            if (vowels.indexOf(letter) > -1) {
                System.out.println("Cette lettre : (" + letter + ") est une voyelle. L'index correspondant dans l'alphabet est le (" + index + ").");
            }
        }



    }

}
