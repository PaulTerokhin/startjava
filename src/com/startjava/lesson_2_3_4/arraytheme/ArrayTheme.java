package com.startjava.lesson_2_3_4.arraytheme;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 6, 5, 4, 7, 2, 3};
        int len = numbers.length;

        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < len / 2; i++) {
            int j = numbers[len - i - 1];
            numbers[len - i - 1] = numbers[i];
            numbers[i] = j;
        }

        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2.Вывод произведения элементов массива");

        int[] nums = new int[10];
        int result = 1;
        len = nums.length;

        for(int i = 0; i < len; i++) {
            nums[i] = i;
        }

        for(int i = 1; i < len - 1; i++) {
            result *= nums[i];
            String sign = (nums[i] == 8) ? " = " : " * ";
            System.out.print(nums[i] + sign);
        }
        System.out.println(result + "\n" + nums[0] + " " + nums[9]);

        System.out.println("\n3.Удаление элементов массива");

        double[] doubleAr = new double[15];
        int count = 0;
        len = doubleAr.length;
        int indexMaxNum = len / 2;
        System.out.println("Исходный массив");

        for(int i = 0; i < len; i++) {
            doubleAr[i] = Math.random();
            System.out.printf("%.3f  ", doubleAr[i]);
            if (i == indexMaxNum) {
                System.out.println();
            }
        }

        for(int i = 0; i < len; i++) {
            if(doubleAr[i] > doubleAr[indexMaxNum]) {
                doubleAr[i] = 0;
                count++;
            }
        }

        System.out.println("\nИзмененный массив");

        for(int i = 0; i < len; i++) {
            System.out.printf("%.3f  ", doubleAr[i]);
            if (i == indexMaxNum) {
                System.out.println();
            }
        }

        System.out.println("\nКоличество обнуленных ячеек\n" + count);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] chars = new char[26];
        int i = 0;
        for(char char1 = 'Z'; char1 >= 'A'; char1--) {
            chars[i++] = char1;
        }

        for(int rowCount = 0; rowCount <= chars.length; rowCount++) {
            for(char char1 = chars[0]; char1 > chars[0] - rowCount; char1--) {
                System.out.print(char1);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");

        nums = new int[30];
        count = 0;
        len = nums.length;

        for (i = 0; i < len; i++) {
            nums[i] = (int) (60 + Math.random() * 40);
        }

        for (i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = (int) (60 + Math.random() * 40);
                    i = 0;
                }
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int symbol : nums) {
            System.out.print(symbol + " ");
            count++;
            if(count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
