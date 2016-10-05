package com.mithun.collections.arrays;

/**
 * @author Mithun Kumer Ghose
 */

/**
 * <h1>This class will process the given number of students mark.</h1>
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

        for(int mark : intMarkArray) {
            if(mark < average) {
                System.out.println("Mark " + mark + " is lower than average " + average);
            }
        }
        
    }
}
