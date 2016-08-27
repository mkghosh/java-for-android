package com.mithun.inheritence;

/**
 * @author Mithun Kumer Ghose
 */
public class Asian extends Person {

    /**
     * Default Constructor for Asian people.
     */
    public Asian() {
        ethnicity = "Asian";
    }

    /**
     * Custom constructor for Asian
     * @param name {@link String}
     * @param religion {@link String}
     * @param age {@link Integer}
     */
    public Asian(String name, String religion, int age) {
        this();
        this.name = name;
        this.religion = religion;
        this.age = age;
    }


}
