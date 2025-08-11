package DailyJavaTraining.RockPaperScissors;

public class Result_Compare {

    public String result_compare(String user_choice, String computer_choice){


        if (user_choice.equals("rock") && computer_choice.equals("scissors") ||
                user_choice.equals("scissors") && computer_choice.equals("paper") ||
                user_choice.equals("paper") && computer_choice.equals("rock")  ) {
            return "user";
        }
        if (user_choice.equals(computer_choice)){
            return "equal";
        }else {
        return "computer";
        }
    }


}
