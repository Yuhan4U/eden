package com.yuhan;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Thread 1
        MyThread t2 = new MyThread(); // Thread 2

        t1.start(); // starts thread 1
        t2.start(); // starts thread 2
    }
}
