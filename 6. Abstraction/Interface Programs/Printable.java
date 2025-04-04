interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing Document");
    }
}

public class PrintableDemo {
    public static void main(String args[]) {
        Printable obj = new Document(); // Using interface reference
        obj.print();
    }
}
