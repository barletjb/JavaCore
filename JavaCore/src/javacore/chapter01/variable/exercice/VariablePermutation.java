package javacore.chapter01.variable.exercice;

public class VariablePermutation {

    public static void main (String[] args) {

        int a = 4;
        int b = 2;
        int temporaire = a;
        a = b;
        b = temporaire;

        System.out.println(a);
        System.out.println(b);




    }
}
