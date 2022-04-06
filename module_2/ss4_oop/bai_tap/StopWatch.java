package ss4_class_object.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }


    public void start() {
        startTime = System.currentTimeMillis();

    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }

}
