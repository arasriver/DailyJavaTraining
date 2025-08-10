package DailyJavaTraining;

public class SingletonPattern {
    private int value;
    private static SingletonPattern obj = new SingletonPattern();
    private SingletonPattern() {}
    public static SingletonPattern getObjSingletonPattern() {
        return obj;
    }

}
