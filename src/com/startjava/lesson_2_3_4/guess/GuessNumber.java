package com.startjava.lesson_2_3_4.guess;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        Random random = new Random();
        int hiddenNum = random.nextInt(100 + 1);
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println(player1.getName() + ", введите число: ");
            int playerNumber = scan.nextInt();
            if (playerNumber == hiddenNum) {
                System.out.println("Победил игрок " + player1.getName());
                break;
            } 
            if (playerNumber > hiddenNum) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            }

            System.out.println(player2.getName() + ", введите число: ");
            playerNumber = scan.nextInt();
            if (playerNumber == hiddenNum) {
                System.out.println("Победил игрок " + player2.getName());
                break;
            }
            if (playerNumber > hiddenNum) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            }
        }
    }
}