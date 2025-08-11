package DailyJavaTraining.RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repeat_Game repeat_game = new Repeat_Game();
        Result_Compare result = new Result_Compare();
        Check_Validity checkValidity = new Check_Validity();
        Computer_Choice computer_choice = new Computer_Choice();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String com = computer_choice.getRandomChoice();
            System.out.println(com);
            String choice = scanner.next();
            boolean val = checkValidity.check(choice);
            if (val) {
                String winner = result.result_compare(choice, com);

                if (!winner.equals("equal")) {
                    System.out.println("Winner is " + winner);
                } else {
                    System.out.println("No winner");
                }
                if (!repeat_game.repeat()) {
                    break;
                }
            }

        }
    }
}
