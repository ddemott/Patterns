package com.demott.patterns.behavioral.state.tvstates;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}