package chapter05.practice;

public class PracticeStaticCar {

    String brand;
    String model;
    double price;

    static int carCounter = 0;

    public PracticeStaticCar(String brand, String model, double price){

        this.brand = brand;
        this.model = model;
        this.price = price;

        carCounter++;

    }


}
