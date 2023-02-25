package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String choice = "yes";
        do {
            if(choice.equals("yes")) {
                while (true) {
                    String expression = inputMathExpression();
                    try {
                        double result = Calculator.calculate(expression);
                        showResult(result);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Числа должны быть целыми и положительными. Введите выражение заново.");
                    }
                }
            }
            System.out.print("\nХотите сыграть еще раз? [yes/no]:");
            choice = scan.nextLine();
        } while(!choice.equals("no"));
    }

    private static String inputMathExpression() {
        System.out.println("\nВведите выражение формата: 2 ^ 10");
        return scan.nextLine();
    }

    private static void showResult(double result) {
        System.out.print("Результат вычислений: ");
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%.3f\n", result);
        }
    }
}