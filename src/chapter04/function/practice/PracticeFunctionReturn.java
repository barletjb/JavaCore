package chapter04.function.practice;

public class PracticeFunctionReturn {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 30;

        int result = sumOfNumber(number1,number2);
        System.out.println( "Resultat de " + number1 + " + " + number2 + " = " + result);
        int result2 =  sumOfNumber(15,12);
        System.out.println(result2);

        System.out.println(sumOfNumber(100, 100));
    }

    public static int sumOfNumber(int number1, int number2){

        return number1 + number2;
    }
}
