package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Player player1 = new Player(inputName());
        Player player2 = new Player(inputName());
        GuessNumber game = new GuessNumber(player1, player2);
        String option;
        do {
            game.run();
            option = inputReply();
            reset();
        } while (option.equals("yes"));
    }

    private static String inputName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя ");
        return scan.next();
    }

    private static void reset() {
        Arrays.fill(Player.getNumbersPlayer1(), 0, GuessNumber.triesCount + 1, 0 );
        Arrays.fill(Player.getNumbersPlayer2(), 0, GuessNumber.triesCount + 1, 0 );
        GuessNumber.triesCount = 1;
        GuessNumber.isPlayer1winner = false;
    }

    private static String inputReply() {
        System.out.println("\nХотите сыграть еще раз? [yes/no]:");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        if (choice.equals("no")) {
            System.out.println("Спасибо, что поиграли с компьютером");
        } else if (choice.equals("yes")) {
            System.out.println("Давайте попробуем еще раз :)");
        } else {
            inputReply();
        }
        return choice;
    }
}