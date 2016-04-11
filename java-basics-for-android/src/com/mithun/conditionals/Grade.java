package com.mithun.conditionals;

/**
 * <h1>This Class is responsible for calculating students grade bye providing the obtained mark.</h1>
 * Created by Mithun Kumer Ghose on 4/10/2016.
 */
public class Grade {

    /**
     * <h1>By using this method we can calculate a single students single subject's grade</h1>
     * @param markObtained {@link Integer} the mark obtained by the student.
     * @return {@link Character} The student's grade in char representation.
     */
    public static char getGrade(int markObtained) {
        char grade = 0;
        if(markObtained >= 90)
            grade = 'A';
        else if(markObtained >= 80 && markObtained < 90)
            grade = 'B';
        else if(markObtained >= 70 && markObtained < 80)
            grade = 'C';
        else if(markObtained >= 60 && markObtained < 70)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }

    public static int getGradePoint(char grade) {
        int gradePoint = 0;
        switch (grade) {
            case 'A':
                gradePoint = 4;
                break;
            case 'B':
                gradePoint = 3;
                break;
            case 'C':
                gradePoint = 2;
                break;
            case 'D':
                gradePoint = 1;
                break;
        }
        return gradePoint;
    }
}
