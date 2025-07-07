package chapter03.loop.exercice;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

        int second = 0;
        int min= 0;
        int hour = 0;

        while(true) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);


            if (second == 60) {
                min++;
                second = 0;
            }
            if (min == 60){
                hour++;
                min = 0;
            }

            String displaySecond = second < 10  ? "0" + second  : "" + second;
            String displayMin = min < 10  ? "0" + min  : "" + min;
            String displayHours = hour < 10  ? "0" + hour  : "" + hour;
            System.out.println(displayHours + ":" + displayMin + ":" + displaySecond);

            //System.out.println(String.format("%02d:%02d:%02d", hour, min, second));
            second++;
        }

    }

}
