package chapter05.exercice;

public class ReversedString {

    public static void charAt(int index){


    }

    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";

        // Ecrivez le code ci-dessous

        for (int i = (text.length() - 1); i > 0; i--) {
            System.out.print(text.charAt(i));
        }

    }


}
