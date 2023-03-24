package org.example;

public class Counting {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable countingToTenThousand = () -> {
            for(int x = 0; x < 10000; ++x) {
                counter.increment();
            }
        };
        Thread countingThread1 = new Thread(countingToTenThousand);
        Thread countingThread2 = new Thread(countingToTenThousand);
        countingThread1.start();
        countingThread2.start();
        countingThread1.join();
        countingThread2.join();
        System.out.println("Final counting " + counter.getCount());
    }
}