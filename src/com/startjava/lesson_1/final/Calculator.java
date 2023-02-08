package com.startjava.lesson_1.finish;

public class Calculator {

    public static void main(String[] args) {
        int number1 = 8, number2 = 3;
        char sign = '^';
        int result = 0;

        if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
        } else if (sign == '%') {
            result = number1 % number2;
        }

        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}

