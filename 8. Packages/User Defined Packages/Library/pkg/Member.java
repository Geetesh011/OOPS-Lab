package pkg;

public class Member {
    private String name;
    
    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " borrowed " + book.getTitle());
    }
}
