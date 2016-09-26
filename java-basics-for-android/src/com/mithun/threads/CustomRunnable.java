package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class CustomRunnable implements Runnable {

    public CustomRunnable() {}

    @Override
    public void run() {
        System.out.println("Runnable thread is Running.");
    }
}
