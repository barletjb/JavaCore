package chapter03.loop.exercice;

public class FullPyramid {

    public static void main(String[] args) {

        int numberOfRows = 10;
        int lign = 1;

        for (lign = 1; lign <= numberOfRows; lign++) {

            int empty = numberOfRows - lign;
            int stars = 2 * lign - 1;

            while (empty != 0) {
                System.out.print(" ");
                empty--;
            }
            while (stars != 0) {
                System.out.print('*');
                stars--;
            }

            System.out.println();
        }
    }
}
