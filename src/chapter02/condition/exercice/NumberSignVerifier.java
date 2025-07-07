package chapter02.condition.exercice;

public class NumberSignVerifier {

    public static void main(String[] args) {

        int number = 25;

        if (number > 0){
            System.out.println("Votre nombre " + number + " est positif");
        } else if (number < 0) {
            System.out.println("Votre nombre " + number + " est négatif");
        } else {
            System.out.println("Votre nombre " + number + " est neutre");
        }

        // BONUS N°1: Changez le type de la chapter01.variable number de int à double.
        // Changez le code de vos conditions si vous le juger nécessaire.
        // Rien à changer

        double number2 = -1.5;
        if (number2 > 0){
            System.out.println("Votre nombre " + number2 + " est positif");
        } else if (number2 < 0) {
            System.out.println("Votre nombre " + number2 + " est négatif");
        } else {
            System.out.println("Votre nombre " + number2 + " est neutre");
        }

        // BONUS N°2: Trouvez une implémentation alternative qui n'utilise pas de bloc else.
        // Utilisation 3 boucles if

        if (number2 > 0) {
            System.out.println("Votre nombre " + number2 + " est positif");
        }
        if (number2 < 0) {
            System.out.println("Votre nombre " + number2 + " est négatif");
        }
        if (number2 == 0){
            System.out.println("Votre nombre " + number2 + " est neutre");
        }

    }
}
