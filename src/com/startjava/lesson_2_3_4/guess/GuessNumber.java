package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private static final int MAX_TRIES = 3;
    private final Random random = new Random();

    public GuessNumber(Player... players) {
        this.players = players;
    }

    void start() {
        int hiddenNumber = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по " + MAX_TRIES + " попыток ");
        shufflePlayers();

        int currentPlayerIndex = 0;
        while(true) {
            Player currentPlayer = players[currentPlayerIndex];
            if (currentPlayer.getTriesCount() < MAX_TRIES) {
                currentPlayer.setTriesCount(currentPlayer.getTriesCount() + 1);
            } else {
                System.out.println("Ваши попытки исчерпаны.Загаданное число " + hiddenNumber);
                break;
            }
            if (isGuessed(currentPlayer, hiddenNumber)) {
                break;
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }
        displayGameResults();
        reset();
    }

    private void shufflePlayers() {
        for (int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int playerNumber;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println(player.getName() + ", введите число: ");
            playerNumber = scan.nextInt();
            try {
                player.addNumber(playerNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        return compareNumbers(player, hiddenNumber);
    }

    private boolean compareNumbers(Player player, int hiddenNumber) {
        int playerNumber = player.getNumbers()[player.getTriesCount() - 1];
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
        for(Player player: players) {
            displayNumbers(player.getNumbers(), player.getName());
        }
    }

    private void displayNumbers(int[] numbers, String playerName) {
        System.out.print(playerName + ": ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void reset() {
        for(Player player: players) {
            player.resetNumbers();
            player.setTriesCount(0);
        }
    }
}