package javacore.chapter02.condition.exercice;

public class FirstBooleanCondition {

    public static void main(String[] args) {


        byte age = 32;
        boolean isAdult = true;


        // Sans boolean
        if (age >= 18){
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }

        // Utilisation boolean
        if (isAdult){
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }

    }
}
