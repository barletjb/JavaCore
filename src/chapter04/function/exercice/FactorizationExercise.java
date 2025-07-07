package chapter04.function.exercice;

public class FactorizationExercise {

    public static void main(String[] args) {

        // Afficher les nombres de 1 à 5
        displaySectionNumber(1,5);

        // Afficher la table de multiplication de 2
        displaySectionMulti(2);

        // Afficher la table de multiplication de 3
        displaySectionMulti(3);


        // Afficher la table de multiplication de 6
        displaySectionMulti(6);


        // Afficher les carrés des nombres de 1 à 5
        displaySectionCarre(1,5);


        // Afficher les carrés des nombres de 6 à 10
        displaySectionCarre(6,10);


    }

    public  static  void displaySectionNumber (int number1, int number2) {
        System.out.println("Afficher les nombre de " + number1 + " à " + number2 + " :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nombre: " + i);
        }
    }

    public static void displaySectionCarre (int number1, int number2){
        System.out.println("Carrés des nombres de " + number1 + " à " + number2 + " :");
        for (int i = number1; i <= number2; i++) {
            System.out.println(i + " au carré = " + (i * i));
        }
    }

    public static void displaySectionMulti(int number1){
        System.out.println("Table de multiplication de " + number1 + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println( number1 + " x " + i + " = " + (number1 * i));
        }
    }

}
