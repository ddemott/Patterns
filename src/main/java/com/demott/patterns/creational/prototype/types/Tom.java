package com.demott.patterns.creational.prototype.types;

import com.demott.patterns.creational.prototype.Person;

public class Tom implements Person {

    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }

}
