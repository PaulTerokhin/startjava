package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[3];
    private int triesCount;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int enteredNumber) {
        if (enteredNumber <= 0 || enteredNumber > 100) {
            throw new IllegalArgumentException("Число должно входить в полуинтервал (0, 100]. ");
        }
        triesCount++;
        numbers[triesCount - 1] = enteredNumber;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, triesCount);
    }

    public int getTriesCount() {
        return triesCount;
    }

    public void clearTries() {
        Arrays.fill(numbers, 0, triesCount, 0);
        triesCount = 0;
    }
}