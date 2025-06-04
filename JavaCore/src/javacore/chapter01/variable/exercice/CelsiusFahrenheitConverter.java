package javacore.chapter01.variable.exercice;

public class CelsiusFahrenheitConverter {

    public static void main(String[] args) {

        // °F = (TempératureEnCelsius × 1,8) + 32

        float tempC = 28.7F;
        float tempConvert = (tempC * 1.8F) + 32 ;
        System.out.println(tempConvert);

        System.out.println("La température de " + tempC + " °C est de " + tempConvert + " °F.");



    }
}
