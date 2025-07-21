package chapter05.practice;

import java.util.Scanner;

public class PracticeString {

    public static void main(String[] args) {

        String hello1 = "Bonjour";
        String hello2 = new String("Bonjour");

        System.out.println("Comparaison Références : " + (hello1 == hello2));
        System.out.println("Comparaison Equals : " + hello1.equals(hello2));

        String hello3 = "Bonjour";
        hello3 +=" ,tout le monde";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ? ");
        String userFirstName = scanner.nextLine().trim();
        System.out.println("Le prénom donné est : " + userFirstName);

        System.out.println("Valeur rognée : " + userFirstName.trim());
        System.out.println("Valeur initiale : " + userFirstName);


        /**
         * Méthodes de la classe String
         */

        String javaCore = "JavaCore";

        System.out.println(javaCore.contains("Java")); // true

        System.out.println(javaCore.startsWith("java")); // false
        System.out.println(javaCore.endsWith("Core")); // true

        System.out.println(javaCore.toLowerCase()); // javacore
        System.out.println(javaCore.toUpperCase()); // JAVACORE

        System.out.println(javaCore.replaceAll("Java", "AWS")); // AWSCore




    }
}
