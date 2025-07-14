package chapter04.function.exercice;


public class RecursiveFibonacci {

    public static final int MAX_ROUND = 20;

    public static void main(String[] args) {

        printFibonacciRecursively(0, 1, 0, MAX_ROUND);

    }

    public static void printFibonacciRecursively(int firstValue, int secondValue, int round, final int MAX_ROUND){

        if (round == MAX_ROUND){
            return;
        }

        System.out.println("La valeur du roud : " + round + " est de : " + firstValue);

        int nextValue;

        nextValue = firstValue + secondValue;

        printFibonacciRecursively(secondValue, nextValue,round + 1, MAX_ROUND);


    }
}
