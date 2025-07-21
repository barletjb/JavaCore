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

            System.out.println(displayTime(hour, min, second));

            second++;
        }
    }

    /**
     * Returns a formatted time string in the format HH:MM:SS.
     * Each component (hour, minute, second) is padded with a leading zero if it is less than 10.
     *
     * @param hour   the hour component of the time (0–23)
     * @param min    the minute component of the time (0–59)
     * @param second the second component of the time (0–59)
     * @return a string representing the time in "HH:MM:SS" format
     */
    public static String displayTime(int hour, int min, int second) {
        return (hour < 10 ? "0" + hour : "" + hour) + ":" + (min < 10 ? "0" + min : "" + min) + ":" + (second < 10 ? "0" + second : "" + second);
    }
}





