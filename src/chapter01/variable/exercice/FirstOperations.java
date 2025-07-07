package chapter01.variable.exercice;

public class FirstOperations {

    public static void main (String[] args) {


        // N°1 : Opérations Arithmétiques de base

        int a = 4;
        int b = 2;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        System.out.println("La somme de a et b = " + sum);
        System.out.println("La soustraction de a et b = " + sub);
        System.out.println("La multiplication de a et b = " + mult);
        System.out.println("La division de a et b = " + div);

        // N°2 : Opérateurs Combinés avec Assignation

        int c = 8;
        int d = 5;

        // c = c + d
        c += d;
        System.out.println(c);

        // d = d - 5
        d -= 5 ;
        System.out.println(d);

        // c = c x 3
        c *= 3;
        System.out.println(c);

        // d = d / 3
        d /= 3;
        System.out.println(d);

        // N°3 : Priorité des Opérateurs

        int e = 1 * 5 + 2;
        // 7
        System.out.println(e);

        int f = 1 * (5 + 2);
        // 7
        System.out.println(f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        // 8
        System.out.println(g);
















    }
}
