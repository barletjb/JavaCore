package chapter03.loop.exercice;

public class SmallestDivisorFinder {

    public static void main(String[] args) {

        // Nombre premier à tester : 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        // 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // Nombre à tester : 15, 28, 45, 66, 90
        int number = 85;

        int divisor = 2;

        // Find smallestDivisor
        while (number % divisor !=0) {
            divisor++;
        }

        if (divisor == number) {
            System.err.println("Le nombre " + number + " est un nombre premier");
        }
        else {
            System.out.println("Le plus petit diviseur du nombre " + number + " est le " + divisor);
    }

    }
}
