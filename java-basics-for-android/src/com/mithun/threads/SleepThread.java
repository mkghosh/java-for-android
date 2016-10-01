package com.mithun.threads;

/**
 * Created by Mithun Kumer Ghose on 10/1/2016.
 */
public class SleepThread extends Thread {

    public SleepThread() {}

    public SleepThread(String name) {
        setName(name);
        setDaemon(true);
        start();
    }
}
