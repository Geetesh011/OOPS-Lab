

import pkg.Book;
import pkg.Member;

public class LibraryExample {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "John Smith");
        Member member = new Member("Sarah");
        
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        member.borrowBook(book);
    }
}
