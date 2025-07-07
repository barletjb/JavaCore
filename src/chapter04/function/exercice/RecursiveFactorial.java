package chapter04.function.exercice;

public class RecursiveFactorial {

    public static void main(String[] args) {

        int number = 5;
        int resultat = factorialNumber(number);
        System.out.println("Le resultat " + number + "! est de : " + resultat);

    }

    public static int factorialNumber(int number){
        if(number == 0){
            return 1;
        }
       return number * factorialNumber(number -1);
    }


}
