public class MyFirstGame {
    
    public static void main(String[] args) {
        int randomNumber = 54;
        int userNumber = 55;

        if (userNumber > randomNumber) {
            while (userNumber != randomNumber) {
                System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            }
        } else if (userNumber < randomNumber) {
            while (userNumber != randomNumber) {
                System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
                userNumber++;
            }
        } 

        System.out.println("Вы угадали. Загаданное число = " + userNumber);
    }
}