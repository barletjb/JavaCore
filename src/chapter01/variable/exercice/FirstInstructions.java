package chapter01.variable.exercice;

public class FirstInstructions {

    public static void main(String[] args) {

        int age = 32;
        System.out.println(age);
        System.out.println("J'ai " + age + " ans");

        String displayAge = "J'ai " + age + " ans";
        System.out.println(displayAge);

        String firstName = "Jean-Baptiste";
        System.out.println(firstName);
        String displayFirstName = "Je m'appelle " + firstName + ".";
        System.out.println(displayFirstName);

        System.out.println(displayFirstName + " " + displayAge);
        System.out.println("Je m'appelle " + firstName + "." + " J'ai " + age + " ans.");




    }
}
