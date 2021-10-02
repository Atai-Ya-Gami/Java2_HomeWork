package com.company;

public class Main {

    public static void main(String[] args) {
    Father Bannet = new Father(35,"Bannet");
        System.out.println(Bannet.getInfo());
        System.out.println(Bannet.HavingAHobby());
        Bannet.HavingACar("Mercedes", "AMG GT", 2020);
        Bannet.HavingACar("Mercedes", 2020);
        Bannet.Birthday("November");
        Bannet.Birthday("December", 31);
    Son Sano = new Son(13, "Sano Manjirô");
        System.out.println(Sano.getInfo());
        System.out.println(Sano.HavingAHobby());
    Son Baji = new Son(13, "Baji Keisuke");
        System.out.println(Baji.getInfo());
        System.out.println(Baji.HavingAHobby());

        System.out.println("Извините что получилось так просто и мало, до сдачи дз осталось 10 мин. В следующий раз постараюсь более обширнее и детальнее)");
}
}
