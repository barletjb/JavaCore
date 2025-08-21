package chapter05.exercice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberSearcherV4 {

    public static void main(String[] args) {

        /**
         * Crible d’Ératosthène.
         * Obj : Trouver tous les nombres premiers jusqu’à une limite N.
         * -----------------------------------------------
         *
         * Étape 1 : Préparer la liste des nombres
         * On imagine une liste de nombres de 2 jusqu’à N (car 0 et 1 ne sont pas premiers).
         * -----------------------------------------------
         *
         * Étape 2 : Initialiser une structure de marquage
         * Chaque nombre peut être :
         *      "non barré" → candidat premier
         *      "barré"     → éliminé car multiple d’un autre
         * Au début, tous sont "non barrés".
         * -----------------------------------------------
         *
         * Étape 3 : Parcourir la liste
         * Pour chaque nombre p de 2 à racine(N) :
         * Si p est "non barré" :
         *       -> p est premier
         *       -> barrer tous ses multiples
         * -----------------------------------------------
         *
         * Étape 4 : Collecter le résultat
         * Une fois la boucle terminée,
         *   les nombres qui restent "non barrés" sont exactement les nombres premiers ≤ N.
         * -----------------------------------------------
         *
         * Exemple rapide (N = 30) :
         * - Garde 2 → barre 4, 6, 8, …, 30
         * - Passe à 3 (non barré) → barre 9, 12, 15, …, 30
         * - Passe à 4 (barré) → ignorer
         * - Passe à 5 (non barré) → barre 25, 30
         * - Stop (car 7*7 = 49 > 30)
         * - Restent non barrés : tous les nombres premiers ≤ 30
         *
         * ---------------------------------------------------------
         */

        /**
         * Pseudo-code du crible d'Ératosthène
         * -----------------------------------
         *
         * ENTREE : un entier N
         * RETURN : la liste des nombres premiers ≤ N
         *
         * ALGORITHME :
         *
         * Créer un tableau de bool marqué[2..N] initialisé à "non barré"
         *
         *
         * POUR p allant de 2 à racine(N) :
         *    SI marqué[p] est "non barré" ALORS :
         *       POUR multiple allant de p*p à N, avec pas = p :
         *           marqué[multiple] = "barré"
         *
         * FIN POUR
         *
         * Résultat = tous les indices i de [2..N] tels que marqué[i] est "non barré"
         */

        int limite = 10000;
        List<Integer> primeNumber = sieve(limite);
        System.out.println("Nombres premiers jusquà : " + limite + " : " + primeNumber);

    }

    public static List<Integer> sieve(int n) {
        boolean[] isPotentialPrimeNumber = new boolean[n + 1];

        for (int i = 2; i < isPotentialPrimeNumber.length; i++) {
            isPotentialPrimeNumber[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPotentialPrimeNumber[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPotentialPrimeNumber[multiple] = false;
                }
            }
        }

        List<Integer> isPrimeNumber = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPotentialPrimeNumber[i]) {
                isPrimeNumber.add(i);
            }
        }

        return isPrimeNumber;

    }

}
