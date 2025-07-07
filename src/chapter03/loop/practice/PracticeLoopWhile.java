package chapter03.loop.practice;

public class PracticeLoopWhile {

    public static void main(String[] args) {

        int result = 0;
        int currentNumber = 1;
        int maxNumber = 100;

        int testVariable = 1;

        while (currentNumber <= maxNumber ) {

            testVariable++;
            System.out.println(testVariable);
            System.out.println("Result  = " + result );
            result += currentNumber;
            System.out.println("-------> " + result);
        }

        System.out.println("Somme des nombres de 1 à 100 : " + result);
    }
}
