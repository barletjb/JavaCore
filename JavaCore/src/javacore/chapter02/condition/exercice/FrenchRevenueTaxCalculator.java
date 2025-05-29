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
        
        // Initialisation Total impot.
        double irTotal =  0;

        // Initialisation Bareme et Tranche null;
        String bareme = "";
        String tranche = "";

        // String affichages tranches;
        String tranche4 = "Vous faites partie de la quatrième tranche. Votre barème est le suivant :";
        String tranche3 = "Vous faites partie de la troisième tranche. Votre barème est le suivant :";
        String tranche2 = "Vous faites partie de la deuxième tranche. Votre barème est le suivant :";
        String tranche1 = "Vous faites partie de la première tranche. Votre barème est le suivant :";

        String bareme4 = ("Supérieur à : " + cap4 + "  est de 45 %.");
        String bareme3 = ("Entre : " + cap3 + " et " + cap4 + "  est de 40 %.");
        String bareme2 = ("Entre : " + cap2+ " et " + cap3 + "  est de 30 %.");
        String bareme1 = ("Entre : " + cap1 + " et " + cap2 + " est de 11 %.");

        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + salary3 + " €");
        System.out.println("------ Calcul de vos Impots ------");

        // Le salaire est inférieur à 11 294 €
        if (salary3 < cap1) {
            System.out.println("Pas d'impôt à régler.");
        }

        // Si le salaire est compris entre 28 798 € et 11 294 €
        if (salary3 > cap1) {
            double base;
            if (salary3 > cap2) {
                base = cap2 - cap1;
            } else {
                base = salary3 - cap1;
            }
            irTotal += base * 0.11;
            tranche = tranche1;
            bareme = bareme1;
        }

        // Si le salaire est compris entre 82 342 € et 28 798 €
        if (salary3 > cap2) {
            double base;
            if (salary3 > cap3) {
                base = cap3 - cap2;
            } else {
                base = salary3 - cap2;
            }
            // Calcul + ajout à irTotal
            irTotal += base * 0.30;
            tranche = tranche2;
            bareme = bareme2;
        }

        // Si le salaire est compris entre 177 105 € et 82 342 €
        if (salary3 > cap3) {
            double base;
            if (salary3 > cap4) {
                base = cap4 - cap3;
            } else {
                base = salary3 - cap3;
            }
            // Calcul + ajout à irTotal
            irTotal += base * 0.41;
            tranche = tranche3;
            bareme = bareme3;
        }

        // Si le salaire est supérieur à 177 105 €
        if (salary3 > cap4) {
            irTotal += (salary3 - cap4) * 0.45;
            tranche = tranche4;
            bareme = bareme4;
        }

        System.out.println(tranche);
        System.out.println(bareme);
        System.out.println("Le total de vos impôts est de : " + irTotal);

    }
}

