package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        int number1 = checkNumber(expression[0]);
        int number2 = checkNumber(expression[2]);
        char operation = expression[1].charAt(0);

        switch(operation) {
            case '-' -> {return Math.subtractExact(number1, number2);}
            case '+' -> {return Math.addExact(number1, number2);}
            case '*' -> {return Math.multiplyExact(number1, number2);}
            case '/' -> {return (double) number1 / number2;}
            case '^' -> {return Math.pow(number1, number2);}
            case '%' -> {return Math.floorMod(number1, number2);}
        }
        return 0;
    }

    private static int checkNumber(String positiveInteger) {
        int number;
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                number = Integer.parseInt(positiveInteger);
                if (number <= 0) {
                    throw new Exception("Число должнно быть положительным!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: число " + positiveInteger + " должно быть целым. Введите число заново");
                positiveInteger = scan.next();
            } catch (Exception e) {
                System.out.println("Ошибка: число " + positiveInteger + " должно быть положительным. Введите число заново");
                positiveInteger = scan.next();
            }
        }
        return number;
    }
}