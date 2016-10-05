package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class DoAThread extends Thread {

    public static void main(String[] args) {
        Thread thread = new SleepThread("My Sleeper demo");
        try {
            Thread.sleep(100);
            System.out.println(thread.getName());
            System.out.println(thread.isAlive());
            System.out.println(thread.isDaemon());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 2000; i++) {
            System.out.println("main(): " + i);
        }
    }

//    public static void main(String[] args) {
//        MyRunnable mr = new MyRunnable();
//        Thread t = new Thread(mr);
//        t.start();
//        for(int i = 0; i < 2000; i++) {
//            System.out.println("main(): " + i);
//        }
//    }

}
