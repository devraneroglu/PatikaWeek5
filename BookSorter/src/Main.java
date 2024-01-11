import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new OrderClause(1));
        books.add(new Book("Anna Karenina", 1000, "Leo Tolstoy", "20240101"));
        books.add(new Book("Madame Bovary ", 1500, "Gustave Flaubert", "20240102"));
        books.add(new Book("Savaş ve Barış", 456, "Leo Tolstoy", "20240103"));
        books.add(new Book("Huckleberry Finn’in Maceraları", 2575, "Mark Twain", "20240104"));
        books.add(new Book("Lolita", 6858, "Vladimir Nabokov", "20240105"));
        books.add(new Book("Middlemarch", 589, "George Eliot", "20240106"));
        books.add(new Book("Moby-Dick", 4457, "Herman Melville", "20240107"));
        books.add(new Book("Büyük Umutlar", 9999, "Charles Dickens", "20240108"));
        books.add(new Book("Suç ve Ceza", 2757, "Fyodor Dostoyevsky", "20240109"));
        books.add(new Book("Emma", 2837, "Jane Austen", "20240110"));

        System.out.println("*** Order by name asc ***");
        for (Book b1 : books) {
            System.out.println(b1.getName() + "\t---------\t" + b1.getPageNum());
        }

        TreeSet<Book> copyBooks = new TreeSet<>(new OrderClause(2));
        copyBooks.addAll(books);

        System.out.println();
        System.out.println("*** Order by pagenumber asc ***");
        for (Book b2 : copyBooks) {
            System.out.println(b2.getName() + "\t---------\t" + b2.getPageNum());
        }
    }


}