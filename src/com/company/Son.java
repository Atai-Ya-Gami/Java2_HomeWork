package com.company;

public final class Son extends Father{
    public Son(int age, String name) {
        super(age, name);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "and he study at school";
    }

    @Override
    public String HavingAHobby() {
        return super.HavingAHobby() +" " +
                Hobbies.BASKETBALL + " "+ Hobbies.FOOTBALL;
    }
}
