public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");

        byte age = 25;
        boolean maleGender = true;
        float height = 1.90f;
        char firstLetterOfName;

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

        firstLetterOfName = "Michael".charAt(0);
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

        // task 3 (1)

        System.out.println("\n3.Проверка числа");

        num1 = 2;
        if (num1 < 0 && num1 % 2 == 0) {
            System.out.println("число " + num1 + " является отрицательным и четным");
        } else if (num1 < 0 && num1 % 2 != 0) {
            System.out.println("число " + num1 + " является отрицательным и нечетным");
        } else if (num1 > 0 && num1 % 2 == 0) {
            System.out.println("число " + num1 + " является положительным и четным");
        } else if (num1 > 0 && num1 % 2 != 0) {
            System.out.println("число " + num1 + " является положительным и нечетным");
        } else {
            System.out.println("число " + num1 + " является нулем");
        }

        // task 3 (2)

        int num3 = -8;
        if (num3 != 0) {
            if (num3 < 0) {
                System.out.println("число " + num3 + " является отрицательным");
            } if (num3 > 0) {
                System.out.println("число " + num3 + " является положительным");
            } if (num3 % 2 == 0) {
                System.out.println("число " + num3 + " является четным");
            } else {
                System.out.println("число " + num3 + " является нечетным");
            }
        } else {
            System.out.println("число " + num3 + " является нулем");
        }

        // task 4

        System.out.println("\n4.Поиск одинаковых цифр в числах");

        num1 = 489;
        num2 = 782;
        boolean areOnesEqual = (num1 % 10 == num2 % 10);
        boolean areTensEqual = (num1 % 100 / 10 == num2 % 100 / 10);
        boolean areHundredsEgual = (num1 / 100 == num2 / 100);

        System.out.println(num1 + " " + num2);

        if (areOnesEqual | areTensEqual | areHundredsEgual) {
            if (areOnesEqual) {
                System.out.println("разряд единицы, повторяется цифра " + num1 % 10);
            } if (areTensEqual) {
                System.out.println("разряд десятки, повторяется цифра " + num1 % 100 / 10);
            } if (areHundredsEgual) {
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
        int interest1 = 5;
        int interest2 = 7;
        int interest3 = 10;
        int accruedInterest1 = deposit * interest1 / 100;
        int accruedInterest2 = deposit * interest2 / 100;
        int accruedInterest3 = deposit * interest3 / 100;

        System.out.println("Сумма вклада - " + deposit);

        if (deposit < 100_000) {
            System.out.println("Начисленный % " + accruedInterest1 + "\nИтоговая сумма с % " +
                    (deposit + accruedInterest1));
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            System.out.println("Начисленный % " + accruedInterest2 + "\nИтоговая сумма с % " +
                    (deposit + accruedInterest2));
        } else { 
            System.out.println("Начисленный % " + accruedInterest2 + "\nИтоговая сумма с % " +
                    (deposit + accruedInterest2));
        }

        // task 7

        System.out.println("\n7.Определение оценки по предметам");

        int historyResult = 59;
        int programmingResult = 91;
        int historyGrade;
        int programmingGrade;

        if (historyResult <= 60) {
            historyGrade = 2;
            System.out.println(historyGrade + " история");
        } else if (historyResult > 60 && historyResult <= 73) {
            historyGrade = 3;
            System.out.println(historyGrade + " история");
        } else if (historyResult > 73 && historyResult <= 91) {
            historyGrade = 4;
            System.out.println(historyGrade + " история");
        } else {
            historyGrade = 5;
            System.out.println(historyGrade + " история");
        }

        if (programmingResult <= 60) {
            programmingGrade = 2;
            System.out.println(programmingGrade + " программирование");
        } else if (programmingResult > 60 && programmingResult <= 73) {
            programmingGrade = 3;
            System.out.println(programmingGrade + " программирование");
        } else if (programmingResult > 73 && programmingResult <= 91) {
            programmingGrade = 4;
            System.out.println(programmingGrade + " программирование");
        } else {
            programmingGrade = 5;
            System.out.println(programmingGrade + " программирование");
        }

        System.out.println((historyGrade + programmingGrade) / 2 + " средний балл по предметам\n" +
                (historyResult + programmingResult) / 2 + " средний балл по предметам");

        // task 8

        System.out.println("\n8.Расчет прибыли за год");

        int rentalCosts = 5000;
        int revenue = 13000;
        int primeCost = 9000;
        int profit = (revenue - rentalCosts - primeCost) * 12;

        if (profit < 0) {
            System.out.println("прибыль за год: " + profit);
        } else {
            System.out.println("прибыль за год: + " + profit);
        }

        // task 9

        System.out.println("\n9.Подсчет количества банкнот");

        /*
        10 банкнот номиналом 100
        5 банкнот номиналом 10
        50 банкнот номиналом 1 
        номиналы банкнот
        требуемое их количество
        выдаваемую сумму
        */

        int amount = 567;
        int numberOfBanknotes100;
        int numberOfBanknotes10;
        int numberOfBanknotes1;
        
        System.out.println(amount);
        if (amount <= 1100){
            numberOfBanknotes100 = amount / 100;
            System.out.println(numberOfBanknotes100 + " банкнот номиналом 100");
            if (amount % 100 / 10 < 5) {
                numberOfBanknotes10 = amount % 100 / 10;
                numberOfBanknotes1 = amount % 10;
                System.out.println(numberOfBanknotes10 + " банкнот номиналом 10\n" +
                        + numberOfBanknotes1 + " банкнот номиналом 1");
            } else if (amount % 100 / 10 >= 5) {
                numberOfBanknotes10 = 5;
                numberOfBanknotes1 = amount - (numberOfBanknotes100 * 100) - 50;
                System.out.println(numberOfBanknotes10 + " банкнот номиналом 10\n" +
                        numberOfBanknotes1 + " банкнот номиналом 1");
            }
        } else {
            System.out.println("не хватает банкнот");
        }
    }
}