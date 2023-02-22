package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int number1 = CalculatorTest.checkNumber(partsExpression[0]);
        int number2 = CalculatorTest.checkNumber(partsExpression[2]);
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
}