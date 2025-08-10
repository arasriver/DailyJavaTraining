package DailyJavaTraining.ATM;

public class ATM {
    private int current_state = 0;
    public int check_Balance(){
        return current_state;
    }

    public int deposit(int amount){
        return current_state = current_state + amount;
    }
    public int withdraw(int amount){
        return current_state = current_state - amount;
    }

}
