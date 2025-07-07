package chapter02.condition.exercice;

public class SmartHomeSecurity {

    public static void main(String[] args) {

        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed =  true;
        boolean isAlarmActivated = true;
        boolean isSafeModeActivated;

        // Setting security mod
        // Safe mode Activated if house Empty OR ownner sleep
        // AND if all doors and windows closes ANND alarm activated
        isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        // Print result
        if (isSafeModeActivated) {
            System.out.println("La maison est en mode sécurisé.");
        } else {
            System.out.println("Attention : la maison n'est PAS en mode sécurisé !");
        }

    }
}
