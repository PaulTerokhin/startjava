package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int number1 = checkNumber(partsExpression[0]);
        int number2 = checkNumber(partsExpression[2]);
        char operation = partsExpression[1].charAt(0);

        return switch(operation) {
            case '-' -> Math.subtractExact(number1, number2);
            case '+' -> Math.addExact(number1, number2);
            case '*' -> Math.multiplyExact(number1, number2);
            case '/' -> (double) number1 / number2;
            case '^' -> Math.pow(number1, number2);
            case '%' -> Math.floorMod(number1, number2);
            default -> throw new IllegalArgumentException("Введен некорректный знак");
        };
    }
    static int checkNumber(String positiveInteger) {
        int number;
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                number = Integer.parseInt(positiveInteger);
                if (number <= 0) {
                    throw new IllegalArgumentException("Число должно быть положительным!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: число " + positiveInteger + " должно быть целым. Введите число заново");
                positiveInteger = scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: число " + positiveInteger +
                        " должно быть положительным. Введите число заново");
                positiveInteger = scan.next();
            }
        }
        return number;
    }
}