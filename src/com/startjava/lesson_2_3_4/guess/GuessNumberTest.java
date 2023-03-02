package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer();
        Player player2 = createPlayer();
        Player player3 = createPlayer();
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String choice = "yes";
        do {
            if(choice.equals("yes")) {
                game.start();
            }
            System.out.print("\nХотите сыграть еще раз? [yes/no]:");
            choice = scan.nextLine();
        } while(!choice.equals("no"));
    }

    private static Player createPlayer() {
        System.out.print("Введите имя: ");
        return new Player(scan.nextLine());
    }
}