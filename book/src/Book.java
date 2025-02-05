import java.util.ArrayList;

public class Book {
    private String title, author;
    private int isbn;
    private static ArrayList < Book > BookCollection = new ArrayList<Book> ();
    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void setTitle(){
        this.title = title;
    }
    public void setAuthor(){
        this.author = author;
    }
    public void setIsbn(){
        this.isbn = isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getIsbn(){
        return isbn;
    }
    public static void addBook(Book book){
        BookCollection.add(book);
    }
    public static void removeBook(Book book){
        BookCollection.remove(book);
    }
    public static ArrayList <Book> getBookCollection(){
        return BookCollection;
    }
}
