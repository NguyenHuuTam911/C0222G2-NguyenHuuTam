package ss4_class_object.bai_tap;

public class MainStopWatch {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
         stopWatch.getStartTime();
        for(int i = 0;i<100000;i++){
            System.out.println(i);
        }
         stopWatch.getEndTime();
        System.out.println("Thời gian chạy 100,000 số là: " +stopWatch.getElapsedTime());
    }

}
