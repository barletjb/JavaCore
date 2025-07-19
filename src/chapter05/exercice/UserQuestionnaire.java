package chapter05.exercice;

import java.util.Scanner;

public class UserQuestionnaire {

    String userSurname;
    int userAge;
    String userChoice;
    double userResult;

    public UserQuestionnaire(String userSurname, int userAge, String userChoice) {
        this.userSurname = userSurname;
        this.userAge = userAge;
        this.userChoice = userChoice;
    }

    public UserQuestionnaire(String userSurname, int userAge, String userChoice, double userResult){
        this.userSurname = userSurname;
        this.userAge = userAge;
        this.userChoice = userChoice;
        this.userResult = userResult;
    }

    public void displayInformations(){
        System.out.println("Vos informations : ");
        System.out.println("Votre prénom : " + this.userSurname + " | Votre âge : " + this.userAge);
    }

    public void displayInformationwWithResult(){
        this.displayInformations();
        System.out.println("Le resultat de votre calcul est : " + this.userResult);
    }


    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.print("Saisir votre prénom : ");
          String userSurname = sc.nextLine();
          System.out.print("Saisir votre âge : ");
          int userAge = sc.nextInt();
          sc.nextLine();

          System.out.print("Souhaitez-vous continuer le questionnaire (Oui ou Non) ? ");
          String userChoice2 = sc.nextLine();

          UserQuestionnaire user1 = new UserQuestionnaire(userSurname,userAge,userChoice2);

          if (user1.userChoice.equals("Non")){
              user1.displayInformations();

          } else {
              System.out.print("Quel est le résultat de 5/2 : ");
              double userResult = sc.nextDouble();
              user1 = new UserQuestionnaire(userSurname,userAge,userChoice2,userResult);
              user1.displayInformationwWithResult();
          }







    }
}
