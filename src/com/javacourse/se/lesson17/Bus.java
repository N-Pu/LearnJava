package com.javacourse.se.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D2343H";
    public final int SERIAL_NUMBER_2 = 342342;

    public void go() {
        System.out.println("Go");
    }

//    public int showKm() {
//        int km = 65;
//        String str = "70km";
//        return km;
//    }

//    public Engine showKm() {
//        Engine engine = new Engine();
//        return engine;
//    }
    public void showKm(String km2){ //любое имя переменной
        System.out.println(km2+2);
    }

    public String ShowMph() {
        String str = "45 mph";
        return str;
    }
}
