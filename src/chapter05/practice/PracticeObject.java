package chapter05.practice;

public class PracticeObject {

    public static void main(String[] args) {

        PraticeObjectCar car1 = new PraticeObjectCar();

        car1.brand = "Ferrari";
        car1.model = "F430";
        car1.color = "Rouge";
        car1.price = 250000;
        car1.odometer = 0;
        car1.serialNumber = " EGEGEHRJR";

        car1.run(2000);
        car1.displayInformations();
        System.out.println();

        PraticeObjectCar car2 = new PraticeObjectCar();

        car2.brand = "Renault";
        car2.model = "Clio";
        car2.color = "Blanche";
        car2.price = 2500;
        car2.odometer = 100000;
        car2.serialNumber = " EGEZKRKZRTHJ";

        car2.run(2000);
        car2.displayInformations();

    }
}
