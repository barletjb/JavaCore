package javacore.chapter02.condition.exercice;

public class ObfuscatedCodeV1 {


    public static void main(String[] args) {

        // Type de véhicule
        int car = 1;
        int van = 2;
        int truck = 3;

        // Déclaration véhicule
        int vehicle1 = 1;

        // Distance parcourue par un véhicule sur le tronçon en km
        double distance_traveled = 100; // Distance

        // Abonné au télépéage ? Si oui réduction de 3 %, si non plein tarif
        boolean subscriber = true;
        double reduction = 0.03;

        // Initialisation taxe du péage
        double taxes = 0;

        // Si véhicule est une voiture
        if (vehicle1 == 1) {
            //calcul coût trajet en fonction de la distance parcourue pour une voiture
            taxes = distance_traveled * 0.10;
        }
        // Si véhicule est un van / utilitaire
        else if (vehicle1 == 2) {
            //calcul coût trajet en fonction de la distance parcourue pour un van / utilitaire
            taxes = distance_traveled * 0.20;
        }
        // Si véhicule est un camion
        else if (vehicle1 == 3) {
            //calcul coût trajet en fonction de la distance parcourue pour un camion
            taxes = distance_traveled * 0.35;
        }
        if (subscriber) {
            taxes = taxes - (distance_traveled * reduction);
        }

        System.out.println("Le coût de votre trajet est de : " + taxes + " €");


    }
}
