package com.mithun.collections;

import java.util.ArrayList;

/**
 * @author Mithun Kumer Ghose.
 */
public class ArrayListTest {
    public static void main(String [] args) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i < 101; ++i) {
            values.add(i);
        }

        for(Integer i : values)
            System.out.println(i);
    }
}
