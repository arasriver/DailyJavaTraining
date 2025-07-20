package DailyJavaTraining;

public class PrintManager {
    private static PrintManager instance;
    private PrintManager() {
        System.out.println("Singleton has been created");
    }

    public static PrintManager getInstance() {
        if (instance == null){
            instance = new PrintManager();
        }
        return instance;
    }

    public void printDocument(String docName){
        System.out.println(docName + " is printing");
    }
}
