package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String origin, float height, 
            float weight, int speed, int armor) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOrigin() {
        return origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("drifting");
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }

    public void startShooting() {
        System.out.println("shooting");
    }
}