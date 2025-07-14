package chapter04.function.exercice;

public class FunctionOverload {

    public static void main(String[] args) {

        int result = sum(1, 18);
        System.out.println(result);

        int result2 = sum(1, 18, 34);
        System.out.println(result2);


    }

    public static int sum(int number1, int number2){

        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {

        return sum(sum(number1,number2), number3);
    }
}
