package javacore.chapter02.condition.exercice;

public class AgeCategorization {

    public static void main(String[] args) {

        int age = 17;

        // Différentes valeurs à tester :
        // Enfant : x < 10 ans; Adolescent : 10 <= x < 18 ans; Jeune adulte : 18 <= x < 25 ans;
        // Adulte : 25 <= x < 65 ans ,Senior : x >= 65 ans
        int childAge = 10;
        int youngAge = 18;
        int youngAdultAge = 25;
        int adultAge = 65;


        if ( age < childAge ) {
            System.out.println("Votre age est de : " + age + " ans. Vous êtes un enfant.");
        } else if ( childAge <= age && age < youngAge ) {
            System.out.println("Votre age est de : " + age + " ans. Vous êtes un adolescent.");
        } else if ( youngAge <= age && age < youngAdultAge ) {
            System.out.println("Votre age est de : " + age + " ans. Vous êtes un jeune adulte.");
        } else if ( youngAdultAge <= age && age < adultAge ) {
            System.out.println("Votre age est de : " + age + " ans. Vous êtes un adulte.");
        } else {
            System.out.println("Votre age est de : " + age + " ans. Vous êtes un sénior.");
        }

    }
}
