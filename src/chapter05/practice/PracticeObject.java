package chapter05.practice;

public class PracticeObject {

    public static void main(String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar("EGEGEHRJR","Ferrari",
                "F430","Rouge",250000);


        car1.run(2000);
        car1.displayInformations();
        System.out.println();

        PracticeObjectCar car2 = new PracticeObjectCar("RZGRUZHR","RENAULT",
                "CLIO 3","Blanche",2500);

        car2.run(4559);
        car2.displayInformations();

    }
}
