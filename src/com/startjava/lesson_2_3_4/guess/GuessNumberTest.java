package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Player player1 = new Player(inputName());
        Player player2 = new Player(inputName());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.start();
        } while(isNext());
    }

    private static String inputName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя ");
        return scan.next();
    }

    private static boolean isNext() {
        System.out.println("\nХотите сыграть еще раз? [yes/no]:");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        if (choice.equals("no")) {
            System.out.println("Спасибо, что поиграли с компьютером");
            return false;
        } else if (choice.equals("yes")) {
            System.out.println("Давайте попробуем еще раз :)");
            resetGame();
        } else {
            isNext();
        }
        return true;
    }

    private static void resetGame() {
        Arrays.fill(Player.getPlayer1Numbers(), 0, GuessNumber.getTriesCount(), 0 );
        Arrays.fill(Player.getPlayer2Numbers(), 0, GuessNumber.getTriesCount(), 0 );
        GuessNumber.setTriesCount();
        GuessNumber.setIsPlayer1winner();
        GuessNumber.setHiddenNumber();
    }
}