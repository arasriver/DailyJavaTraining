package DailyJavaTraining.ATM;

import DailyJavaTraining.Logger;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ATM atm  = new ATM();
                Get_Option option = new Get_Option();
                System.out.println("Welcome to the ATM!");
                int current_state = atm.check_Balance();
                while (true) {
                        int  selected_option = option.get_value();
                        if (selected_option == 1) {
                                System.out.println("Current balance is:");
                                System.out.println(current_state);
                        }
                        if (selected_option == 2) {
                                System.out.println("Enter deposit amount: ");
                                int amount = scanner.nextInt();
                                current_state = atm.deposit(amount);
                        }
                        if (selected_option == 3) {
                                System.out.println("Enter withdrawal amount: ");
                                int amount = scanner.nextInt();
                                if (option.check_validity(amount, current_state)){
                                        current_state = atm.withdraw(amount);
                                }else{
                                        System.out.println("Not enough money in the account");
                                }
                        }
                        if (selected_option == 4) {
                                System.out.println("Thanks and Bye");
                                break;
                        }
                }
        }
}

