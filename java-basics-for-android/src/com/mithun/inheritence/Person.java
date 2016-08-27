package com.mithun.inheritence;

/**
 * @author Mithun Kumer Ghose
 */
public class Person {
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
