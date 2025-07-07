package javacore.chapter04.function.practice;

public class PracticeFunction {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int test = 0;
        // test2 // Defined in the test() scope (function)

        test();

        if (true){
            System.out.println("Affichage du if true");
            //int test = 0 // Already defined int the scope "main"
        }

    }


    public static void test() {

        System.out.println("Affichage de la fonction test");
        int test = 0;
        int test2 = 1;

    }

}

