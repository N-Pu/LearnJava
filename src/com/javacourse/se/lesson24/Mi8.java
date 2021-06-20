package com.javacourse.se.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8 is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter Mi8 is going vertical.");
    }
}
