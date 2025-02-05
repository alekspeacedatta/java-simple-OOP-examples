public class Main {
    public static void main(String args[]){
        Library library = new Library();
        Book book1 = new Book("karaleva i karol", "bushtovski");
        Book book2 = new Book("jizn","qobulashvili");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println(library.getBooks());
        System.out.println("library books: ");

        for (Book book : library.getBooks()){
            System.out.println("Title: " + book.getTitle() + "\n" +"Author: " + book.getAuthor());
        }
    }
}