package DailyJavaTraining.RockPaperScissors;

import java.util.List;
import java.util.Random;

public class Computer_Choice {
    List<String> str_choice = List.of("rock", "paper", "scissors");
    Random random = new Random();
    public String getRandomChoice() {
        int index = random.nextInt(str_choice.size());
        return str_choice.get(index);
    }
}
