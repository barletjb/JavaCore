package chapter05.practice;

public class PraticeObjectCar {

    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;


    public double run(double distance) {
        System.out.println("La voiture roule pendant " + distance +"kms.");
        odometer += distance;
        return  distance;
    }

    public void displayInformations(){

        System.out.println("N° Série : " + serialNumber + " | Marque : " + brand + " | Modèle : " + model + " | Couleur : " + color
                + " | Kilométrage : " + odometer );

    }
}
