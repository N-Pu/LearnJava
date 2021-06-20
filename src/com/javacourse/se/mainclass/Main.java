package com.javacourse.se.mainclass;

import com.javacourse.se.lesson21.Birds;
import com.javacourse.se.lesson21.Crow;
import com.javacourse.se.lesson21.Ostrich;
import com.javacourse.se.lesson24.Test;
import com.javacourse.se.lesson23.AK47;
import com.javacourse.se.lesson23.Weapon;
import com.javacourse.se.lesson24.Boeing737;
import com.javacourse.se.lesson24.Mi8;
import com.javacourse.se.lesson25.DollySheet;

public class Main {
    public static void main(String[] args) {
//        Encapsulation encapsulation= new Encapsulation();
//        encapsulation.setA(10);
//        System.out.println(encapsulation.getA());

//        Music mc = ROCK;
//        for (Music element : Music.values()) {
//            System.out.println(element);
//        }
//        Music mc2 = Music.valueOf(Music.class, "ROCK");
//        System.out.println(mc2);
//        System.out.println(mc.ordinal());

//        switch (mc) {
//            case CLASSIC:
//                System.out.println("Classic music");
//                break;
//            case POP:
//                System.out.println("Pop music has arrived");
//                break;
//
//            case ROCK:
//                System.out.println("Rock isn't here");
//                break;
//        }

//        System.out.println(mc.getI());
//        System.out.println(mc.getName());
//        mc.foo();


//        Ostrich ostrich = new Ostrich();
//        Crow crow = new Crow();
//
//        ostrich.setName("Ostrich");
        //System.out.println(crow);

        //ostrich.walk();
//        ostrich.walk(" Hello"); //статический полиморфизм


//        Birds ostrich = new Ostrich();
//        Birds crow = new Crow();
//        Test test = new Test();
//        test.foo(crow);


//        Weapon weapon = new AK47();
//        AK47 ak47 = new AK47();

//        Mi8 mi8 = new Mi8();
//        Boeing737 boeing737 = new Boeing737();
//
//        Test test = new Test();
//        test.foo(mi8);
//        test.boeingUp(boeing737);
//        //test.allUp(mi8);
//        test.allUp(mi8); // все принимает, я дебил
//        test.allUp(boeing737);
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 = foo(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");

        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());


    }

    public static DollySheet foo(DollySheet dollySheet){
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}
