package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");

        int counter = -10;
        int maxRange = 21;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        System.out.print("в промежутке [" + counter + ", " + maxRange + " ] сумма четных чисел = ");

        do {
            if (counter % 2 == 0) {
                sumOfEvenNumbers += counter;
            } else {
                sumOfOddNumbers += counter;
            }
            counter++;
        } while (counter <= maxRange);
        System.out.println(sumOfEvenNumbers + ", а нечетных = " + sumOfOddNumbers);

        // task 2

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;

        if (num2 > max) { 
            max = num2; 
        } 
        if (num3 > max) { 
            max = num3; 
        }

        if (num2 < min) {
            min = num2; 
        } 
        if (num3 < max) { 
            min = num3; 
        }

        for (int i = --max; i > min; i--) {
            System.out.printf("%2d", i);
        }

        // task 3

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int srcNum = 1234;
        int sum = 0;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            srcNum /= 10;
            sum += digit;
            System.out.print(digit);
        }
        
        System.out.println("\n\nСумма цифр = " + sum);

        // task 4

        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");

        min = 1;
        max = 24;
        int count = 0;

        for (int i = min; i < max; i += 2) {
            count++;
            System.out.printf("%4d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = count; i % 5 != 0; i++) {
            System.out.printf("%4d", 0);
        }

        // task 5

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        srcNum = 3242592;
        int countTwos = 0;
        System.out.print("число " + srcNum);
        
        while (srcNum != 0) {
            int digit = srcNum % 10;
            srcNum /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }
        if (countTwos != 0) {
            if (countTwos % 2 == 0) {
                System.out.println(" содержит " + countTwos + " (четное) количество двоек");
            } else {
                System.out.println(" содержит " + countTwos + " (нечетное) количество двоек");
            }
        } else {
            System.out.println(" не содержит двоек");
        } 

        // task 6

        System.out.println("\n6.Отображение фигур в консоли\n\n Фигура 1\n");

        count = 0;
        for (int i = 1; i <= 50; i++) {
            count++;
            System.out.print("*");
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nФигура 2\n");

        int charCount = 0;
        int rowCount = 5;
        while (rowCount >= 1) {
            while (charCount <= rowCount - 1) {
                System.out.print("#");
                charCount++;
            }
            rowCount--;
            charCount = 0;
            System.out.println();
        }

        System.out.println("\nФигура 3\n");

        int maxRows = 3;
        rowCount = 1;
        charCount = 0;

        do {
            do {
                System.out.print("$");
                charCount++;
            } while (charCount <= rowCount - 1);
            charCount = 0;
            rowCount++;
            System.out.println();
            if (rowCount == 4) {
                maxRows = 5;
                charCount = 2;
            }
            if (rowCount == 5) {
                maxRows = 1;
                rowCount = 1;
            }
        } while (rowCount <= maxRows);

        // task 7

        System.out.println("\n7.Отображение ASCII-символов\n");

        System.out.println("  dec" + " char");

        for (int i = 1; i <= 47; i += 2) {
            System.out.printf("%4d%4c%n", i, i);
        }
        
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%4d%4c%n", i, i);
        }

        // task 8 

        System.out.println("\n8.Проверка, является ли число палиндромом\n");

        srcNum = 1234321;
        int reversedNum = 0;
        int copySrcNum = srcNum;

        while (srcNum > 0) {
            int digit = srcNum % 10;
            reversedNum = (reversedNum * 10) + digit;
            srcNum /= 10;
        }
        if (copySrcNum == reversedNum) {
            System.out.println("Число " + copySrcNum + " является палиндромом");    
        } else {  
            System.out.println("Число " + copySrcNum + " не является палиндромом");  
        }

        // task 9 

        System.out.println("\n9.Определение, является ли число счастливым\n");

        srcNum = 532_424;
        int leftHalf = srcNum / 1000;
        int rightHalf = srcNum % 1000;
        int copyLeftHalf = leftHalf, copyRightHalf = rightHalf;
        int sumLeftHalf = 0, sumRightHalf = 0;

        for (int i = 1; i <= 3; i++) {
            int leftDigit = leftHalf % 10;
            int rightDigit = rightHalf % 10;
            sumLeftHalf += leftDigit;
            sumRightHalf += rightDigit;
            leftHalf /= 10;
            rightHalf /= 10;
        }
        
        System.out.println("Сумма цифр " + copyLeftHalf + " = " + sumLeftHalf +
                "\nСумма цифр " + copyRightHalf + " = " + sumRightHalf);

        if (sumLeftHalf == sumRightHalf) {
            System.out.println("\nЧисло " + srcNum + " является счастливым");
        } else {
            System.out.println("\nЧисло " + srcNum + " не является счастливым");
        }

        // task 10 

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");

        System.out.print("      ");

        for(int i = 2; i <= 9; i++ ) {
            System.out.printf("%3d",i);
        }
        
        System.out.println("\n     -------------------------");
         
        for(int i = 2 ;i <= 9; i++) {
            System.out.printf("%4d |", i);
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}