package DailyJavaTraining;

public class Dog implements Animal{
    @Override
    public void move(){
        System.out.println("is moving");
    }

    @Override
    public void sing() {
        System.out.println("is Barking");
    }
}
