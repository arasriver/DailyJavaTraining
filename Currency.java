package DailyJavaTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class Currency{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<String>();
        System.out.println("Enter 3 friend names: ");

        for (int i = 0; i < 3; i++) {
            String a = scanner.next();
            friends.add(a);
        }

        printFriends(friends);
    }

        public static void printFriends(ArrayList<String> list) {

        for (String name : list)
            System.out.println("Hello " + name);
        }

    }
