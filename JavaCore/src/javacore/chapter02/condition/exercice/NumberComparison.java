package javacore.chapter02.condition.exercice;

public class NumberComparison {

    public static void main(String[] args) {

        int number1 = 85;
        int number2 = 64;

        if (number1 < number2){
            System.out.println("Le numéro " + number1 + " est plus petit que le numéro " + number2);
        } else if ( number1 > number2) {
            System.out.println("Le numéro " + number2 + " est plus petit que le numéro " + number1);
        } else {
            System.out.println("Les numéros sont identiques");
        }

    }
}
