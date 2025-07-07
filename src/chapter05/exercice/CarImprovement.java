package chapter05.exercice;

public class CarImprovement {

    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;

    boolean isEngineStarted;

    public CarImprovement(String serialNumber, String brand, String model, String color, double price) {

        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;
        this.isEngineStarted = false;

        this.displayInformations();
    }

    public void run(double distance) {

        if (distance <= 0) {
            System.out.println("La distance doit être positive.");
            return;
        }

        this.isEngineStarted = true;
        System.out.println("La voiture démarre, elle s'apprête à rouler sur " + distance + " kms.");

        this.isEngineStarted = false;
        odometer += distance;

        System.out.println("La voiture s'arrête, elle vient d'effectuer " + distance + " kms.");
    }

    public void displayInformations() {

        System.out.println("N° Série : " + this.serialNumber + " | Marque : " + this.brand
                + " | Modèle : " + this.model + " | Couleur : " + this.color
                + " | Kilométrage : " + this.odometer);

    }

    public static void main(String[] args) {

        CarImprovement car1 = new CarImprovement("RZGRUZHR", "RENAULT",
                "CLIO 3", "Blanche", 2500);

        car1.run(2000);
        car1.displayInformations();
        System.out.println(car1.isEngineStarted);
    }
}


