package DailyJavaTraining.PasswordGenerator;

import java.util.Random;

public class Numerical_Passwords implements  PasswordGenerator{

    @Override
    public void generatePassword() {
        Random random = new Random();
        int number = 10000000 + random.nextInt(90000000);
        System.out.println(number);
    }
}
