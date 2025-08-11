package DailyJavaTraining.RockPaperScissors;

public class Check_Validity {
    public boolean check(String user_input){
        if (!user_input.equals("paper") && !user_input.equals("scissors") && !user_input.equals("rock")) {
            System.out.println("Enter valid input");
            return false;
        }else{
            return true;
        }
    }

    public boolean check_bool(String user_input){
        if (!user_input.equals("y") && !user_input.equals("n")) {
            System.out.println("Enter only n or y");
            return false;
        }else{
            return true;
        }
    }
}
