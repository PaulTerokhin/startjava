package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        boolean isFinished = false;
        while(!isFinished) {
            String expression = inputMathExpression();
            double result = Calculator.calculate(expression);
            showResult(result);
            isFinished = isNext();
        }
    }

    private static String inputMathExpression() {
        System.out.println("\nВведите выражение формата: 2 ^ 10");
        Scanner scan = new Scanner(System.in);
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

    private static boolean isNext() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equals("no")) {
            System.out.println("Спасибо, что воспользовались калькулятором");
            return true;
        } else if (choice.equals("yes")) {
            System.out.print("Давайте попробуем еще раз :)");
        } else {
            isNext();
        }
        return false;
    }
}