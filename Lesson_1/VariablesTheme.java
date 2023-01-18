public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte ram = 32;
        float cpuGhz = 3.7f;
        long gpu = 1070l;
        int ssd = 512;
        short psuOutput = 400;
        double usb = 2.0;
        char usbType = 'A';
        boolean hasLan = true;
        System.out.println("объем оперативной памяти: " + ram);
        System.out.println("тактовая частота центрального процессора: " + cpuGhz);
        System.out.println("видеокарта nVidia GeForce rtx " + gpu);
        System.out.println("объем ssd: " + ssd);
        System.out.println("объем оперативной памяти: " + psuOutput);
        System.out.println("стандарт usb: " + usb);
        System.out.println("тип usb: " + usbType);
        System.out.println("наличие порта lan: " + hasLan);

        // 2 задача

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        byte penPrice = 100; 
        short bookPrice = 200;
        int price = penPrice + bookPrice;
        double sumDiscount = price * 0.11;
        double discountPrice = price - sumDiscount;
        System.out.println("сумма скидки: " + sumDiscount);
        System.out.println("общая стоимость товаров со скидкой: " + discountPrice);

        // 3 задача

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4 задача

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println(maxByte + " " + (++maxByte) + " " + (--maxByte));
        System.out.println(maxShort + " " + (++maxShort) + " " + (--maxShort));
        System.out.println(maxInt + " " + (++maxInt) + " " + (--maxInt));
        System.out.println(maxLong + " " + (++maxLong) + " " + (--maxLong));

        // 5 задача

        System.out.println("\n5. Перестановка значений переменных");

        int num1 = 2; //7
        int num2 = 5; //2
        int num3 = num1;

        System.out.println("с помощью третьей переменной");
        System.out.println(num1 + " " + num2);
        num1 = num2;
        num2 = num3;
        System.out.println(num1 + " " + num2);

        System.out.println("с помощью арифметических операций");
        System.out.println(num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println(num1 + " " + num2);

        System.out.println("с помощью побитовой операции");
        System.out.println(num1 + " " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(num1 + " " + num2);

        // 6 задача

        System.out.println("\n6. Вывод символов и их кодов");

        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println((int) ch1 + " " + ch1);
        System.out.println((int) ch2 + " " + ch2);
        System.out.println((int) ch3 + " " + ch3);
        System.out.println((int) ch4 + " " + ch4);
        System.out.println((int) ch5 + " " + ch5);

        // 7 задача

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + underscore + openParenthesis + " " + 
                closeParenthesis + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + underscore + underscore + 
                underscore + underscore + slash + backSlash + underscore + 
                underscore + backSlash);

        // 8 задача

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");

        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum % 100 / 10;
        int ones = srcNum % 10;
        int product = hundreds * tens * ones;
        int sum = hundreds + tens + ones;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);

        // 9 задача

        System.out.println("\n9.Вывод времени");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}