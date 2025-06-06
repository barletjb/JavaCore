package javacore.chapter02.condition.exercice;

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
        int birthdayDay = 2;
        int birthdayMonth = 3;
        int birthdayYear = 2009;

        //Une année est bissextile si :
        //elle est divisible par 4 et pas divisible par 100
        //sauf si elle est divisible par 400
        boolean isLeapYear = (birthdayYear % 4 == 0 || birthdayYear % 100 != 0 || birthdayYear % 400 == 0 );

        // Change birthdayDay
        if (birthdayDay == 29 && birthdayMonth == 2 && !isLeapYear){
            birthdayDay = 28;
            // Or birthdayDay = 1 && birthdayMonth = 3
        }
        //Méthode N°1 : En cascade
        if (birthdayYear > (currentYear - FRENCH_Majority)) {
            System.out.println("Vous n'êtes pas majeur");

            // Calcul temps restant avant majorité
            int timeDays = currentDay - birthdayDay;
            int timeMonths = currentMonth - birthdayMonth;
            int timeYears = FRENCH_Majority - (currentYear - birthdayYear);
            System.out.println("Temps restant avant votre majorité");
            System.out.println("----------------------------------");
            System.out.printf("Nombre de jours restant(s) : %d%n", timeDays);
            System.out.printf("Nombre de mois restant(s) : %d%n", timeMonths);
            System.out.printf("Nombre d'année restante(s) : %d%n", timeYears);


        }
        else if (birthdayYear == (currentYear - FRENCH_Majority)) {
            // Check Month + Day
            if (birthdayMonth <= currentMonth && birthdayDay <= currentDay) {
                System.out.println("Vous êtes majeur");

            } else {
                System.out.println("Vous êtes mineur");
            }
        }
        else {
            System.out.println("Vous êtes majeur");
        }

        //Méthode N°2 : definir age user
        System.out.println("Veuillez saisir votre âge ?");
        int ageUser1 = 17;
        int ageUser2 = 18;
        int ageUser3 = 32;

        if (ageUser1 < FRENCH_Majority) {
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("Vous êtes majeur");
        }

    }



}
