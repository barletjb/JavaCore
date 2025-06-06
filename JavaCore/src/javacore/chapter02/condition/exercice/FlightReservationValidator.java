package javacore.chapter02.condition.exercice;

public class FlightReservationValidator {

    public static void main(String[] args) {

        boolean isLoggedIn = true; //L'utilisateur est-il connecté ?
        int age = 18; // Age de l'utilisateur
        int seatsAvailable = 40; // Nombres de places disponibles dans l'avion

        boolean isPremiumMember = true; // Utilisateur est un membre VIP
        boolean isVIPFlight = true; // Vol est réservé au VIP


        if (!isLoggedIn || age < 18 ) {
            if (isLoggedIn && age < 18) {
                System.err.println("Réservation impossbile. Vous devez être majeur pour accéder à la plateforme de réservation");
            }
            else {
                System.err.println("Réservation impossible. Veuillez vous connecter pour réserver un billet");
            }
        } else {
            //Conditions de réservations
            if (isVIPFlight && !isPremiumMember && seatsAvailable > 0) {
                System.err.println("Réservation impossible : Vous devez être membre prenium pour reserver sur celui-ci");
            } else if (isPremiumMember && seatsAvailable == 0) {
                System.err.println("Réservation impossible : malheuresement ce vol n'a plus de place disponible ");
            } else {
                System.out.println("Réservation avec succès pour ce vol");
            }

        }

    }

}
