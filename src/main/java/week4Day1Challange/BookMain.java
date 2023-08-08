package week4Day1Challange;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books= new ArrayList<>();
        books.add(new Book("Mother", "Gorky", 1965));
        books.add(new Book("Gatsby", "Jay", 1970));
        books.add(new Book("Summer Love", "Aay", 2010));
        books.add(new Book("Love", "Ram", 2070));

        System.out.println("Books published after 2000 are: ");
        for(Book book: books){
            if(book.getYearPublished()>2000){
                System.out.println("Books name :" + book.getTitle() + " and " +"Books author :" + book.getAuthor());
            }
        }

    }
}
