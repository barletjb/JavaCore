package chapter02.condition.exercice;

public class MaxOfThree {

    public static void main(String[] args) {

        //Déclaration variables
        int a = 10;
        int b = 11;
        int c = 13;

        // 1ere étape : Vérification des égalités
        if (a == b || a == c || b == c) {

            if (a == b && a != c) {
                System.err.println("Les valeurs de a et b sont égales.");
            } else if (a == c && a != b) {
                System.err.println("Les valeurs de a et c sont égales.");
            } else if (b == c && b != a) {
                System.err.println("Les valeurs de b et c sont égales.");
            } else {
                System.err.println("Toutes les valeurs sont égales, il n'y en a pas une de plus grande.");
            }

        }
        // Si 0 égalité alors vérification des nbrs + grands
        else if (a > b && a > c){
            System.out.println("La valeur a : " + a + " , est la plus grande");

        } else if (b > a && b > c) {
            System.out.println("La valeur b : " + b + " , est la plus grande");
        }
        else {
            System.out.println("La valeur c : " + c + " , est la plus grande");
        }

    }
}
