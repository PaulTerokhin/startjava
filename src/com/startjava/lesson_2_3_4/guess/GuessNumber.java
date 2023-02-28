package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private static final int MAX_TRIES = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по " + MAX_TRIES + " попыток ");

        Player currentPlayer = player1;
        while(true) {
            if (currentPlayer.getTriesCount() < MAX_TRIES) {
                currentPlayer.setTriesCount(currentPlayer.getTriesCount() + 1);
            } else {
                System.out.println("Ваши попытки исчерпаны.Загаданное число " + hiddenNumber);
                break;
            }
            if (isGuessed(currentPlayer, hiddenNumber)) {
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        displayGameResults();
        reset(player1);
        reset(player2);
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int playerNumber;
        while(true) {
            System.out.println(player.getName() + ", введите число: ");
            Scanner scan = new Scanner(System.in);
            playerNumber = scan.nextInt();
            try {
                player.setNumberPlayer(player, playerNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Число должно входить в полуинтервал (0, 100]");
            }
        }
        return compareNumbers(player, playerNumber, hiddenNumber);
    }

    private boolean compareNumbers(Player player, int playerNumber, int hiddenNumber) {
        if (playerNumber == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    hiddenNumber + " с " + player.getTriesCount() + " попытки");
            return true;
        }
        System.out.println("Число " + playerNumber +
                ((playerNumber > hiddenNumber) ? " больше" : " меньше") + " того, что загадал компьютер");
        return false;
    }

    private void displayGameResults() {
        displayNumbers(player1.getPlayerNumbers());
        displayNumbers(player2.getPlayerNumbers());
    }

    private void displayNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void reset(Player player) {
        Arrays.fill(player.getPlayerNumbers(), 0);
        player.setTriesCount(0);
    }
}