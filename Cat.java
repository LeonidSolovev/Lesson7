package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean satisfaction;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satisfaction = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate){
        if (appetite< plate.getFood()){
        plate.decreaseFood(appetite);
        satisfaction = true;
    } else{
            System.out.println("Еды недостаточно");
            satisfaction = false;
        }
        System.out.println(satisfaction);
    }
}