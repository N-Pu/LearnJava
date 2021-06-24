package com.javacourse.se.lesson29;

public class ErrorExample {

    private ABC abc = new ABC();

    public void foo() {
        //System.out.println(1/0);
        //int array [] = {1,2,3};
        //array[5] = 3;
        try {
            abc.show();
        } catch (NullPointerException c) {
            System.err.println("Деление на ноль");
        }


    try {
        abc.show();
    } catch (Exception e) {
        System.err.println("Иное");
    }
}

}
