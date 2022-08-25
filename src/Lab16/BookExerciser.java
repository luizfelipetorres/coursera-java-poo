package Lab16;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import Lab9.ex2.store.Book;

public class BookExerciser {
    public static void main(String[] args) {
        String location = "C:\\Users\\lfarias\\Documents\\Workspace\\coursera.java.poo\\src\\Lab16\\books.txt";
        List<Book> books = readBooksFromFile(location);
        System.out.println(books.toString());

    }

    public static List<Book> readBooksFromFile(String name) {

        List<Book> books = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(name);
                InputStreamReader isr = new InputStreamReader(fis);
                LineNumberReader lnr = new LineNumberReader(isr);) {
            String line;

            while ((line = lnr.readLine()) != null) {
                String title = line;
                String author = lnr.readLine();
                double price = Double.parseDouble(lnr.readLine());

                System.out.printf("%s%n%s%n%f%n", title, author, price);
                books.add(new Book(title, price, 1, author, "none", "romance"));

                // System.out.printf("linha %d: %s\n", lnr.getLineNumber(), line);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return books;

    }
}
