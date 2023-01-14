public class VariablesTheme {

    public static void main(String[] ags) {
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

        System.out.println("2. Расчет стоимости товара со скидкой");

        byte pen = 100;
        short book = 200;
        double sumDisc = (double)(pen + book) * 0.11;
        double discTotal = (double)(pen + book) * 0.89;
        System.out.println("сумма скидки: " + (int) sumDisc);
        System.out.println("общая стоимость товаров со скидкой: " + (int) discTotal);

        // 3 задача

        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4 задача

        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte byte1 = 127;
        short short1 = 32_767;
        int int1 = 2_147_483_647;
        long long1 = 9_223_372_036_854_775_807L;

        int byte2 = byte1 + 1;
        int short2 = short1 + 1;
        long int2 = (long)int1 + 1;

        int byte3 = byte1 - 1;
        int short3 = short1 - 1;
        int int3 = int1 - 1;
        long long3 = long1 - 1;

        System.out.print(byte1 + " ");
        System.out.print(byte2 + " ");
        System.out.println(byte3 + " ");
        System.out.print(short1 + " ");
        System.out.print(short2 + " ");
        System.out.println(short3 + " ");
        System.out.print(int1 + " ");
        System.out.print(int2 + " ");
        System.out.println(int3 + " ");
        System.out.print(long1 + "   -   ");
        System.out.println(long3 + " ");
        // Или инкремент и декремент нуждается в записи "++x и x--"?

        // 5 задача

        System.out.println("5. Перестановка значений переменных");

        int num1 = 2; //7
        int num2 = 5; //2
        int num3;

        System.out.println("с помощью третьей переменной");
        System.out.print(num1 + " ");
        System.out.println(num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.print(num1 + " ");
        System.out.println(num2);

        System.out.println("с помощью арифметических операций");
        System.out.print(num1 + " ");
        System.out.println(num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.print(num1 + " ");
        System.out.println(num2);

        System.out.println("с помощью побитовой операции");
        System.out.print(num1 + " ");
        System.out.println(num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.print(num1 + " ");
        System.out.println(num2);

        // 6 задача

        System.out.println("6. Вывод символов и их кодов");
        
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println((int)(ch1));
        System.out.println(ch1);
        System.out.println((int)(ch2));
        System.out.println(ch2);
        System.out.println((int)(ch3));
        System.out.println(ch3);
        System.out.println((int)(ch4));
        System.out.println(ch4);
        System.out.println((int)(ch5));
        System.out.println(ch5);
        

        // 7 задача

        System.out.println("7.Вывод в консоль ASCII-арт Дюка");

        char ch10 = '/';
        char ch11 = '\\';
        char ch12 = '_';
        char ch13 = '(';
        char ch14 = ')';
        System.out.println("     " + ch10 + ch11 + "     ");
        System.out.println("    " + ch10 + "  " + ch11 + "    ");
        System.out.println("   " + ch10 + ch12 + ch13 + " " + ch14 + ch11 + "   ");
        System.out.println("  " + ch10 + "      " + ch11 + "  ");
        System.out.println(" " + ch10 + ch12 + ch12
         + ch12 + ch12 + ch10 + ch11 + ch12 + ch12 + ch11 + " ");

        // 8 задача

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");

        int srcNum = 123;
        num1 = srcNum / 100;
        num2 = srcNum % 11;
        num3 = srcNum / 40;
        int multNum = num1 * num2 * num3;
        int sumNum = num1 + num2 + num3;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println(num1 + " сотен");
        System.out.println(num2 + " десятков");
        System.out.println(num3 + " единиц");
        System.out.println("Сумма его цифр = " + sumNum);
        System.out.println("Произведение = " + multNum);

        // 9 задача

        System.out.println("9.Вывод времени");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}