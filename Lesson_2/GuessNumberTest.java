import java.util.Scanner;
public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String option;
        String name1 = inputName();
        String name2 = inputName();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.run();
            option = inputReply();
        } while (option.equals("yes"));
    }

    public static String inputName() {
        System.out.print("Введите имя ");
        return scan.next();
    }

    private static String inputReply() {
        System.out.println("Хотите сыграть еще раз? [yes/no]:");
        String choice = scan.next();
        if(choice.equals("no")) {
            System.out.println("Спасибо, что поиграли с компьютером");
        } else if(choice.equals("yes")) {
            System.out.println("Давайте попробуем еще раз :)");
        } else {
            inputReply();
        }
        return choice;
    }
}