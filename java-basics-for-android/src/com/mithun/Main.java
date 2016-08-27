package com.mithun;

import com.mithun.abstraction.AbstractClient;
import com.mithun.abstraction.AbstractionHelper;
import com.mithun.arrays.MarkProcessor;
import com.mithun.conditionals.PrintStarArt;

import java.util.Scanner;

/**
 * @author Mithun Kumer Ghose
 */

public class Main {
    public static void main(String[] args) {
//        PrintStarArt starArt = new PrintStarArt();
//        starArt.printAscendingTriangleStarArt(5);
//        starArt.printDescendingTriangleStarArt(5);

        //Starting of Abstraction.
        AbstractClient abstractClient = new AbstractClient();
        abstractClient.execute();
        //End of Abstraction.

        //Polymorphism start
        AbstractionHelper client = new AbstractClient();
        client.execute();
        //Polymorphism end.
    }
}