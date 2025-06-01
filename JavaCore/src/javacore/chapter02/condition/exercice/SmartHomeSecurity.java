package javacore.chapter02.condition.exercice;

public class SmartHomeSecurity {

    public static void main(String[] args) {

        // indiquer si la maison est vide.
        boolean isHouseEmpty = true;

        //indiquer si le propriétaire dort.
        boolean isOwnerAsleep = true;

        //indiquer si toutes les portes et fenêtres sont fermées.
        boolean areAllDoorsAndWindowsClosed =  true;

        //indiquer si l'alarme est activée.
        boolean isAlarmActivated = true;

        // Déclaration de la variable isSafeModeActivated
        boolean isSafeModeActivated;

        // Détermination du mode sécurisé
        // Le mode sécurisé est activé si la maison est vide OU si le propriétaire dort,
        // ET si toutes les portes/fenêtres sont fermées ET si l’alarme est activée.
        isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        // Affichage du message selon le résultat
        if (isSafeModeActivated) {
            System.out.println("La maison est en mode sécurisé.");
        } else {
            System.out.println("Attention : la maison n'est PAS en mode sécurisé !");
        }

    }
}
