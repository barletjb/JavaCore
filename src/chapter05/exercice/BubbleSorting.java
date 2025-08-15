package chapter05.exercice;

import java.util.Arrays;

public class BubbleSorting {

    //Question 1 :
    public static void trier(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++){

            for (int j = 0; j < numbers.length - 1 - i; j++){

                if (numbers[j] > numbers[j+1]){

                    int tampon = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tampon;

                }
            }
        }
    }

    //Solution tri Rapide
    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;

        int pivotIndex = partition(a, left, right); // place le pivot
        quickSort(a, left, pivotIndex - 1);         // trie la partie < pivot
        quickSort(a, pivotIndex + 1, right);        // trie la partie >= pivot
    }


    // Retourne l'index final du pivot après réorganisation, pivot = a[right]
    private static int partition(int[] a, int left, int right) {
        int pivotValue = a[right];   // valeur de pivot = dernier élément
        int storeIndex = left;       // prochaine case où ranger un "petit"

        for (int i = left; i < right; i++) { // on lit tout SAUF le pivot
            if (a[i] <= pivotValue) {        // si c'est "petit" (<= pivot)
                swap(a, i, storeIndex);      // on le place à storeIndex
                storeIndex++;                // prochaine case "petite"
            }
        }
        // on pose le pivot juste après les "petits"
        swap(a, storeIndex, right);
        return storeIndex; // position finale du pivot
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    // Solution par insertion
    public static void triInsertion(int tableau[])
    {
        int longueur=tableau.length;

        for(int i=1;i<longueur;i++)
        {
            int memory=tableau[i];
            int compt=i-1;
            boolean marqueur;
            do
            {
                marqueur=false;
                if (tableau[compt]>memory)
                {
                    tableau[compt+1]=tableau[compt];
                    compt--;
                    marqueur=true;
                }
                if (compt<0) marqueur=false;
            }
            while(marqueur);
            tableau[compt+1]=memory;
        }
    }


    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        // QUESTION 1
//        BubbleSorting.trier(numbers);

        //QUESTION 2
       //BubbleSorting.quickSort(numbers);

        //Question 3
        BubbleSorting.triInsertion(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
      }

        //Arrays.sort(numbers);
        

    }
}
