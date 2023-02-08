package com.startjava.lesson_2_3.animal;

public class Wolf {
    private String name;
    private int weightInKg;
    private int age;
    private String color;
    private String gender;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInKg() {
        return weightInKg;
    }
    
    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void move() {
        System.out.println("moving");
    }
    
    public void sit() {
        System.out.println("sitting");
    }
    
    public void run() {
        System.out.println("running");
    }
    
    public void howl() {
        System.out.println("howling");
    }
    
    public void hunt() {
        System.out.println("hunting");
    }
}