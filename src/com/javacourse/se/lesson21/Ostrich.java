package com.javacourse.se.lesson21;

public class Ostrich extends Birds {
    public void hideHead() {
        System.out.println("Ostrich hides his head!");
    }

//    public void walk(String str) {
//        System.out.println("Ho-ho-ho" + str);
//    }


    @Override
    public void walk() {
        System.out.println("sup");
    }
}
