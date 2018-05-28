package com.demott.patterns.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void singleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertEquals(Boolean.TRUE, instance1.equals(instance2));
    }

}
