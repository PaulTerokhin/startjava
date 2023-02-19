package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(int number1, int number2, char operation) {
        switch(operation) {
            case '-':
                return Math.subtractExact(number1, number2);
            case '+':
                return Math.addExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '/':
                return (double) number1 / number2;
            case '^':
                return Math.pow((double) number1, (double) number2);
            case '%':
                return Math.floorMod(number1, number2);
        }
        return 0;
    }
}