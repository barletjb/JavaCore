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

    }

    public boolean startEngine() {

        this.isEngineStarted = true;
        System.out.println("Le moteur s'allume. La voiture démarre");
        return isEngineStarted;
    }

    public boolean stopEngine(){

        this.isEngineStarted = false;
        System.out.println("Le moteur s'éteint. La voiture est à l'arrêt");
        return  isEngineStarted;

    }

    public void startRun(int distance){

        if (distance <= 0) {
            System.out.println("La distance doit être positive.");
            return;
        }

        if (this.isEngineStarted) {
            System.out.println("La voiture parcours " + distance + "kms");
            odometer += distance;
        }
        else {
            System.out.println("Le moteur est à l'arrêt");
        }

    }

    public void displayInformations() {

        System.out.println("N° Série : " + this.serialNumber + " | Marque : " + this.brand
                + " | Modèle : " + this.model + " | Couleur : " + this.color
                + " | Kilométrage : " + this.odometer + " kms");

    }

    public static void main(String[] args) {

        CarImprovement car1 = new CarImprovement("RZGRUZHR", "RENAULT",
                "CLIO 3", "Blanche", 2500);

        car1.startEngine();
        car1.startRun(2000);
        car1.stopEngine();
        car1.displayInformations();

    }
}


