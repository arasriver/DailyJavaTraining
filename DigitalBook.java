package DailyJavaTraining;

public class DigitalBook extends Book{
    int page;
    public DigitalBook(String title, String author, int isbn, int page) {
        super(title, author, isbn);
        this.page = page;
    }

    @Override
    public void displayInfo(){
        System.out.println( getTitle() + " is digital and has " + page + " pages. ");
    }
}
