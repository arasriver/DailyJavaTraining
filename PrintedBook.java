package DailyJavaTraining;

public class PrintedBook extends Book{
    int page;
    public PrintedBook(String title, String author, int isbn, int page) {
        super(title, author, isbn);
        this.page = page;
    }

    @Override
    public void displayInfo(){
        System.out.println(getTitle() + " is Printed and has " + page + " pages. ");
    }

}
