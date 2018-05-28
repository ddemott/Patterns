package com.demott.patterns.creational.singleton;

/**
 * Singleton
 * 
 * A singleton is a class that allows only a single instance of itself to be
 * created and gives access to that created instance. It contains static
 * variables that can accommodate unique and private instances of itself. It is
 * used in scenarios when a user wants to restrict instantiation of a class to
 * only one object. This is helpful usually when a single object is required to
 * coordinate actions across a system.
 * 
 * @author Dale DeMott
 *
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    };

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
