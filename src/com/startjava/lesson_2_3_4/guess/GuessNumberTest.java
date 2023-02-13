package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player(inputName());
        Player player2 = new Player(inputName());
        GuessNumber game = new GuessNumber(player1, player2);
        String option;
        do {
            game.run();
            option = inputReply();
        } while (option.equals("yes"));
    }

    private static String inputName() {
        System.out.print("Введите имя ");
        return scan.next();
    }

    private static String inputReply() {
        System.out.println("Хотите сыграть еще раз? [yes/no]:");
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