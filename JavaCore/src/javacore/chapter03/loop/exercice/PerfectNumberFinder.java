package javacore.chapter03.loop.exercice;

public class PerfectNumberFinder {

    public static void main(String[] args) {

        int start;
        // Différentes valeurs à tester 100, 1000, 10000, 100000
        int end = 100000;

        int perfectNumberCount = 0;
        String perfectNumbersList = "";

        // Ne pas commencer à zero
        for (start = 2 ; start <= end; start++) {

            int sumOfDivisors = 0;

            for (int divisor = 1; divisor < start ; divisor++  ) {

                if (start % divisor == 0) {
                    sumOfDivisors += divisor;
                }
            }

            if (sumOfDivisors == start) {
                perfectNumberCount++;
                perfectNumbersList += start + " ";
            }
        }

        System.out.println("Les nombres parfaits sont les suivants : ");
        System.out.print(perfectNumbersList);
        System.out.println();
        System.out.println("Le nombre total de nombre parfait est de " + perfectNumberCount);
    }
}
