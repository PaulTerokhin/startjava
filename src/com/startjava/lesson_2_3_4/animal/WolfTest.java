package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf luk = new Wolf();
        luk.setName("Luk");
        luk.setWeightInKg(40);
        luk.setAge(5);
        luk.setColor("серый");
        luk.setGender("мужской");

        System.out.println("Кличка " + luk.getName() + "\nПол " + luk.getGender() + "\nВес " +
                luk.getWeightInKg() + "\nВозраст " + luk.getAge() + "\nОкрас " + luk.getColor()); 

        luk.move();
        luk.sit();
        luk.run();
        luk.howl();
        luk.hunt();
    }
}






