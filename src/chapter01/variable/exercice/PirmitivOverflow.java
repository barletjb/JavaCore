package chapter01.variable.exercice;

public class PirmitivOverflow {

    public static void main (String[] args) {

        short hourseconds = 60 * 60;
        int dayseconds = hourseconds * 24;
        System.out.println(dayseconds);

        int weekSeconds = dayseconds * 7;
        System.out.println(weekSeconds);

        int monthSeconds = dayseconds * 30;
        System.out.println(monthSeconds);

        int yearSeconds = dayseconds * 365;
        System.out.println(yearSeconds);




    }
}
