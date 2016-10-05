package com.mithun.inheritence.hierarchical_inheritnce_demo;

/**
 * @author Mithun Kumer Ghose
 */
public class Person {

    //These variables should only be used and be accessible from the child class.
    protected String name;
    protected String ethnicity;
    protected String religion;
    protected int age;

    @Override
    public String toString() {
        return "Name : " + name +
                "\nEthnicity : " + ethnicity +
                "\nReligion : " + religion +
                "\nAge : " + age;
    }
}
