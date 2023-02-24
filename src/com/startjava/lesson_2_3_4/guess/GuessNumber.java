package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private static final Random random = new Random();
    private static int hiddenNumber = random.nextInt(100 + 1);
    private static final int maxTries = 10;
    private static int triesCount = 1;
    // Переменная нужна,чтобы показать введенные числа 2 игрока при победе 1 игрока верно(без 0)
    private static boolean isPlayer1winner = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        System.out.println("У каждого игрока по " + maxTries + " попыток ");
        while(true) {
            if (makeGuess(player1) || makeGuess(player2)) {
                break;
            }
            if (triesCount < maxTries) {
                triesCount++;
            } else {
                System.out.println("Ваши попытки исчерпаны.Загаданное число " + hiddenNumber);
                break;
            }
        }
        displayGameResults();
    }

    private boolean makeGuess(Player player) {
        System.out.println(player.getName() + ", введите число: ");
        Scanner scan = new Scanner(System.in);
        int playerNumber = scan.nextInt();
        saveNumber(player, playerNumber);
        return checkNumber(player, playerNumber);
    }

    private void saveNumber(Player player, int number) {
        if (player == player1) {
            player1.setNumberPlayer1(number);
        } else {
            player2.setNumberPlayer2(number);
        }
    }

    private boolean checkNumber(Player player, int playerNumber) {
        if (playerNumber == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    hiddenNumber + " с " + triesCount + " попытки");
            if (player == player1) {
                isPlayer1winner = true;
            }
            return true;
        }
        if (playerNumber > hiddenNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void displayGameResults() {
        displayNumbers(Arrays.copyOf(Player.getPlayer1Numbers(), triesCount));
        if (isPlayer1winner) {
            displayNumbers(Arrays.copyOf(Player.getPlayer2Numbers(), triesCount - 1));
        } else {
            displayNumbers(Arrays.copyOf(Player.getPlayer2Numbers(), triesCount));
        }
    }

    private void displayNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int getMaxTries() {
        return maxTries;
    }

    public static int getTriesCount() {
        return triesCount;
    }

    public static void setTriesCount() {
        triesCount = 1;
    }

    public static void setIsPlayer1winner() {
        isPlayer1winner = false;
    }

    public static void setHiddenNumber(){
        hiddenNumber = random.nextInt(100 + 1);
    }
}
