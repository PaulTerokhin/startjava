package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private static final int MAX_ROUNDS = 3;
    private int hiddenNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    void start() {
        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по " + MAX_ROUNDS + " попытки ");
        shufflePlayers(random);

        boolean isGameOver = false;
        while(!isGameOver) {
            for (Player player : players) {
                if (player.getTriesCount() == MAX_ROUNDS) {
                    System.out.println("Ваши попытки исчерпаны. Загаданное число " + hiddenNumber);
                    isGameOver = true;
                    break;
                }
                if (isGuessed(player)) {
                    isGameOver = true;
                    break;
                }
            }
        }
        displayNumbers();
        reset();
    }

    private void shufflePlayers(Random random) {
        for (int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
    }

    private boolean isGuessed(Player player) {
        int playerNumber;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println(player.getName() + ", введите число: ");
            playerNumber = scan.nextInt();
            try {
                player.addNumber(playerNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "Повторите попытку");
            }
        }
        return compareNumbers(player);
    }

    private boolean compareNumbers(Player player) {
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

    private void displayNumbers() {
        for(Player player : players) {
            System.out.print(player.getName() + ": ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void reset() {
        for(Player player : players) {
            player.clearTries();
        }
    }
}