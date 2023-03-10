package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");

        byte age = 25;
        boolean maleGender = true;
        float height = 1.90f;
        char firstLetterOfName = "Michael".charAt(0);

        if (age > 20) {
            System.out.println("adult");
        } else { 
            System.out.println("child");
        }

        if (!maleGender) {
            System.out.println("woman");
        } else { 
            System.out.println("man");
        }

        if (height < 1.80) {
            System.out.println("short or average");
        } else { 
            System.out.println("tall");
        }

        if (firstLetterOfName == 'M') {
            System.out.println("name starts with M");
        } else if (firstLetterOfName == 'I') { 
            System.out.println("name starts with I");
        } else {
            System.out.println("name does not start with M or I");
        }

        // task 2

        System.out.println("\n2.Поиск max и min числа");

        int num1 = 191;
        int num2 = 196;
        if (num2 > num1) {
            System.out.println("max : " + num2 + " " + "min : " + num1);
        } else if (num2 < num1) {
            System.out.println("max : " + num1 + " " + "min : " + num2);
        } else {
            System.out.println("The numbers are equal");
        }

        // task 3 

        System.out.println("\n3.Проверка числа");

        int num3 = 7;
        System.out.print("число " + num3 + " является");
        if (num3 != 0) {
            if (num3 < 0) {
                System.out.print(" отрицательным");
            } else {
                System.out.print(" положительным");
            } 
            if (num3 % 2 == 0) {
                System.out.print(" четным");
            } else {
                System.out.print(" нечетным");
            }
        } else {
            System.out.print(" нулем");
        }

        // task 4

        System.out.println("\n\n4.Поиск одинаковых цифр в числах");

        num1 = 489;
        num2 = 782;
        boolean equalOnes = (num1 % 10 == num2 % 10);
        boolean equalTens = (num1 % 100 / 10 == num2 % 100 / 10);
        boolean equalHudreds = (num1 / 100 == num2 / 100);

        System.out.println(num1 + " " + num2);

        if (equalOnes || equalTens || equalHudreds) {
            if (equalOnes) {
                System.out.println("разряд единицы, повторяется цифра " + num1 % 10);
            } 
            if (equalTens) {
                System.out.println("разряд десятки, повторяется цифра " + num1 % 100 / 10);
            } 
            if (equalHudreds) {
                System.out.println("разряд сотни, повторяется цифра " + num1 / 100);
            }
        } else {
            System.out.println("повторений нет");
        }


        // task 5

        System.out.println("\n5.Определение символа по его коду");

        char symbol = '\u0057';
        System.out.print(symbol);
        if (symbol >= '0' && symbol <= '9') {
            System.out.println(" число");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(" большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(" маленькая буква");
        } else {
            System.out.println(" не буква и не число");
        }

        // task 6

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");

        int deposit = 300_000;
        int interest = 5;

        if (deposit >= 100_000 && deposit <= 300_000) {
            interest = 7;
        } else if (deposit > 300_000) { 
            interest = 10;
        }

        int accruedInterest = deposit * interest / 100;

        System.out.println("Сумма вклада = " + deposit + "\nНачисленный % = " + accruedInterest + 
                "\nИтоговая сумма с % = " + (deposit + accruedInterest));

        // task 7

        System.out.println("\n7.Определение оценки по предметам");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;

        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }

        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }

        System.out.println(historyGrade + " история \n" + programmingGrade + " программирование");

        System.out.println((historyGrade + programmingGrade) / 2 + " средний балл по предметам\n" +
                (historyPercent + programmingPercent) / 2 + " средний процент по предметам");

        // task 8

        System.out.println("\n8.Расчет прибыли за год");

        int rentalCosts = 5000;
        int revenue = 13000;
        int primeCost = 9000;
        int profit = (revenue - rentalCosts - primeCost) * 12;

        if (profit <= 0) {
            System.out.println("прибыль за год: " + profit);
        } else {
            System.out.println("прибыль за год: + " + profit);
        } 

        // task 9

        System.out.println("\n9.Подсчет количества банкнот");

        int withdrawAmount = 822;
        int hundreds = withdrawAmount / 100;
        int tens = withdrawAmount / 10 % 10;
        int ones = withdrawAmount % 10;
        int hundredsAtm = 10;
        int tensAtm = 5;
        int onesAtm = 50;
        if (hundreds > hundredsAtm) {
            tens += (hundreds - hundredsAtm) * 10;
            hundreds = hundredsAtm;
        }
        if (tens > tensAtm) {
            ones += (tens - tensAtm) * 10;
            tens = tensAtm;
        }
        if (ones > onesAtm) {
            System.out.println("Купюр в банкомате недостаточно.");
        } else {
            System.out.println("Купюр 100$ - " + hundreds + " шт., купюр 10$ - " + tens +
                " шт., купюр 1$ - " + ones + " шт.\nВсего " + withdrawAmount + "$ к выдаче");
        }
    }
}