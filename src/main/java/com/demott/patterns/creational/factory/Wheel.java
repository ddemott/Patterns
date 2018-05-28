package com.demott.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Wheel {

    private Wheel wheel;
    private List<WheelBolt> wheelBolts = new ArrayList<>();

    public static Wheel createWheel(int numberOfWheelBolts) {
        Wheel wheel = new Wheel();

        for (int i = 0; i < numberOfWheelBolts; i++) {
            wheel.getWheelBolts().add(new WheelBolt());
        }
        return wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public List<WheelBolt> getWheelBolts() {
        return wheelBolts;
    }

    public void setWheelBolts(List<WheelBolt> wheelBolts) {
        this.wheelBolts = wheelBolts;
    }

}
