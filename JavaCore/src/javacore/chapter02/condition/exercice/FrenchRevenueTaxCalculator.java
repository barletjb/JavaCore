package javacore.chapter02.condition.exercice;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // De 0€ à 11.294€ _______ : 0%. à tester <=
        //De 11.295€ à 28.797€ __ : 11%. à tester >= && <=
        //De 28.798€ à 82.341€ _ : 30%. à tester >= && <=
        //De 82.342€ à 177.106€ _ : 41%  tester >= && <=
        //Supérieur à 177.106€ ___ : 45% à tester >=

        // Valeur salaire net imposable annuel (après déduction cotisation sociale)
        double salary1 = 8000;
        double salary2 = 20000;
        double salary3 = 50000;
        double salary4 = 100000;
        double salary5 = 180000;

        // Initialisation paliers IR
        double cap1 = 11294;
        double cap2 = 28797;
        double cap3 = 82341;
        double cap4 = 177105;

        // On doit calculer le montant max des impots compris dans les différentes tranches.
        double irFirstClass = (cap2 - cap1) * 0.11;
        double irScdClass = (cap3 - cap2) * 0.30;
        double irTrdClass = (cap4 - cap3) * 0.41;
        double irLstClass = (salary3 - cap4) * 0.45;

        // Initialisation Total impot.
        double irTotal;

        // String affichages tranches;
        String tranche4 = "Vous faites partie de la quatrième tranche. Votre barème est le suivant :";
        String tranche3 = "Vous faites partie de la troisième tranche. Votre barème est le suivant :";
        String tranche2 = "Vous faites partie de la deuxième tranche. Votre barème est le suivant :";
        String tranche1 = "Vous faites partie de la première tranche. Votre barème est le suivant :";

        // String affichages barèmes;
        String bareme4 = ("Supérieur à : " + cap4 + "  est de 45 %.");
        String bareme3 = ("Entre : " + cap4 + " et " + cap3 + "  est de 40 %.");
        String bareme2 = ("Entre : " + cap3 + " et " + cap2 + "  est de 30 %.");
        String bareme1 = ("Entre : " + cap2 + " et " + cap1 + " est de 11 %.");

        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + salary3 + " €");
        System.out.println("------ Calcul de vos Impots ------");

        // Le salaire est inférieur à 11 294 €
        if (salary3 <= cap1) {
            System.out.println("Pas d'impôt à régler.");
        }

        // Si le salaire est compris entre 28 798 € et 11 294 €
        if ( salary3 <= cap2 && salary3 > cap1) {
            // Calcul + ajout à irTotal
            irTotal = (salary3 - cap1) * 0.11;
            System.out.println(tranche1);
            System.out.println(bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + irTotal + " €.");
        }

        // Si le salaire est compris entre 82 342 € et 28 798 €
        if ( salary3 <= cap3 && salary3 > cap2) {
            // Calcul + ajout à irTotal
            irTotal = ((salary3 - cap2) * 0.30) + irFirstClass;
            System.out.println(tranche2);
            System.out.println(bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + irTotal + " € (" + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ") ;
        }

        // Si le salaire est compris entre 177 105 € et 82 342 €
        if ( salary3 <= cap4 && salary3 > cap3) {
            // Calcul + ajout à irTotal
            irTotal = ((salary3 - cap3) * 0.41) + irScdClass + irFirstClass;
            System.out.println(tranche3);
            System.out.println(bareme3 + " " + bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + irTotal + " € (" + irTrdClass + " à 40% , " + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ");
        }

        // Si le salaire est supérieur à 177 105 €
        if ( salary3 > cap4) {
            // Calcul + ajout à irTotal
            irTotal = irLstClass + irTrdClass + irScdClass + irFirstClass;
            System.out.println(tranche4);
            System.out.println(bareme4 + " " + bareme3 + " " + bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + irTotal + " € (" + irLstClass + " à 45% , " + irTrdClass + " à 40% , " + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ");
        }

    }
}

