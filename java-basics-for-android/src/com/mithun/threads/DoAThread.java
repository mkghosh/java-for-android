package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class DoAThread extends Thread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
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
