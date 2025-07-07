package javacore.chapter03.loop.exercice;

import java.math.BigInteger;

public class FibonacciCalculator {

    public static void main(String[] args) {

        int round = 0;
        int roundPair=0;
        BigInteger firstValue = BigInteger.ZERO;
        BigInteger secondValue = BigInteger.ONE;
        BigInteger nextValue;


        while (round < 1000) {
            if (firstValue.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
                System.out.println("Le round " + round + " vaut : " + firstValue);
                roundPair++;
            }
            nextValue = firstValue.add(secondValue);
            firstValue = secondValue;
            secondValue = nextValue;

            round++;
        }
        System.out.println("Il y a : " + roundPair + " termes pairs parmi les 1000 premiers de la suite de Fibonacci." );

    }


}

