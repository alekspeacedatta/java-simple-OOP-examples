import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Book book1 = new Book("Little Computer and His Family", "Jared Smith", 986577543);
        Book book2 = new Book("The Great History Of Money Recoinage", "Isaac Newton", 41413123);
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> BookCollection = Book.getBookCollection();

        System.out.println("List of Books: " + "\n");
        for (Book book : BookCollection){
            System.out.println(book.getTitle() +"\n" + "Author: " + book.getAuthor() + "\n" + "ISBN: " + book.getIsbn() + "\n");
        }
        Book.removeBook(book1);
        for (Book book : BookCollection){
            System.out.println(book.getTitle() +"\n" + "Author: " + book.getAuthor() + "\n" + "ISBN: " + book.getIsbn() + "\n");
        }
    }
}