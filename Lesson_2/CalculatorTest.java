import java.util.Scanner;

class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;
        do {
            int number1 = getInt1();
            char operation = getOperation();
            int number2 = getInt2();
            int result = Calculator.calculation(number1, number2, operation);
            System.out.println("Результат операции: " + result);

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scan.next();
            if (choice.equals("yes")) {
                System.out.println("Давай еще раз");
            } else if (choice.equals("no")) {
                System.exit(0);
            } else {
                System.out.print("Введите yes или no\n");
                choice = scan.next();
            }
        } while (choice.equals("yes"));
    }

    public static int getInt1() {
        System.out.println("Введите первое число");
        int number1 = scan.nextInt();
        while (number1 <= 0 ) {
            System.out.print("Ваше число должно быть положительным.Введите число заново\n");
            number1 = scan.nextInt();
        }
        return number1;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation = scan.next().charAt(0);
        return operation;
    }

    public static int getInt2() {
        System.out.println("Введите второе число");
        int number2 = scan.nextInt();
        while (number2 <= 0 ) {
            System.out.print("Ваше число должно быть положительным.Введите число заново\n");
            number2 = scan.nextInt();
        }
        return number2;
    }
}