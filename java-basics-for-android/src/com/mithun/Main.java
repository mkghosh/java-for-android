package com.mithun;

import com.mithun.arrays.MarkProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide students mark separated by space.");
        String givenMarks = scanner.nextLine();
        MarkProcessor markProcessor = new MarkProcessor();
        double average = markProcessor.getAverageMark(givenMarks);
        System.out.println("The average mark of students is : " + average);
    }
}