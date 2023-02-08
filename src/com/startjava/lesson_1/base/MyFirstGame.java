package com.startjava.lesson_1.base;

public class MyFirstGame {
    
    public static void main(String[] args) {
        int randomNumber = 54;
        int playerNumber = 73;

        while (playerNumber != randomNumber) {
            if (playerNumber > randomNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else if (playerNumber < randomNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }

        System.out.println("Вы угадали. Загаданное число = " + playerNumber);
    }
}