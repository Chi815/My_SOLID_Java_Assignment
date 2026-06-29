//SOLID
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.scan();
    }
}