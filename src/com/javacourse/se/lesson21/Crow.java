package com.javacourse.se.lesson21;

public class Crow extends Birds {
    public void fly() {
        System.out.println("Crow is flying away");
    }

    @Override
    public void walk() {
        System.out.println("Crow");
    }
}
