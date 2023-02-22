package com.startjava.lesson_2_3_4.guess;

public class Player {
    private final String name;
    private final static int[] numbersPlayer1 = new int[GuessNumber.getMaxTries()];
    private final static int[] numbersPlayer2 = new int[GuessNumber.getMaxTries()];
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int[] getNumbersPlayer1() {
        return numbersPlayer1;
    }

    public static int[] getNumbersPlayer2() {
        return numbersPlayer2;
    }

    public void setNumberPlayer1(int enteredNumber) {
        numbersPlayer1[GuessNumber.triesCount - 1] = enteredNumber;
    }

    public void setNumberPlayer2(int enteredNumber) {
        numbersPlayer2[GuessNumber.triesCount - 1] = enteredNumber;
    }

}