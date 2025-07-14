package chapter04.function.exercice;

public class RecursiveFunction {

    public static final int END_NUMBER = 1000;

    public static void main(String[] args) {

    afficherNombre(1, END_NUMBER);

    }
    public static void afficherNombre(int currentNumber, final int END_NUMBER){
        System.out.println(currentNumber);
        if (currentNumber == END_NUMBER){
            return;
        }

        afficherNombre(++currentNumber, END_NUMBER);

    }
}
