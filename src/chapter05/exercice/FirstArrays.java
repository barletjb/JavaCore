package chapter05.exercice;

public class FirstArrays {


    /**
     * Displays the values of the array, separated by ",".
     * The last value ends with a "."
     *
     * @param array the integer array to display
     */
    public static void display(int[] array) {
        System.out.print("Valeurs du tableau : ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < (array.length - 1)) {
                System.out.print(",");
            } else {
                System.out.print(".");
            }
        }
    }

    /**
     * Multiplies each element in the array by 3.
     *
     * @param array the integer array to modify
     * @return the modified array
     */
    public static int[] multiplyArrayByThree(int[] array) {
        for (int index = 0; index < array.length; index++){
            array[index] *= 3;
        }
        return array;
    }

    /**
     * Displays only the even values from the array.
     *
     * @param array the integer array to search
     */
    public static void displayEvenValues(int[] array){

        System.out.print("Valeur du tableau trié par chiffre pair : ");

        for (int index = 0; index < array.length; index++){

            if (array[index] % 2 == 0 ){
                System.out.print(array[index]);
                if (index < (array.length - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print(".");
                }
            }
        }
    }

    /**
     * Sets to 0 the elements that directly precede a value divisible by 3.
     * Skips the first index since it has no preceding element.
     *
     * @param array the integer array to modify
     */
    public static void resetValueBeforeDiv3(int[] array){
        for (int index = 1; index < array.length; index++) {
            if (array[index] % 3 == 0) {
                array[index - 1] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int[] integerArray = new int[10];
        integerArray[0] = 1;

        for (int index = 1; index < integerArray.length; index++) {
            integerArray[index] = integerArray[index - 1] + 1;
        }

        display(integerArray);
        System.out.println();

        System.out.println("-------- Array multiplié par 3 --------");
        multiplyArrayByThree(integerArray);
        display(integerArray);
        System.out.println();

        System.out.println("-------- Array trié par nombre pair --------");
        displayEvenValues(integerArray);
        System.out.println();

        System.out.println("-------- Array divisé par 3 --------");
        resetValueBeforeDiv3(integerArray);
        display(integerArray);

    }
}
