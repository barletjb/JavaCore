package chapter04.function.exercice;


public class RecursiveFibonacci {

    public static void main(String[] args) {

        fonctionFibonacci(0, 1, 0);

    }

    public static void fonctionFibonacci (int firstValue, int secondValue, int round){

        if (round == 20){
            return;
        }

        System.out.println("La valeur du roud : " + round + " est de : " + firstValue);

        int nextValue;

        nextValue = firstValue + secondValue;

        fonctionFibonacci(secondValue, nextValue,round + 1);


    }
}
