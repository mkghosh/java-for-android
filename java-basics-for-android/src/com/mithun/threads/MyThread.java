package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class MyThread extends Thread {

    public MyThread() {}

    public MyThread(String threadName) {
        this.setName(threadName);
    }
    @Override
    public void run() {
        System.out.println(this.getName() + " is running... ");
    }
}
