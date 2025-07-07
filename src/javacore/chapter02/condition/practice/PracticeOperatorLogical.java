package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {
        boolean trueAndTrue = true && true;     // true
        boolean trueAndFalse = true && false;   // false
        boolean falseAndTrue = false && true;   // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue = true || true;     // true
        boolean trueOrFalse = true || false;    // true
        boolean falseOrTrue = false || true;    // true
        boolean falseOrFalse = false || false;  // false

        boolean notTrue = !true;   // false
        boolean notFalse = !false; // true

        boolean trueAndTrueAndTrue = true && true && true;   // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean tureOrTrueOrTrue = true || true || true;     // true
        boolean tureOrTrueOrFalse = true || true || false;   // true

        boolean notNotTrue = !!true;   //true
        boolean notNotFalse = !!false; //false

    }
}
