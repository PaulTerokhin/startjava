package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String userAnswer;
        do {
            String[] expression = inputMathExpression();
            Calculator calc = new Calculator();
            double result = calc.calculate(Integer.parseInt(expression[0]),
                    Integer.parseInt(expression[2]), expression[1].charAt(0));
            showResult(result);
            userAnswer = inputReply();
        } while(userAnswer.equals("yes"));
    }

    private static String[] inputMathExpression() {
        System.out.println("\nВведите выражение формата: 2 ^ 10");
        String string = scan.nextLine();
        return string.split(" ");
    }

    private static void showResult(double result) {
        System.out.print("Результат вычислений: ");
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%.3f\n", result);
        }
    }

    private static String inputReply() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String choice = scan.nextLine();
        if (choice.equals("no")) {
            System.out.println("Спасибо, что воспользовались калькулятором");
        } else if (choice.equals("yes")) {
            System.out.print("Давайте попробуем еще раз :)");
        } else {
            inputReply();
        }
        return choice;
    }
}