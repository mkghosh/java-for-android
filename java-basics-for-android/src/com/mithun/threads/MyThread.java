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
        for(int i = 0; i < 2000; i++) {
            System.out.println("run():  " + i);
            if(i%2 == 0)
                try {
                    Thread.sleep(500L);
                    System.out.println("The value of iterator is : " + i + " " + getName() + " is sleeping.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

}
