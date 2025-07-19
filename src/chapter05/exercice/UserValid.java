package chapter05.exercice;

import java.util.Scanner;

public class UserValid {

    public static final String day1 = "lundi";
    public static final String day2 = "mardi";
    public static final String day3 = "mercredi";
    public static final String day4 = "jeudi";
    public static final String day5 = "vendredi";
    public static final String day6 = "samedi";
    public static final String day7 = "dimanche";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;

        do {
            System.out.println("Entrer le jour de la semaine actuel (" + day1 + ","+ day2 + "," + day3 + ","
                                + day4 + "," + day5 + "," + day6 + "," + day7 + ") :" );

            day = sc.nextLine().toLowerCase().trim();

        } while (!day.equals(day1) && !day.equals(day2) && !day.equals(day3)
                && !day.equals(day4) && !day.equals(day5) && !day.equals(day6)
                && !day.equals(day7));

        System.out.println("Merci pour votre réponse, le jour de la semaine est le : " + day.toUpperCase());

    }
}
