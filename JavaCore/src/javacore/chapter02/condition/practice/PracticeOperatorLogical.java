package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {
        boolean trueAndTrue = true && true;     // true
        boolean trueAndFalse = true && false;   // false
        boolean falseAndTrue = false && true;   // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue = true || true;     // true
        boolean trueOrFalse = true || false;    // true
        boolean falseOrTrue = false || true;    // true
        boolean falseOrFalse = false || false;  // false

        boolean notTrue = !true;   // false
        boolean notFalse = !false; // true

        boolean trueAndTrueAndTrue = true && true && true;   // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean tureOrTrueOrTrue = true || true || true;     // true
        boolean tureOrTrueOrFalse = true || true || false;   // true

        boolean notNotTrue = !!true;   //true
        boolean notNotFalse = !!false; //false


        boolean isLoggedIn = true; //L'utilisateur est-il connecté ?
        int age = 15; // Age de l'utilisateur
        int seatsAvailable = 40; // Nombres de places disponibles dans l'avion

        boolean isPremiumMember = true; // Utilisateur est un membre VIP
        boolean isVIPFlight = true; // Vol est réservé au VIP

        if(isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVIPFlight || isPremiumMember ) ) {

            System.out.println("Réservation effectuée avec succès");
            seatsAvailable--; //seatsAvailable -= 1;
        }
        else {
            System.out.println("Réservation Impossible, essayez plus tard");
        }






    }
}
