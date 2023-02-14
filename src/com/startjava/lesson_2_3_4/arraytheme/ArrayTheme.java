package com.startjava.lesson_2_3_4.arraytheme;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 6, 5, 4, 7, 2, 3};
        int len = numbers.length;

        displayArrayInt(numbers);

        for (int i = 0; i < len / 2; i++) {
            int j = numbers[len - i - 1];
            numbers[len - i - 1] = numbers[i];
            numbers[i] = j;
        }

        displayArrayInt(numbers);

        System.out.println("\n2.Вывод произведения элементов массива");

        numbers = new int[10];
        len = numbers.length;

        for(int i = 0; i < len; i++) {
            numbers[i] = i;
        }

        int result = 1;
        for(int i = 1; i < len - 1; i++) {
            result *= numbers[i];
            System.out.print(numbers[i] + ((numbers[i] == 8) ? " = " : " * "));
        }
        System.out.println(result + "\n" + numbers[0] + " " + numbers[9]);

        System.out.println("\n3.Удаление элементов массива");

        double[] doubleAr = new double[15];
        int count = 0;
        len = doubleAr.length;
        int indexMaxNum = len / 2;
        System.out.println("Исходный массив");

        for(int i = 0; i < len; i++) {
            doubleAr[i] = Math.random();
        }

        displayArrayDouble(doubleAr);

        double strategicValue = doubleAr[indexMaxNum];
        for (int i = 0; i < len; i++) {
            if (doubleAr[i] > strategicValue) {
                doubleAr[i] = 0;
                count++;
            }
        }

        System.out.println("\nИзмененный массив");

        displayArrayDouble(doubleAr);

        System.out.println("\nКоличество обнуленных ячеек\n" + count);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        int i = 0;
        for(char letter = 'A'; letter <= 'Z'; letter++) {
            letters[i++] = letter;
        }

        for(int rowCount = 0; rowCount <= letters.length; rowCount++) {
            for(char letter = letters[25]; letter > letters[25] - rowCount; letter--) {
                System.out.print(letter);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");

        numbers = new int[30];
        count = 0;
        len = numbers.length;

        for (i = 0; i < len; i++) {
            numbers[i] = (int) (60 + Math.random() * 40);
        }

        for (i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = (int) (60 + Math.random() * 40);
                    i = 0;
                }
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int symbol : numbers) {
            System.out.print(symbol + " ");
            count++;
            if(count % 10 == 0) {
                System.out.println();
            }
        }
    }
    private static void displayArrayInt(int[] array) {
        for(int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void displayArrayDouble(double[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%.3f  ", array[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
    }
}
