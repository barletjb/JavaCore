package chapter05.practice;

import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5};

        System.out.println("Référence Tableau : " + integerArray);
        System.out.println("Taille du tableau : " + integerArray.length);

        System.out.println("Premier élément du Tableau : " + integerArray[0]);
        System.out.println("Dernier élément du Tableau : " + integerArray[4]);

        integerArray[0] = 10;
        System.out.println("Premier (2) élément du Tableau : " + integerArray[0]);

        for (int index = 0; index <= integerArray.length - 1; index++) {
            System.out.println(integerArray[index]);
        }

        // Identique
        for (int index = 0; index < integerArray.length; index++) {
            System.out.println(integerArray[index]);
        }

        int[] integerArray2 = new int[20];
        System.out.println("Premier élément de intergerArray2 : " + integerArray2[0]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'éléments voulez-vous additioner ?");
        int desiredUserSize = scanner.nextInt();

        int[] userNumberArray = new int[desiredUserSize];

        for (int index = 0; index < userNumberArray.length; index++) {
            System.out.print("Entrez le nombre (" + (index + 1) + "/" + desiredUserSize + ") : ");
            userNumberArray[index] = scanner.nextInt();
        }

        int sumResult = 0;

        for (int index = 0; index < userNumberArray.length; index++) {
            sumResult += userNumberArray[index];
        }

        System.out.println("Résultat : " + sumResult);

    }
}
