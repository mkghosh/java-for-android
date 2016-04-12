package com.mithun.arrays;

/**
 * <h1>This class will process the given number of students mark.</h1>
 * Created by Mithun Kumer Ghose on 4/12/2016.
 */
public class MarkProcessor {

    public double getAverageMark(String markString){
        String[] marks = markString.split(" ");
        int [] marksInInteger = new int[marks.length];
        int total = 0;
        for(int i =0; i < marks.length; i++) {
            marksInInteger[i] = Integer.parseInt(marks[i]);
            total += marksInInteger[i];
        }
        return (double)total/marks.length;
    }

}
