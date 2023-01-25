public class CyclesTheme {

    public static void main(String [] args) {
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

        char symbol = '*';
        count = 0;
        for (int i = 1; i <=50; i++) {
            count +=1;
            System.out.print(symbol);
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nФигура 2\n");

        char char2 = '#';
        num1 = 0;
        num2 = 5;
        num3 = 1;
        while (num2 >= num3) {
            while (num1 <= num2 - 1) {
                System.out.print(char2);
                num1++;
            }
        num2--;
        num1 = 0;
        System.out.println();
        }

        System.out.println("\nФигура 3\n");

        int r = 1;
        int c = 0;
        int n = 3;

        do {
            do {
                System.out.print("$");
                c++;
            } while(c<= r -1);
        c = 0;
        r++;
        System.out.println("");
        if (r == 4) {
            n = 5;
            c = 2;
        }
        if (r == 5) {
            n = 1;
            r = 1;
        }
        } while (r <= n);

        // task 7

        System.out.println("\n7.Отображение ASCII-символов\n");

        char symbol1 = 1;
        System.out.println("  dec" + "  char");

        for (int i = 1; i <= 47;i += 2) {
            System.out.printf("%4d", i);
            System.out.println("    " + symbol1);
            symbol1 = (char) (symbol1 + 2);
        }
        
        symbol1 = 98;
        for (int i = 98; i <= 122; i +=2) {
            System.out.printf("%4d", i);
            System.out.println("    " + symbol1);
            symbol1 = (char) (symbol1 + 2);
        }

        // task 8 

        System.out.println("\n8.Проверка, является ли число палиндромом\n");

        srcNum = 1234321;
        int reversedNum = 0;
        int srcNum1 = srcNum;

        while (srcNum > 0) {
            int digit = srcNum % 10;
            reversedNum = (reversedNum * 10) + digit;
            srcNum = srcNum / 10;
        }
        if (srcNum1 == reversedNum) {
            System.out.println("Число " + srcNum1 + " является палиндромом");    
        } else {  
            System.out.println("Число " + srcNum1 + " не является палиндромом");  
        }

        // task 9 

        System.out.println("\n9.Определение, является ли число счастливым\n");

        srcNum = 532_424;
        srcNum1 = srcNum;;
        int sumOfLastDigits = 0; 
        int sumOfFirstDigits = 0;

        if (srcNum >= 100_000 && srcNum <= 999_999) {
            System.out.print("Сумма последних трех цифр ");
            for (int i = 1; i <= 3; i++) {
                int digit = srcNum % 10;
                sumOfLastDigits = sumOfLastDigits + digit;
                srcNum = srcNum / 10;
                System.out.print(digit + " ");
            }
            System.out.print("= " + sumOfLastDigits + "\nСумма первых трех цифр ");
            for (int i = 1; i <= 3; i++) {
                int digit = srcNum % 10;
                sumOfFirstDigits = sumOfFirstDigits + digit;
                srcNum = srcNum / 10;
                System.out.print(digit + " ");
            }
            System.out.println("= " + sumOfFirstDigits);
            if (sumOfLastDigits == sumOfFirstDigits) {
                System.out.println("\nЧисло " + srcNum1 + " является счастливым");    
            } else {  
                System.out.println("\nЧисло " + srcNum1 + " не является счастливым");  
            } 
        } else {
            System.out.println("\nЧисло " + srcNum1 + " должно содержать 6 знаков");
        }   

        // task 10 

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");

        int maxNum = 9;;

        System.out.print("      ");

        for(int i = 2; i <= maxNum; i++ ) {
            System.out.printf("%3d",i);
        }
        
        System.out.println("\n     -------------------------");
         
        for(int i = 2 ;i <= maxNum; i++) {
            System.out.printf("%4d |", i);
            for(int j = 2; j <= maxNum; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}