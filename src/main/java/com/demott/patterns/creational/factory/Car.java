package com.demott.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Chasis chasis;
    private List<Wheel> wheels = new ArrayList<>();

    public Car() {
    }

    public static Car createCar(int numberOfWheels, int numberOfWheelBolts) {
        Car car = new Car();

        for (int i = 0; i < numberOfWheels; i++) {
            car.wheels.add(Wheel.createWheel(numberOfWheelBolts));
        }
        return car;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

}
