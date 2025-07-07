package chapter01.variable.exercice;

public class SalaryForecast {

    public static void main (String[] args ){

        String name = "CANDUSO";
        String surname = "Pietro";
        String country = "France";
        String job = "Développeur";
        String statut = "cadre";

        byte tauxHBrut = 25;
        float dayHour = 7.7F;
        float weekHour = 38.5F;
        float taxe = 10.5F;

        // Salaire Brut
        float daySalaryBrut = tauxHBrut * dayHour;
        float weekSalaryBrut = daySalaryBrut * 5;
        float monthSalaryBrut = weekSalaryBrut * 4;
        float yearSalaryBrut = monthSalaryBrut * 12;
        // N.B : Si 52 ou 53 semaines faire deux calculs supp;

        // Salaire Net Avant Impot
        float daySalaryNet = daySalaryBrut * 0.75F;
        float weekSalaryNet = weekSalaryBrut * 0.75F;
        float monthSalaryNet = monthSalaryBrut * 0.75F;
        float yearSalaryNet = yearSalaryBrut * 0.75F;

        //Salaire après impôts (tristesse...)
        float daySalaryTaxe = daySalaryNet * ( 1 - taxe / 100 );
        float weekSalaryTaxe = weekSalaryNet * (1 - taxe / 100);
        float monthSalaryTaxe = monthSalaryNet * (1 - taxe / 100);
        float yearSalaryTaxe = yearSalaryNet * (1 - taxe / 100);

        System.out.println("---------- Informations ----------");
        System.out.println(name + " " + surname + ", Travaillant en : " + country + ".");
        System.out.println("Poste : " + job + " , Statut : " + statut + ".");
        System.out.println("---------- Salaire Brut ----------");
        System.out.println("Salaire Brut Journalier : " + daySalaryBrut + " €");
        System.out.println("Salaire Brut Hebdomadaire : " + weekSalaryBrut + " €");
        System.out.println("Salaire Brut Mensuel: " + monthSalaryBrut + " €");
        System.out.println("Salaire Brut Annuel : " + yearSalaryBrut + " €");
        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Salaire Net Imposable Journalier : " + daySalaryNet + " €");
        System.out.println("Salaire Net Imposable Hebdomadaire : " + weekSalaryNet + " €");
        System.out.println("Salaire Net Imposable Mensuel: " + monthSalaryNet + " €");
        System.out.println("Salaire Net Imposable Annuel : " + yearSalaryNet + " €");
        System.out.println("------ Salaire Après Impôts ------");
        System.out.println("Salaire Net d'Impôt Journalier : " + daySalaryTaxe + " €");
        System.out.println("Salaire Net d'Impôt Hebdomadaire : " + weekSalaryTaxe + " €");
        System.out.println("Salaire Net d'Impôt Mensuel: " + monthSalaryTaxe + " €");
        System.out.println("Salaire Net d'Impôt Annuel : " + yearSalaryTaxe + " €");

    }
}

