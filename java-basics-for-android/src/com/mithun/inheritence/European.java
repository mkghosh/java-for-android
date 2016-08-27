package com.mithun.inheritence;

/**
 * @author Mithun Kumer Ghose.
 */
public class European extends Person {

    /**
     * Default constructor for European
     */
    public European () {
        ethnicity = "European";
    }

    /**
     * Custom constructor for European
     * @param name {@link String}
     * @param religion {@link String}
     * @param age {@link Integer}
     */
    public European(String name, String religion, int age) {
        this();
        this.name = name;
        this.religion = religion;
        this.age = age;
    }

}
