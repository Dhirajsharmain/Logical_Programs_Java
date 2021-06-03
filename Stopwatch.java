package bridgelabz;

public class Stopwatch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        printHello();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        elapsedTime(startTime, endTime);
    }

    private static void elapsedTime(long startTime, long endTime) {
        long temp = endTime - startTime;
        System.out.println("Elapsed Time is : " + temp);
    }

    private static void printHello() {
        for (int i = 0; i < 100; i++) {
            System.out.println("StopWatch");
        }
    }

}
