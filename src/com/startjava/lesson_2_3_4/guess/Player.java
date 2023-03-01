package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int triesCount = 0;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int enteredNumber) {
        numbers[triesCount - 1] = enteredNumber;
        if (enteredNumber <= 0 || enteredNumber > 100) {
            throw new IllegalArgumentException("Число должно входить в полуинтервал (0, 100]");
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, triesCount);
    }

    public int getTriesCount() {
        return triesCount;
    }

    public void setTriesCount(int triesCount) {
        this.triesCount = triesCount;
    }

    public void resetNumbers() {
        Arrays.fill(numbers,0,triesCount,0);
    }
}