package elearningManagement.payment;

/**
 * SOLID Principle: Open/Closed Principle (OCP)
 * Adds a new payment style without modifying any old existing logic classes.
 * UML Relationship: Realization of Payment Interface
 */
public class CashPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("[Counter] Cash/Voucher validation of $" + amount + " logged at accounts desk.");
    }
}