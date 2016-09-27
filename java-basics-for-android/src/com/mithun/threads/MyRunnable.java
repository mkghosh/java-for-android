package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 2000; i++) {
            System.out.println("run():  " + i);
        }
    }
}
