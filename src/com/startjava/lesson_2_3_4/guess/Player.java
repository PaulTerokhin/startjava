package com.startjava.lesson_2_3_4.guess;

public class Player {
    public String name;
    static int[] numbersPlayer1 = new int[GuessNumber.maxTries];
    static int[] numbersPlayer2 = new int[GuessNumber.maxTries];
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}