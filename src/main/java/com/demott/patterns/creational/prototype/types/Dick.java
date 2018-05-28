package com.demott.patterns.creational.prototype.types;

import com.demott.patterns.creational.prototype.Person;

public class Dick implements Person {
    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
