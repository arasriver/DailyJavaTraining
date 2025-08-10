package DailyJavaTraining.ATM;

import java.util.Scanner;

public class Get_Option {
    Scanner scanner = new Scanner(System.in);
    int option = 0;

    public int get_value() {
        System.out.println(" 1. Check Balance \n" +
                " 2. Deposit \n 3. Withdraw \n 4. Exit \n" +
                " Please choose an option: ");

        while (true) {
            option = scanner.nextInt();
            if (option != 1 && option != 2 && option != 3 && option != 4) {
                System.out.println("Enter a valid option ");
            } else {
                return option;
            }
        }
    }

    public boolean check_validity(int request, int current_state){
            if (request > current_state){
                return false;
            }else {
                return true;
            }
        }
}
