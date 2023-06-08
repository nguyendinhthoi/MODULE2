package ss4_oop_java.exercise.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        System.out.println(java.time.LocalTime.now());
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
