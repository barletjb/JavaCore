package chapter05.exercice;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    public static void main(String[] args) {

        Random rand = new Random();

        int target = rand.nextInt(101);
        int chance = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Robot parle : J'ai choisi mon nombre entre 0 et 100. À vous de jouer !");

        boolean found = false;
        while (chance > 0) {
            System.out.print("Proposition entre [0, 100]. Tentatives restantes: " + chance + " : ");

            int userChoice = sc.nextInt();

            if (userChoice < 0 || userChoice > 100) {
                System.out.println("Error : entrez un nombre dans [0, 100]. Votre tentative n'est pas comptée.");
            } else {

                chance--;

                if (userChoice == target) {
                    System.out.println("Bravo ! Vous avez trouvé le nombre mystère: " + target);
                    found = true;
                    break;
                } else if (userChoice < target) {
                    System.out.println("C'est plus grand !");
                } else {
                    System.out.println("C'est plus petit !");
                }
            }
        }

        if (!found) {
            System.out.println("LOOSER ! Le nombre mystère était: " + target);
        }

        sc.close();

    }
}
