package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Помидорчик", 10);
        catArray[1] = new Cat("Огурчик", 20);
        catArray[2] = new Cat("Персик", 30);
        catArray[3] = new Cat("Кексик", 35);
        catArray[4] = new Cat("Коксик", 35);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < 5; i++) {
            catArray[i].eat(plate);
            plate.info();
        }
    }
}
