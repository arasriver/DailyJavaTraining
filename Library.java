package DailyJavaTraining;

import java.util.ArrayList;

public class Library {
    //String authorName;
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book b){
        books.add(b);
        System.out.println("Successfully added");
    }

    public void removeBook(int isbn){

        for (int i = 0 ; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn){
                books.remove(i);
                break;
            }
        }

    }


    public void displayAllBooks(){
        for (int i = 0 ; i< books.size(); i++){
            books.get(i).displayInfo();
        }
    }


    public void findBooksByAuthor(String authorName){
        for (int i = 0; i < books.size(); i++){
            if(books.get(i).author.equals(authorName)){
                System.out.println(books.get(i).getTitle());
            }
        }

    }



}
