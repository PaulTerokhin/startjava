public class CyclesTheme {

    public static void main(String [] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");

        int num1 = -10;
        int num2 = 21;
        int i = num1 - 1;
        int sum1 = 0;
        int sum2 = 0;
        do {
            i++;;
            if (i % 2 == 0) {
            sum1 += i;
            } else {
            sum2 += i;
            }
        } while (i < num2);
        System.out.println("в промежутке [" + num1 + ", " + num2 + "] сумма четных чисел = " + sum1 + 
                ", а нечетных = " + sum2);

        // task 2

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        num1 = 10;
        num2 = 5;
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

        for (i = --max; i > min; i--) {
            System.out.printf("%2d", i);
        }

        // task 3

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int srcNum = 1234;
        int sum = 0;
        int digit;
        while (srcNum != 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            sum += digit;
            System.out.print(digit + " ");
        }
        
        System.out.println("\n\nСумма цифр = " + sum);

        // task 4

        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");

        min = 1;
        max = 24;
        i = min -2;
        int count = 0;

        while (i < max - 1) {
            i += 2;
            count +=1;
            System.out.printf("%4d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        
        for (int m = count;m % 5 != 0; m++) {
            System.out.printf("%4d", 0);
        }

        // task 5

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        srcNum = 3242592;
        count = 0;
        System.out.print("число " + srcNum);
        while (srcNum != 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            if (digit == 2) {
                count++;
            }
        }
        if (count != 0) {
            if (count % 2 == 0) {
            System.out.println(" содержит " + count + " (четное) количество двоек");
            } else {
            System.out.println(" содержит " + count + " (нечетное) количество двоек");
            }
        } else {
            System.out.println(" не содержит двоек");
        } 

        // task 6

        System.out.println("\n6.Отображение фигур в консоли\n\n Фигура 1\n");

        char symbol = '*';
        count = 0;
        for (i = 1; i <=50; i++) {
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

        char char1 = 1;
        System.out.println("  dec" + "  char");

        for (i = 1; i <= 47;i += 2) {
            System.out.printf("%4d", i);
            System.out.println("    " + char1);
            char1 = (char) (char1 + 2);
        }
        
        char1 = 98;
        for (int m = 98; m <= 122; m +=2) {
            System.out.printf("%4d", m);
            System.out.println("    " + char1);
            char1 = (char) (char1 + 2);
        }

        // task 8 

        System.out.println("\n8.Проверка, является ли число палиндромом\n");

        srcNum = 1234321;
        sum = 0;
        int srcNum1 = srcNum;

        while (srcNum > 0) {
            digit = srcNum % 10;
            sum = (sum * 10) + digit;
            srcNum = srcNum / 10;
        }
        if (srcNum1 == sum) {
            System.out.println("Число " + srcNum1 + " является палиндромом");    
        } else {  
            System.out.println("Число " + srcNum1 + " не является палиндромом");  
        }

        // task 9 

        System.out.println("\n9.Определение, является ли число счастливым\n");

        srcNum = 2_136_789_033;
        srcNum1 = srcNum;;
        sum1 = 0; 
        sum2 = 0;

        if (srcNum >= 100_000) {
            System.out.print("Сумма цифр ");
            for (i = 1; i < 4; i++) {
                digit = srcNum % 10;
                sum1 = sum1 + digit;
                srcNum = srcNum / 10;
                System.out.print(digit + " ");
            }
            System.out.print("= " + sum1 + "\nСумма цифр ");
            while (srcNum > 0) {
                digit = srcNum % 10;
                srcNum = srcNum / 10;
                if (srcNum < 100) {
                    sum2 += digit;
                    System.out.print(digit + " ");
                }
            }
            System.out.println("= " + sum2);
            if (sum1 == sum2) {
                System.out.println("\nЧисло " + srcNum1 + " является счастливым");    
            } else {  
                System.out.println("\nЧисло " + srcNum1 + " не является счастливым");  
            } 
        } else {
            System.out.println("\nЧисло " + srcNum1 + " содержит меньше 6 знаков");
        }  

        // task 10 

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");

        int maxNum = 9;;

        System.out.print("      ");

        for(i = 2; i <= maxNum; i++ ) {
            System.out.printf("%3d",i);
        }
        
        System.out.println("\n     -------------------------");
         
        for(i = 2 ;i <= maxNum; i++) {
            System.out.printf("%4d |", i);
            for(int m = 2; m <= maxNum; m++) {
                System.out.printf("%3d", i * m);
            }
            System.out.println();
        }
    }
}