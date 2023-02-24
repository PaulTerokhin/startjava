package com.startjava.lesson_2_3_4.guess;

public class Player {
    private final String name;
    private final static int[] player1Numbers = new int[GuessNumber.getMaxTries()];
    private final static int[] player2Numbers = new int[GuessNumber.getMaxTries()];
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int[] getPlayer1Numbers() {
        return player1Numbers;
    }

    public static int[] getPlayer2Numbers() {
        return player2Numbers;
    }

    public void setNumberPlayer1(int enteredNumber) {
        player1Numbers[GuessNumber.getTriesCount() - 1] = enteredNumber;
    }

    public void setNumberPlayer2(int enteredNumber) {
        player2Numbers[GuessNumber.getTriesCount() - 1] = enteredNumber;
    }

}