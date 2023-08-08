package week4Day1Challange;
//Exercise 4: Exercise 2: Custom Class - Book
//        Create a custom class Book with the following attributes: title (String), author (String), and yearPublished (int).
//        Implement a Java program that uses an ArrayList to store a list of books and performs the following tasks:
//
//        Create and add several book objects to the ArrayList.
//        Find and print all books published after a given year (e.g., 2000).
public class Book {
String title;
    String author;
    int yearPublished;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
