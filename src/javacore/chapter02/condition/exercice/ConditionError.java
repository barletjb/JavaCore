package javacore.chapter02.condition.exercice;

public class ConditionError {

    public static void main(String[] args) {

        int age = 60;

        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        }
        else if(age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        }
        else if(age == 18) {
            System.out.println("Vous êtes majeur.");
        }
        // ajout d'une deuxième condition
        else if(age <= 60) {
            System.out.println("Vous êtes un adulte.");
        }
        else if(age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        }
        else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

    }
}
