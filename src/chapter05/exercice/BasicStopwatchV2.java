package chapter05.exercice;

public class BasicStopwatchV2 {

    String nameStopWatch;
    int second;
    int min;
    int hour;

    public BasicStopwatchV2(String name) {
        this.nameStopWatch = name;
        this.second = 0;
        this.min = 0;
        this.hour = 0;

    }

    public void launch(double durationInMin) throws InterruptedException {

        System.out.println(this.nameStopWatch + " :");

        for (int i = 0; i < durationInMin * 60; i++) {
            displayTime();
            Thread.sleep(1000);
            second++;

            if (second == 60) {
                second = 0;
                min++;
            }
            if (min == 60) {
                min = 0;
                hour++;
            }
        }
    }

    public void displayTime() {
        String displaySecond = second < 10 ? "0" + second : "" + second;
        String displayMin = min < 10 ? "0" + min : "" + min;
        String displayHours = hour < 10 ? "0" + hour : "" + hour;
        System.out.println(displayHours + ":" + displayMin + ":" + displaySecond);
    }

    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 stopwatchV2 = new BasicStopwatchV2("Oeufs durs");
        stopwatchV2.launch(1);


    }

}





