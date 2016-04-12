package com.mithun.arrays;

/**
 * <h1>This class will process the given number of students mark.</h1>
 * Created by Mithun Kumer Ghose on 4/12/2016.
 */
public class MarkProcessor {

    public double getAverageMark(String markString){

        int[] marks = getIntArray(markString);
        return (double) sum(marks) / marks.length;
    }

    public int sum(int[] intArray) {

        int total = 0;

        for(int i : intArray)
            total += i;

        return total;
    }

    public int[] getIntArray(String markString) {

        String[] marks = markString.split(" ");

        int [] marksInInteger = new int[marks.length];

        for(int i =0; i < marks.length; i++) {
            marksInInteger[i] = Integer.parseInt(marks[i]);
        }

        return marksInInteger;
    }

    public void printMarksLowerThanAverage(String markString) {

        int[] intMarkArray = getIntArray(markString);

        double average = getAverageMark(markString);
        
    }
}
