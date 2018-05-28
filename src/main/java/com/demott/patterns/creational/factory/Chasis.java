package com.demott.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Chasis {

    private List<Wheel> wheelSet = new ArrayList<>();

    public Chasis() {
    }

    public Chasis createChasis(int numberOfWheels, int numberOfWheelBolts) {
        for (int i = 0; i < numberOfWheels; i++) {
            wheelSet.add(Wheel.createWheel(numberOfWheelBolts));
        }

        Chasis chasis = new Chasis();

        return chasis;
    }

}
