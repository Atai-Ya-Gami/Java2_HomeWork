package com.company;

public class Father extends GrandFather{

    public Father(int age, String name) {
        super(age, name);
    }
    public final void HavingACar(String brand, String model, int Age) {
        this.brand = brand;
        this.AgeOfCar = Age;
        this.model = model;
        System.out.println("Bannet have " + brand + model + Age);
    }
    public final void HavingACar(String brand, int Age){
    this.brand = brand;
    this.AgeOfCar = Age;
        System.out.println("Bannet have " + brand +" " + Age);
    }
    public void Birthday(String month){
        System.out.println("He was born in " + month );

    }
    public void Birthday(String month, int num){
        System.out.println("He was born in " + month +" " + num);

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                " he works as a programmer.";
    }
    public String HavingAHobby(){
        return "His hobby is " + Hobbies.SWIMMING;
    }

    private String brand;
    private String model;
    private int AgeOfCar;

}
