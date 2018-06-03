package com.demott.patterns.behavioral.nullobject.factory;

import com.demott.patterns.behavioral.nullobject.entity.AbstractCustomer;
import com.demott.patterns.behavioral.nullobject.entity.NullCustomer;
import com.demott.patterns.behavioral.nullobject.entity.RealCustomer;

public class CustomerFactory {

    public static final String[] names = { "Rob", "Joe", "Julie" };

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
