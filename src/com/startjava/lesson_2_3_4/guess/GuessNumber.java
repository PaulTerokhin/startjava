package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private final Random random = new Random();
    private final int hiddenNumber = random.nextInt(100 + 1);
    static final int maxTries = 10;
    static int triesCount = 1;
    // Переменная нужна,чтобы показать введенные числа правильно(без лишних 0)
    private boolean isPlayer1winner = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

     void run() {
        System.out.println("У каждого игрока по " + maxTries + " попыток ");
        Player currentPlayer = player1;
        while(true) {
            if (playRound(currentPlayer)) {
                break;
            }
            if(currentPlayer == player2) {
                triesCount++;
            }
            if (triesCount > maxTries) {
                System.out.println("Ваши попытки исчерпаны.Загаданное число " + hiddenNumber);
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
         showPlayersNumbers();
    }

    private boolean playRound(Player player) {
        System.out.println(player.getName() + ", введите число: ");
        Scanner scan = new Scanner(System.in);
        int playerNumber = scan.nextInt();
        saveNumber(player, playerNumber, triesCount);
        return checkNumber(player, playerNumber);
    }

    private void saveNumber(Player player, int number, int triesCount) {
        if (player == player1) {
            Player.numbersPlayer1[triesCount - 1] = number;
        } else {
            Player.numbersPlayer2[triesCount - 1] = number;
        }
    }

    private boolean checkNumber(Player player, int playerNumber) {
        if (playerNumber == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " + triesCount + " попытки");
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

    private void showPlayersNumbers() {
        int[] numbersPlayer1 = Arrays.copyOf(Player.numbersPlayer1, triesCount);
        for (int number : numbersPlayer1) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] numbersPlayer2 = Arrays.copyOf(Player.numbersPlayer2, triesCount);
        if (isPlayer1winner) {
            numbersPlayer2 = Arrays.copyOf(Player.numbersPlayer2, triesCount - 1);
        }
        for (int number : numbersPlayer2) {
            System.out.print(number + " ");
        }
    }
}