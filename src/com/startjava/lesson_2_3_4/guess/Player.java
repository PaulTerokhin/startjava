package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] playerNumbers = new int[10];
    private int triesCount = 0;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberPlayer(Player player, int enteredNumber) {
        player.playerNumbers[player.triesCount - 1] = enteredNumber;
        if (enteredNumber <= 0 || enteredNumber > 100) {
            throw new IllegalArgumentException();
        }
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(playerNumbers, triesCount);
    }

    public int getTriesCount() {
        return triesCount;
    }

    public void setTriesCount(int triesCount) {
        this.triesCount = triesCount;
    }
}