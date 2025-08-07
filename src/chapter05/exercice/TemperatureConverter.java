package chapter05.exercice;

public class TemperatureConverter {

    public static final double KELVIN = 273.15;
    public static String celsiusUnit = "C°";
    public static String fahrenheitUnit = "F";
    public static String kevinUnit = "K";

    public static double celsiusToFahrenheit(double celsiusTemperature) {

        return (celsiusTemperature * 1.8F) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8F;
    }

    public static double celsiusToKelvin (double celsiusTemperature){
        return celsiusTemperature + KELVIN;
    }

    public static double kelvinToCelsius (double kelvinTemperature){
        return kelvinTemperature - KELVIN;
    }

    public static double fahrenheitToKelvin(double fahrenheitTemperature) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheitTemperature));
    }

    public static double kelvinToFahrenheit(double kelvinTemperature) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvinTemperature));
    }


    public static void main(String[] args) {

        double tempC = 25;
        double tempF = 77;
        double tempK = 298.15;

        // Question 6 : Dans le cas d'un convertisseur de température comme ce que vous avez implémenté,
        // pourquoi l'usage de méthodes statiques est-elle préférable à la création d'une classe avec des attributs
        // et méthodes d'instances, qui devra être instanciée pour être utilisée ?

        // il n’est pas nécessaire de créer une instance de la classe à chaque fois qu’on souhaite effectuer une conversion.
        // Utiliser une méthode static permet de simplifier l’utilisation du convertisseur (pas besoin d’instancier un objet)
        // et améliore aussi les performances. Ne depend pas d'instance donc plus maintenable également.

        System.out.println("C° → F : " + celsiusToFahrenheit(tempC));
        System.out.println("F → C° : " + fahrenheitToCelsius(tempF));
        System.out.println("C° → K : " + celsiusToKelvin(tempC));
        System.out.println("K → C° : " + kelvinToCelsius(tempK));
        System.out.println("F → K : " + fahrenheitToKelvin(tempF));
        System.out.println("K → F : " + kelvinToFahrenheit(tempK));
    }
}
