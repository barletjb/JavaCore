package chapter05.exercice;

public class LoopAndArrayOptimization {


    public static void main(String[] args) {

        System.out.println("---------- BEFORE ---------");
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] * 2;
        }

        for (int j = 0; j < numbers.length; j += 1) {
            results[j] += 3;
        }

        for (int k = 0; k < results.length; k = k + 1) {
            System.out.println(results[k]);
        }
        System.out.println();

        System.out.println("---------- REFACTOR ---------");

        for (int i = 0; i < numbers.length; i++) {
            results[i] = (numbers[i] * 2) + 3;
            System.out.println(results[i]);
        }

    }
}
