package chapter01.variable.exercice;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args) {

        // °C = (TempératureEnFahrenheit − 32) / 1,8

        float tempF= 85.6F;
        float tempConvert = (tempF - 32) / 1.8F;
        System.out.println(tempConvert);

        System.out.println("La température de " + tempF + " °F est de " + tempConvert + " °C.");






    }
}
