package com.company;

public abstract class GrandFather {
    private int age;
    private String name;


    public GrandFather(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getInfo(){
        return "Name of " + getClass().getSimpleName() + " is " + name +
                " and he is " + age + " years old,";

    }
}
