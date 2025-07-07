package chapter03.loop.exercice;

public class ChessboardDrawing {

    public static void main(String[] args) {


        // Solution1:
        int chessboardSize = 5;
        int lign;
//        String character = "# . # . #";
//        String character2 = ". # . # .";
//
//        for (lign = 1; lign <= chessboardSize; lign++){
//
//            if (lign % 2 == 0){
//                System.out.println(character2);
//            }
//            else {
//                System.out.println(character);
//            }
//
//        }

        // Solution2
        int colonne;

        for (lign = 1; lign <= chessboardSize; lign++) {

            for (colonne = 1; colonne <= chessboardSize; colonne++) {
                if ((lign + colonne) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }
}

