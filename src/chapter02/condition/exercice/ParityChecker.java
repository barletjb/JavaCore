package chapter02.condition.exercice;

public class ParityChecker {

    public static void main(String[] args) {

        int number = 44001;

        // creation boolean pour verifier le modulo
        boolean isPair = number % 2 == 0;

        if (isPair){
            System.out.println("Le nombre " + number + " est pair.");

        } else {
            System.out.println("Le nombre " + number + " est impair.");
        }



        // BONUS : Besoin d'un long pour ce numéro, ne pas oublier L à la fin
        long speNumber = 3333777799999L;

        // utilisation de la même méthode
        boolean isSpeNumberPair = speNumber % 2 == 0;

        if (isSpeNumberPair){
            System.out.println("Votre nombre spécifique " + speNumber+ " est pair.");

        } else {
            System.out.println("Votre nombre spécifique " + speNumber+ " est impair.");
        }


    }
}
