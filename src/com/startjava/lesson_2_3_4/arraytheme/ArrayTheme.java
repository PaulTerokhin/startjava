package com.startjava.lesson_2_3_4.arraytheme;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 6, 5, 4, 7, 2, 3};
        int len = numbers.length;

        displayArrayInt(numbers);

        for (int i = 0; i <= len / 2; i++) {
            len--;
            int j = numbers[len - i];
            numbers[len - i] = numbers[i];
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
            System.out.print(numbers[i] + ((numbers[i] != numbers[len - 2]) ? " * " : " = "));
        }
        System.out.println(result + "\n" + numbers[0] + " " + numbers[9]);

        System.out.println("\n3.Удаление элементов массива");

        double[] doubleAr = new double[15];
        int count = 0;
        len = doubleAr.length;
        System.out.println("Исходный массив");

        for(int i = 0; i < len; i++) {
            doubleAr[i] = Math.random();
        }

        displayArrayDouble(doubleAr);

        double centerValue = doubleAr[len / 2];
        for (int i = 0; i < len; i++) {
            if (doubleAr[i] > centerValue) {
                doubleAr[i] = 0;
                count++;
            }
        }

        System.out.println("\nИзмененный массив");

        displayArrayDouble(doubleAr);

        System.out.println("\nКоличество обнуленных ячеек\n" + count);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        len = letters.length;
        for(int i = 0; i < len; i++) {
            letters[i] =(char) ('A' + i);
        }

        for(int rowCount = 0; rowCount <= len; rowCount++) {
            for(char letter = letters[len - 1]; letter > letters[len - 1] - rowCount; letter--) {
                System.out.print(letter);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");

        numbers = new int[30];
        len = numbers.length;

        for (int i = 0; i < len; i++) {
            numbers[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j <= len - (len - i); j++) {
                if(i != j) {
                    if (numbers[i] == numbers[j]) {
                        numbers[j] = (int) (60 + Math.random() * 40);
                        i = 0;
                    }
                }
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while(j >= 0 && temp < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }

        count = 0;
        for (int number : numbers) {
            System.out.print(number + " ");
            count++;
            if(count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6.Сдвиг элементов массива");

        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        count = 0;
        for(String string : strings) {
            System.out.print(string + " ");
            boolean isEmpty = string.isBlank();
            if(!isEmpty) {
                count++;
            }
        }
        System.out.println();

        String[] sourceCopy = new String[count];
        System.arraycopy(strings, 1, sourceCopy, 0,1);
        System.arraycopy(strings, 3, sourceCopy, 1,3);
        System.arraycopy(strings, 7, sourceCopy, 4,3);
        for(String string : sourceCopy) {
            System.out.print(string + " ");
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
