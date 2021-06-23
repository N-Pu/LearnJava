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
//        DollySheet dollySheet = new DollySheet();
//        DollySheet dollySheet2 = foo(dollySheet);
//
//        dollySheet.setName("Dolly");
//        dollySheet2.setName("Sheet");
//
//        System.out.println(dollySheet.getName());
//        System.out.println(dollySheet2.getName());
//
//
//    }
//
//    public static DollySheet foo(DollySheet dollySheet){
//        DollySheet sheet = null;
//        try {
//            sheet = (DollySheet) dollySheet.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return sheet;

//        String str1 = new String("Hot Java Hello");
//        String str2 = "Java";
//        String[] strings = str1.split(" "); // массив строк при виде пустого символа делит части строки. Деление строки другой строкой (как же глупо звучит)
//        char[] charArray = str1.toCharArray(); // разбиение строки посимвольно и каждый символ передается в массив char'ов
//        for (char element : charArray) {
//            System.out.println(element);//выводим каждый элемент в консоль
//        }
//
//        System.out.println(str1.compareTo(str2)); //лексикографиеское сравнение с учебом регистра
//        System.out.println(str1.compareToIgnoreCase(str2)); // лексикографичексое сравнение без учета регистра
//        System.out.println(str1.codePointAt(1)); // кодировка юникода позиции 1 слова Java (имеется ввиду буква a)
//        System.out.println(str1.concat(str2));//сложение двух строк, аналогична записи str1+str2
//        System.out.println(str1.equals(str2));//сравнение объектов, метод принимает объект типа object, т.к все классы унаследованы от object так что можно и строку передать.
//        System.out.println(str1.equalsIgnoreCase(str2));//тоже что и equals но без учета регистра
//        System.out.println(str1.hashCode());// хэшкод объекта
//        System.out.println(str1.indexOf(65));// если симвл 65 совпадает с символом в строке str1 то возвращается 1, иначе -1
//        System.out.println(str1.isEmpty());// возвращает true если строка пуста
//        System.out.println(str1.length());//длинна строки
//
//        for (String element : strings) {
//            System.out.println(element);
//        }
//
//
//        System.out.println(str1.substring(2, 8)); //вырезает кусок из строки от 2 до 8-го.
//        System.out.println(str1.toLowerCase());// приведение к нижнему регистру
//        System.out.println(str1.toUpperCase());// приведение к верхнему регистру
//
//        System.out.println(str1.trim());// обрезание пробелов в начале строки и в конце
//
//        System.out.println(String.valueOf(65)); //превращение переменной int  строку
//        System.out.println(String.valueOf(charArray));// принимает массив char'ов и преобразует их в строку


//        String str = new String();
//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder.capacity());
////        stringBuilder.ensureCapacity(20);
////        System.out.println(stringBuilder.capacity());
//        System.out.println(stringBuilder.append(" Hot"));
//


    }

}
