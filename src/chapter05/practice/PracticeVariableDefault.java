package chapter05.practice;

public class PracticeVariableDefault {

    int integer;
    double comma;
    boolean trueOrFalse;
    char caracter;

    String textValue;

    public static void main(String[] args) {

        PracticeVariableDefault testDefaultValueObject = new PracticeVariableDefault();

        System.out.println("Entier : " + testDefaultValueObject.integer);
        System.out.println("Virgule : " + testDefaultValueObject.comma);
        System.out.println("Booléen : " + testDefaultValueObject.trueOrFalse);
        System.out.println("Char : " + testDefaultValueObject.caracter);
        System.out.println("String : " + testDefaultValueObject.textValue);

//        testDefaultValueObject.textValue.toLowerCase();

        testDefaultValueObject.textValue = "TEST";
        System.out.println(testDefaultValueObject.textValue);

    }
}
