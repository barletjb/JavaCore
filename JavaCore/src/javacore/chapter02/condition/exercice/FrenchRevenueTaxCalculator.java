package javacore.chapter02.condition.exercice;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {

        // De 0€ à 11.294€ _______ : 0%. à tester <=
        //De 11.295€ à 28.797€ __ : 11%. à tester >= && <=
        //De 28.798€ à 82.341€ _ : 30%. à tester >= && <=
        //De 82.342€ à 177.106€ _ : 41%  tester >= && <=
        //Supérieur à 177.106€ ___ : 45% à tester >=

        // Valeur salaire net imposable annuel (après déduction cotisation sociale)
        double salary = 180000;


        // Initialisation paliers IR
        double firstClassCap = 11294;
        double secondClassCap = 28797;
        double thrirdClassCap = 82341;
        double lastClassCap = 177105;


        // On doit calculer le montant max des impots compris dans les différentes tranches.
        double irFirstClass = (secondClassCap - firstClassCap) * 0.11;
        double irScdClass = (thrirdClassCap - secondClassCap) * 0.30;
        double irTrdClass = (lastClassCap - thrirdClassCap) * 0.41;
        double irLstClass = (salary - lastClassCap) * 0.45;

        // String affichages tranches;
        String tranche4 = "Vous faites partie de la quatrième tranche, Votre barème est le suivant :";
        String tranche3 = "Vous faites partie de la troisième tranche";
        String tranche2 = "Vous faites partie de la deuxième tranche";
        String tranche1 = "Vous faites partie de la première tranche";

        // String affichages barèmes;
        String bareme4 = ("Supérieur à : " + lastClassCap + "  est de 45 %.");
        String bareme3 = ("Entre : " + lastClassCap + " et " + thrirdClassCap + "  est de 40 %.");
        String bareme2 = ("Entre : " + thrirdClassCap + " et " + secondClassCap + "  est de 30 %.");
        String bareme1 = ("Entre : " + secondClassCap + " et " + firstClassCap + " est de 11 %.");

        System.out.println("------ Salaire Net Imposable ------");
        System.out.println("Votre salaire : " + salary + " €");
        System.out.println("------ Calcul de vos Impots ------");

        // Le salaire est inférieur à 11 294 €
        if (salary <= firstClassCap) {

            System.out.println("Pas d'impôt à régler.");
        }

        // Si le salaire est compris entre 28 798 € et 11 294 €
        if ( salary <= secondClassCap && salary > firstClassCap) {

            double totalIr = (salary - firstClassCap) * 0.11;
            System.out.println(tranche1);
            System.out.println(bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + totalIr + " €.");
        }

        // Si le salaire est compris entre 82 342 € et 28 798 €
        if ( salary <= thrirdClassCap && salary > secondClassCap) {

            double irScnd = (salary - secondClassCap) * 0.30;
            double totalIr = irScnd + irFirstClass;
            System.out.println(tranche2);
            System.out.println(bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + totalIr + " € (" + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ") ;
        }

        // Si le salaire est compris entre 177 105 € et 82 342 €
        if ( salary <= lastClassCap && salary > thrirdClassCap) {

            double irTrd = (salary - thrirdClassCap) * 0.41;
            double totalIr = irTrd + irScdClass + irFirstClass;
            System.out.println(tranche3);
            System.out.println(bareme3 + " " + bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + totalIr + " € (" + irTrd + " à 40% , " + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ");
        }

        // Si le salaire est supérieur à 177 105 €
        if ( salary > lastClassCap ) {

            double totalIr = irLstClass + irTrdClass + irScdClass + irFirstClass;
            System.out.println(tranche4);
            System.out.println(bareme4 + " " + bareme3 + " " + bareme2 + " " + bareme1);
            System.out.println("Le total de vos impôts à nous régler est de " + totalIr + " € (" + irLstClass + " à 45% , " + irTrdClass + " à 40% , " + irScdClass + " à 30 % , " + irFirstClass + " à 11 %). ");
        }

    }
}

