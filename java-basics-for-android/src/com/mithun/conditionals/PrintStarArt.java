package com.mithun.conditionals;

/**
 * <h1>This class contains some art work created using asterisks only</h1>
 * Created by Mithun Kumer Ghose on 4/10/2016.
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
                drawEndingLines(column);
            } else {
                int starNumber = 2 * (i - 1) + 1;
                printString(column, starNumber);
            }

        }
    }
    public void printDescendingTriangleStarArt(int size) {

        int column = 2 * size + 3;
        int row = size + 3;
        int startingStar = column -2;

        for (int i = 0; i < row; i++) {

            if (i == 0 || i == row - 1) {
                drawEndingLines(column);
            } else {
                printString(column, startingStar);
                startingStar -= 2;
            }

        }
    }

    private void printString(int column, int starNum) {

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

    private void drawEndingLines(int column) {

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
