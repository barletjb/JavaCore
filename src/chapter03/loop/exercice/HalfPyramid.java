package chapter03.loop.exercice;

public class HalfPyramid {

    public static void main(String[] args) {

        int numberOfRows = 5;
        int lign;
        char star = '*';
        int numberStars;

        for (lign = 1; lign <= numberOfRows; lign++) {

            for (numberStars = 1; numberStars <= lign; numberStars++){
                System.out.print(star);

            }
            System.out.println();
        }

    }
}
