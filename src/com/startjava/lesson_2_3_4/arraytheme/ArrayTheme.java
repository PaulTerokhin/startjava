package com.startjava.lesson_2_3_4.arraytheme;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] arrayInt = {1, 6, 5, 4, 7, 2, 3};
        int len = arrayInt.length;

        displayArrayInt(arrayInt);

        for (int i = 0; i <= len / 2; i++) {
            int j = arrayInt[--len];
            arrayInt[len] = arrayInt[i];
            arrayInt[i] = j;
        }

        displayArrayInt(arrayInt);

        System.out.println("\n2.Вывод произведения элементов массива");

        arrayInt = new int[10];
        len = arrayInt.length;

        for(int i = 0; i < len; i++) {
            arrayInt[i] = i;
        }

        int result = 1;
        for(int i = 1; i < len - 1; i++) {
            result *= arrayInt[i];
            System.out.print(arrayInt[i] + ((i != len - 2) ? " * " : " = "));
        }
        System.out.println(result + "\n" + arrayInt[0] + " " + arrayInt[9]);

        System.out.println("\n3.Удаление элементов массива");

        double[] arrayDouble = new double[15];
        int count = 0;
        len = arrayDouble.length;
        System.out.println("Исходный массив");

        for(int i = 0; i < len; i++) {
            arrayDouble[i] = Math.random();
        }

        displayArrayDouble(arrayDouble);

        double middleCellValue = arrayDouble[len / 2];
        for (int i = 0; i < len; i++) {
            if (arrayDouble[i] > middleCellValue) {
                arrayDouble[i] = 0;
                count++;
            }
        }

        System.out.println("\nИзмененный массив");

        displayArrayDouble(arrayDouble);

        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] arrayChar = new char[26];
        len = arrayChar.length;
        for(int i = 0; i < len; i++) {
            arrayChar[i] =(char) ('A' + i);
        }

        for(int rowCount = 0; rowCount <= len; rowCount++) {
            for(char letter = arrayChar[len - 1]; letter > arrayChar[len - 1] - rowCount; letter--) {
                System.out.print(letter);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");

        arrayInt = new int[30];
        len = arrayInt.length;

        for (int i = 0; i < len; i++) {
            int temp = (int) (60 + Math.random() * 40);
            for(int j = 0; j < len - (len - i); j++) {
                if (temp == arrayInt[j]) {
                    i = 0;
                    break;
                }
            }
            arrayInt[i] = temp;
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arrayInt[j] > arrayInt[j + 1]) {
                    int temp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = temp;
                }
            }
        }

        count = 0;
        for (int number : arrayInt) {
            System.out.print(number + " ");
            count++;
            if(count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6.Сдвиг элементов массива");

        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        count = 0;
        for(String string : srcArray) {
            System.out.print(string + " ");
            if(!string.isBlank()) {
                count++;
            }
        }
        System.out.println();

        String[] destArray = new String[count];

        int temp = 0;
        len = srcArray.length;
        for(int i = 0; i < len; i++) {
            if(!srcArray[i].isBlank()) {
                count = i;
                while (count < len && !srcArray[count].isBlank()) {
                    count++;
                }
                int length = count - i;
                System.arraycopy(srcArray, i, destArray, temp, length);
                temp += length;
                i = count;
            }
        }

        for(String string : destArray) {
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
