package chapter02.condition.exercice;

public class AgeValidation {

    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */

        // Écrivez votre code ci-dessous...

        final int FRENCH_Majority = 18;

        int birthdayDay = 10;
        int birthdayMonth = 6;
        int birthdayYear = 2007;

        //Une année est bissextile si :
        //elle est divisible par 4 et pas divisible par 100
        //sauf si elle est divisible par 400
        boolean isLeapYear = (birthdayYear % 4 == 0 || birthdayYear % 100 != 0 || birthdayYear % 400 == 0 );

        // Change birthdayDay
        if (birthdayDay == 29 && birthdayMonth == 2 && !isLeapYear){
            birthdayDay = 28;
            // Or birthdayDay = 1 && birthdayMonth = 3
        }

        // Calcul de l'âge
        int ageYears = currentYear - birthdayYear;
        int ageMonths = currentMonth - birthdayMonth;
        int ageDays = currentDay - birthdayDay;

        // Ajustements si jours ou mois négatifs
        if (ageDays < 0) {
            ageDays += 30; //On ne gère pas 31 jours...
            ageMonths -= 1;
        }
        if (ageMonths < 0) {
            ageMonths += 12;
            ageYears -= 1;
        }

        // Check Majority
        if (ageYears >= FRENCH_Majority) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous n'êtes pas majeur");

            // Temps restant avant majorité
            int remainingYears = FRENCH_Majority - ageYears - 1;
            int remainingMonths = 11 - ageMonths;
            int remainingDays = 30 - ageDays;

            // Ajustements si on tombe sur pile 0 jour/mois/année restant
            if (remainingDays == 30) {
                remainingDays = 0;
                remainingMonths += 1;
            }
            if (remainingMonths == 12) {
                remainingMonths = 0;
                remainingYears += 1;
            }

            System.out.println("Temps restant avant votre majorité");
            System.out.println("----------------------------------");
            System.out.printf("Nombre d'année restante(s) : %d%n", remainingYears);
            System.out.printf("Nombre de mois restant(s) : %d%n", remainingMonths);
            System.out.printf("Nombre de jours restant(s) : %d%n", remainingDays);
        }

        System.out.println();
        System.out.println();

        //ALTERNATIVE Méthode N°2 : definir age user avec TOTAL DAYS
        final int MONTH = 30;
        final int YEAR = 365;
        final int TOTAL_MAJORITY = 18 * 365;

        int totalCurrentDays =  currentDay + (currentMonth * MONTH) + (currentYear * YEAR);
        int totalBirthdayDays = birthdayDay + (birthdayMonth * MONTH) + (birthdayYear * YEAR);

        //Check Majority
        if (totalCurrentDays - totalBirthdayDays < TOTAL_MAJORITY) {

            System.out.println("Vous n'êtes pas majeur ");
            // Temps restant avant majorité
            int remainingYears = FRENCH_Majority - ageYears - 1;
            int remainingMonths = 11 - ageMonths;
            int remainingDays = 30 - ageDays;

            // Ajustements si on tombe sur pile 0 jour/mois/année restant
            if (remainingDays == 30) {
                remainingDays = 0;
                remainingMonths += 1;
            }
            if (remainingMonths == 12) {
                remainingMonths = 0;
                remainingYears += 1;
            }

            System.out.println("Temps restant avant votre majorité");
            System.out.println("----------------------------------");
            System.out.printf("Nombre d'année restante(s) : %d%n", remainingYears);
            System.out.printf("Nombre de mois restant(s) : %d%n", remainingMonths);
            System.out.printf("Nombre de jours restant(s) : %d%n", remainingDays);
        }
        else {
            System.out.println("Vous êtes majeur");

        }

    }

}
