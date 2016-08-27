package com.mithun;

import com.mithun.abstraction.AbstractClient;
import com.mithun.abstraction.AbstractionHelper;
import com.mithun.inheritence.Asian;
import com.mithun.inheritence.European;

/**
 * @author Mithun Kumer Ghose
 */

public class Main {
    public static void main(String[] args) {
//        PrintStarArt starArt = new PrintStarArt();
//        starArt.printAscendingTriangleStarArt(5);
//        starArt.printDescendingTriangleStarArt(5);

        //Example of Inheritance
        Asian asian = new Asian("Mithun Kumer Ghose", "Hinduism", 26);
        European european = new European("Michel Phelps", "Christian", 30);

        System.out.println(asian.toString());
        System.out.println(european.toString());
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