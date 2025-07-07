package chapter04.function.exercice;

public class RecursiveFunction {

    public static void main(String[] args) {

    afficherNombre(1, 10000);

    }
    public static void afficherNombre(int startNumber, int endNumber){
        System.out.println(startNumber);
        if (startNumber == endNumber){
            return;
        }
        startNumber++;
        afficherNombre(startNumber, endNumber);

    }
}
