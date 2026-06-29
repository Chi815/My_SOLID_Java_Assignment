package solid;

interface DiscountProfile { double applyDiscount(double amount); }

class RegularCustomer implements DiscountProfile {
    public double applyDiscount(double amount) { return amount * 0.9; }
}
class VIPCustomer implements DiscountProfile {
    public double applyDiscount(double amount) { return amount * 0.8; }
}
class DiscountCalculator {
    void processDiscount(DiscountProfile customer, double amount) {
        System.out.println("Final Price: " + customer.applyDiscount(amount));
    }
}

public class O_OCP {
    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator();
        calc.processDiscount(new VIPCustomer(), 1000);
    }
}