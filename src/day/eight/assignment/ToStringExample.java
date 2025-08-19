package day.eight.assignment;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Book[ID=" + bookId + ", Title='" + title + "', Author='" + author + "']";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Effective Java", "Joshua Bloch");

        // Printing objects directly calls toString() implicitly
        System.out.println(b1);
        System.out.println(b2);

        // Explicit call
        System.out.println("Explicit call: " + b1.toString());
    }
}
