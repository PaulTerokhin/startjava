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

    public static void setNumberPlayer(Player player, int enteredNumber) {
        if (player == GuessNumber.player1) {
            player1Numbers[GuessNumber.getTriesCount() - 1] = enteredNumber;
        } else {
            player2Numbers[GuessNumber.getTriesCount() - 1] = enteredNumber;
        }
        checkNumberRange(enteredNumber);
    }

    public static void checkNumberRange(int enteredNumber) {
        if (enteredNumber <= 0 || enteredNumber > 100) {
            throw new IllegalArgumentException();
        }
    }

    public static int[] getPlayer1Numbers() {
        return player1Numbers;
    }

    public static int[] getPlayer2Numbers() {
        return player2Numbers;
    }








}