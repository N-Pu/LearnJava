package com.javacourse.se.lesson19;

public class Encapsulation {
    private int a, b;
    public String str1, str2;


    public int showResult() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}
