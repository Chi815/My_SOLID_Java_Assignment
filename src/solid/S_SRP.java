package solid;

class Invoice {
    double amount = 500.0;
    void calculateTotal() { System.out.println("Calculating total..."); }
}
class InvoiceRepository {
    void saveToDatabase() { System.out.println("Saving invoice to database..."); }
}
class InvoicePrinter {
    void printInvoice() { System.out.println("Printing receipt document..."); }
}

public class S_SRP {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        InvoiceRepository repo = new InvoiceRepository();
        InvoicePrinter printer = new InvoicePrinter();
        inv.calculateTotal();
        repo.saveToDatabase();
        printer.printInvoice();
    }
}