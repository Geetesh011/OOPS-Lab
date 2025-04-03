
// Hybrid Inheritance - Printer, Scanner, and MultiFunction
interface Printer {
    void printDocument(String document);
}

interface Scanner {
    void scanDocument(String document);
}

class MultiFunction implements Printer, Scanner {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }

    public void copyDocument(String document) {
        System.out.println("Copying document: " + document);
    }
}

public class HybridInheritance_PrinterScanner {
    public static void main(String[] args) {
        MultiFunction mf = new MultiFunction();
        mf.printDocument("Report");
        mf.scanDocument("Invoice");
        mf.copyDocument("Contract");
    }
}