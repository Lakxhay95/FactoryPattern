package com.genie.springdemo.loosecouple;

public class Car {
    IEnginer enginer;
    Car(IEnginer engine) {
        enginer = engine;
    }
    public void drive() {
        int start = enginer.start();
        if(start >= 1) {
            System.out.println("Engine Started....");
        } else {
            System.out.println("Engine in trouble....");
        }
    }
}
