package Lab9.ex2.store;

public class Book extends Item {
    private String author;
    private String publisher;
    private String category;

    public Book(String title, double price, int quantity, String author, String publisher, String category) {
        super(title, price, quantity);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setCategory(category);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", category=" + category + ", publisher=" + publisher + "]";
    }

}
