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
            this.second++;

            if (this.second == 60) {
                this.second = 0;
                this.min++;
            }
            if (this.min == 60) {
                this.min = 0;
                this.hour++;
            }
        }
    }

    public void displayTime() {
        String displaySecond = this.second < 10 ? "0" + this.second : "" + this.second;
        String displayMin = this.min < 10 ? "0" + this.min : "" + this.min;
        String displayHours = this.hour < 10 ? "0" + this.hour : "" + this.hour;
        System.out.println(displayHours + ":" + displayMin + ":" + displaySecond);
    }

    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 stopwatchV2 = new BasicStopwatchV2("Oeufs durs");
        stopwatchV2.launch(1);


    }

}





