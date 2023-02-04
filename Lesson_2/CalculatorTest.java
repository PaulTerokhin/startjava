import java.util.Scanner;

class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String suggestedAnswer;
        do {
            int number1 = inputNumber();
            char operation = inputOperation();
            int number2 = inputNumber();
            Calculator calc = new Calculator();
            int result = calc.calculation(number1, number2, operation);
            System.out.println("Результат операции: " + result);
            suggestedAnswer = inputReply();
        } while (suggestedAnswer.equals("yes"));
    }

    private static int inputNumber() {
        System.out.println("Введите число");
        int number = scan.nextInt();
        while (number <= 0) {
            System.out.print("Ваше число должно быть положительным.Введите число заново\n");
            number = scan.nextInt();
        }
        return number;
    }

    private static char inputOperation() {
        System.out.println("Введите операцию:");
        return scan.next().charAt(0);
    }

    private static String inputReply() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String choice = scan.next();
        if(choice.equals("no")) {
            System.out.println("Спасибо, что воспользовались калькулятором");
        } else if(choice.equals("yes")) {
            System.out.println("Давайте попробуем еще раз :)");
        } else {
            inputReply();
        }
        return choice;
    }
}