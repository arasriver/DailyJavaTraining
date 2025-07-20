package DailyJavaTraining;

public class BookFactory {
    public static Book createBook(String type, String title, String author,int isbn, int page){
        if (type.equalsIgnoreCase("printed")){
            return new PrintedBook(title, author, isbn, page);
        } else if (type.equalsIgnoreCase("digital")){
            return new DigitalBook(title, author, isbn, page);
        } else{
            return null;
        }

    }
}
