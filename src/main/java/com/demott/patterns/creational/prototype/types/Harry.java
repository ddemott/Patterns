package com.demott.patterns.creational.prototype.types;

import com.demott.patterns.creational.prototype.Person;

public class Harry implements Person {
    private final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }

}
