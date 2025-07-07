package chapter02.condition.exercice;

import java.util.Scanner;

public class AgeBasedDiscount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Définir âges : Age forfait jeune : <25; Age forfait senior : > 65
        int youngAge = 25;
        int oldAge = 65;

        // Différents prix : Plein Tarif : 50 €, Forfait Jeune : -25% (soit 37,5€), Forfait Senior : -75% (soit 12,5€)
        double price = 50;
        // Création chapter01.variable avec directement le prix réduit
        double youngPrice = 37.5;
        double oldPrice = 12.5;

        // Création chapter01.variable pour calculer les différents forfaits
        double forfaitYoung = price * ( 1.0 - 25.0 / 100 );
        double forfaitOld = price * ( 1.0 - 75.0 / 100 );

        //Utilisation d'un scanner pour saisief
        System.out.println("Entrez votre âge");
        int saisieAge = scanner.nextInt();

        if ( saisieAge <= youngAge ) {
            //appel calcul prix
            System.out.println("Le Forfait Jeune s'applique. Le prix de votre billet est de : " + forfaitYoung + " €");
        } else if ( saisieAge >= oldAge) {
            //appel calcul prix
            System.out.println("le Forfait Senior s'applique. Le prix de votre billet est de : " + forfaitOld + " €");
        } else {
            System.out.println("Le prix de votre billet est de : " + price + " €");
        }


    }
}
