package chapter04.function.exercice.project.refactor;

public class FunctionRefactorBasicStopWatch {

    public static void main(String[] args) throws InterruptedException {

        int second = 0;
        int min = 0;
        int hour = 0;

        while (true) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);

            if (second == 60) {
                min++;
                second = 0;
            }
            if (min == 60) {
                hour++;
                min = 0;
            }

            System.out.println(displayTime(hour) + ":" + displayTime(min) + ":" + displayTime(second));

            second++;
        }
    }

    /**
     * Formats a time value by adding a leading zero if it is less than 10.
     * @param time the time value (hours, minutes, or seconds)
     * @return a string representing the time value with two digits
     */
    public static String displayTime(int time) {
        return time < 10 ? "0" + time : "" + time;
    }
}





