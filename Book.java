package DailyJavaTraining;

public class Book {

    private String title;
    String author;

    public int getIsbn() {
        return isbn;
    }

    private int isbn;


    public String getTitle() {
        return title;
    }
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public void displayInfo(){
        System.out.println(title + " written by " + author + " with number " + isbn );
    }



}
