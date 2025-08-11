package DailyJavaTraining.RockPaperScissors;

import java.util.Scanner;

public class Repeat_Game {
    Scanner scanner = new Scanner(System.in);
    Check_Validity checkValidity = new Check_Validity();
    public boolean repeat(){
        System.out.println("Do you want to continue? n/y ");
        String answer="";
        boolean response = false;
        while (response == false) {
            answer = scanner.next();
            response = checkValidity.check_bool(answer);
            if (response == true){
                break;
            }
        }

        if (answer.equals("y")) {
            return true;
        } else {
                return false;
            }

    }
}
