package chapter02.condition.exercice;

public class ScholarshipEligibility {

    public static void main(String[] args) {

        // test Gpa > 3.5 et GPA < 3.5
        final double GAP_STUDENT_GPA = 3.5;
        Double studentGpa = 3.6;

        // test householdIncome < 40000 && householdIncome < 60000
        final int GAP_HOUSE_HOLD_INCOME_MAX = 60000;
        final int GAP_HOUS_HOLD_INCOME_MID = 40000;
        int householdIncome = 35000;

        // test true
        boolean hasExtracurricular = true;

        // Si une des conditions alors non éligible
        if (studentGpa <= GAP_STUDENT_GPA || !hasExtracurricular || householdIncome >= GAP_HOUSE_HOLD_INCOME_MAX) {
            System.out.println("L'étudiant n'est pas éligible à une bourse d'étude");
        }
        // Vérifiacation des GAP
        else if (householdIncome < GAP_HOUS_HOLD_INCOME_MID ) {
            System.out.println("La bourse d'étude est attribuée à taux plein");
        }
        else {
            System.out.println("La bourse d'étude est attribuée à taux partiel");
        }


    }
}
