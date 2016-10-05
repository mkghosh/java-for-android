package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class SleepThread extends Thread {

    public SleepThread() {}

    public SleepThread(String name) {
        setName(name);
        setDaemon(true);
        start();
    }
}
