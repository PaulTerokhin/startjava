package com.startjava.lesson_2_3_4.calculator;

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

    private static int checkNumber(String number) {
        int positiveInteger = Integer.parseInt(number);
        if (positiveInteger < 0) {
            throw new IllegalArgumentException();
        }
        return positiveInteger;
    }
}