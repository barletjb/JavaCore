package chapter05.practice;

public class PracticeVariableReference {

    public static void main(String[] args) {

        /**
         * Exemple avec variables primitives
         */

        int age1 = 28;
        int age2 = age1;

        System.out.println("Première valeur de age1 : " + age1);
        System.out.println("Première valeur de age2 : " + age2);

        age2 = 35;
        System.out.println("Deuxième valeur de age1 : " + age1);
        System.out.println("Deuxième valeur de age2 : " + age2);

        displayAge(age2);

        System.out.println("Troisième valeur de age2 : " + age2 );

        /**
         * Exemple avec variables références
         */

        PracticeObjectCar car1 = new PracticeObjectCar("AHGEJHAG", "RENAULT",
                "CLIO", "Blanche", 5000);

        PracticeObjectCar car2 = car1;

        System.out.println("Première valeur de car1 : " + car1);
        System.out.println("Première valeur de car2 : " + car2);

        System.out.println("Première valeur (N° de série) de car1 : " + car1.serialNumber);
        System.out.println("Première valeur (N° de série) de car2 : " + car2.serialNumber);

        car2.serialNumber = "AAAAAA";

        System.out.println("Seconde valeur (N° de série) de car1 : " + car1.serialNumber);
        System.out.println("Seconde valeur (N° de série) de car2 : " + car2.serialNumber);

        displayCar(car2);

        System.out.println("Troisième valeur (N° de série) de car1 : " + car1.serialNumber);
        System.out.println("Troisième valeur (N° de série) de car2 : " + car2.serialNumber);

       car1 = new PracticeObjectCar("BBBBBBBB", "RENAULT",
                "CLIO", "Blanche", 5000);
       car2 = new PracticeObjectCar("ZZZZZZ", "RENAULT",
                "CLIO", "Blanche", 5000);

        System.out.println("Quatrième valeur (N° de série) de car1 : " + car1);
        System.out.println("Quatrième valeur (N° de série) de car1 : " + car2);

        car1.serialNumber = "TEST";

        System.out.println("Cinquième valeur (N° de série) de car1 : " + car1.serialNumber);
        System.out.println("Cinquième valeur (N° de série) de car1 : " + car2.serialNumber);
    }

    public static void displayAge(int age) {

        age = 40;

        System.out.println(" Age : " + age);
    }

    public static void displayCar (PracticeObjectCar car) {

        car.serialNumber = "12345";
        System.out.println("Valeur (fonction) du N° de Série : " + car.serialNumber);
        System.out.println("Référence (fonction) de la voiture  : " + car);
    }
}

