package com.mithun.conditionals;

/**
 * @author Mithun Kumer Ghose
 */

/**
 * <h1>This class contains some art work created using asterisks only</h1>
 * <p>
 * For size 1 the triangle will be looking like
 * +---+
 * | * |
 * |***|
 * +---+
 * <p>
 * For size 2 the traingle will be looking like
 * +-----+
 * |  *  |
 * | *** |
 * |*****|
 * +-----+
 */
public class PrintStarArt {

    public void printAscendingTriangleStarArt(int size) {

        int column = 2 * size + 3;
        int row = size + 3;

        for (int i = 0; i < row; i++) {

            if (i == 0 || i == row - 1) {
                drawEndingLinesForTriangle(column);
            } else {
                int starNumber = 2 * (i - 1) + 1;
                printStringForTriangle(column, starNumber);
            }

        }
    }

    public void printDescendingTriangleStarArt(int size) {

        int column = 2 * size + 3;
        int row = size + 3;
        int startingStar = column - 2;

        for (int i = 0; i < row; i++) {

            if (i == 0 || i == row - 1) {
                drawEndingLinesForTriangle(column);
            } else {
                printStringForTriangle(column, startingStar);
                startingStar -= 2;
            }

        }
    }

    public void printDiamond(int size) {
        int columnNum, rowNum;
        columnNum = rowNum = 2 * size + 3;


    }

    private void printStringForTriangle(int column, int starNum) {

        int space = (column - (2 + starNum)) / 2;

        System.out.print("|");
        printSpace(space);
        printStar(starNum);
        printSpace(space);
        System.out.println("|");

    }

    private void printStar(int starNum) {

        for (int i = 0; i < starNum; i++) {
            System.out.print("*");
        }

    }

    private void printSpace(int spaces) {

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

    }

    private void drawEndingLinesForTriangle(int column) {

        for (int i = 0; i < column; i++) {
            if (i == 0)
                System.out.print("+");
            else if (i == column - 1)
                System.out.println("+");
            else
                System.out.print("-");
        }

    }
}
