package com.javacourse.se.lesson20;

public enum Music {
    CLASSIC(44, "classic"), ROCK(33,"rock"), POP(5432, "rock");

    private int i;
    private String Name;

    Music(int i, String name) {
        this.i = i;
        Name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return Name;
    }

    public void foo(){
        System.out.println(Music.CLASSIC.getI());
    }
}
