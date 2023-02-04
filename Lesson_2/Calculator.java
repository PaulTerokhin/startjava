public class Calculator {

    public static int calculation (int number1, int number2, char operation) {
        switch(operation) {
            case '-':
                return number1 - number2;
            case '+':
                return number1 + number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '^':
                int result = 1;
                for (int i = 1; i <= number2; i++) {
                    result *= number1;
                }
                return result;
            case '%':
                return number1 % number2;
        }
        return 0;
    }
}