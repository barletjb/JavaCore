package chapter05.exercice;

public class BasicStopwatchV2 {

    private int second;
    private int min;
    private int hour;

    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 stopwatch = new BasicStopwatchV2();
        stopwatch.launch();

    }
    public void launch() throws InterruptedException{
        displayTime();

        if (second ==60){
            return;
        }

        Thread.sleep(1000);

        if (second == 60) {
            min++;
            second = 0;
        }
        if (min == 60){
            hour++;
            min = 0;
        }
        second++;
        launch();
    }

    public void displayTime(){
        String displaySecond = second < 10  ? "0" + second  : "" + second;
        String displayMin = min < 10  ? "0" + min  : "" + min;
        String displayHours = hour < 10  ? "0" + hour  : "" + hour;
        System.out.println(displayHours + ":" + displayMin + ":" + displaySecond);
    }

}





