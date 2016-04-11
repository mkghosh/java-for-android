package com.mithun;

import com.mithun.conditionals.Grade;

public class Main {
    public static void main(String[] args) {
        char studentGrade = Grade.getGrade(74);
        int studentGradePoint = Grade.getGradePoint(studentGrade);
        System.out.println("The grade of the student is : " + studentGrade);
        System.out.println("The grade point of the student is : " + studentGradePoint);
    }
}