package chapter05.practice;

public class PracticeStatic {

    public static void main(String[] args) {


        PracticeStaticCar car1 = new PracticeStaticCar("Ferrari", "F430", 260000);
        PracticeStaticCar car2 = new PracticeStaticCar("Porsche", "911", 150000);

        System.out.println("Nombre de voiture crées : " + PracticeStaticCar.carCounter);

        System.out.println("Résultat de 1 + 2 : " + PracticeStaticCalculator.sum(1, 2));
        System.out.println("Résultat de 42 - 30 : " + PracticeStaticCalculator.subtract(42, 30));


    }


}
