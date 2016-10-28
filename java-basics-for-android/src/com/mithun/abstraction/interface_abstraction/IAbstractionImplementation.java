package com.mithun.abstraction.interface_abstraction;

/**
 * @author Mithun Kumer Ghose.
 */
public class IAbstractionImplementation implements AbstractionInterface {
    @Override
    public void printName(String name) {
        System.out.println("The provided name is : " + name);
    }
}
