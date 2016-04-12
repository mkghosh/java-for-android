package com.mithun.random;

/**
 * Created by Mithun Kumer Ghose on 4/12/2016.
 */
public class Random {

    private int max;
    private int last;
    // constructor that takes the max int
    public Random(int max){
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    // Note that the result can not be bigger then 32749
    public int nextInt(){
        last = (last * 32719 + 3) % 32749;
        return last % max;
    }

}
