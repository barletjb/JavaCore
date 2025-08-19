package chapter05.exercice;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {

       // String binaryText = "10110110";
//        int decimalValue= 0;
//
//        for(int i = 0; i < binaryText.length(); i++ ){
//
//            char number = binaryText.charAt(i);
//
//            String s = String.valueOf(number);
//            int n = Integer.parseInt(s);
//
//            int position = binaryText.length() - 1 - i;
//            double resultat = n * Math.pow(2, position);
//
//            decimalValue += resultat;
//        }
//
//        System.out.println("Binaire : " + binaryText);
//        System.out.println("Décimal : " + decimalValue);

        // Question 3 : Ajouter dans la boucle For :
        // System.out.println("i=" + i + " bit=" + n + " position=" + position + " valeur=" + (n * Math.pow(2, position)));
        // Ou bien faire des calculs simples, si cela marche sur des petits calculs répétitifs, aucun soucis
        // Utiliser un long pour le 64 bits

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une valeur binaire : ");
        String binaryText = scanner.nextLine();


        if (!binaryText.matches("[01]+")) {
            System.out.println("Erreur : la valeur doit être composée uniquement de 0 et de 1.");
            return;
        }

        long decimalValue = 0;

        for (int i = 0; i < binaryText.length(); i++) {
            char number = binaryText.charAt(i);

            String s = String.valueOf(number);
            int n = Integer.parseInt(s);

            int position = binaryText.length() - 1 - i;

            decimalValue += n * Math.pow(2, position);
        }

        System.out.println("Binaire : " + binaryText);
        System.out.println("Décimal : " + decimalValue);

    }
}
