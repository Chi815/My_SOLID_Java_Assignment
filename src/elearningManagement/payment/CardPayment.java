package elearningManagement.payment;

/**
 * SOLID Principle: Open/Closed Principle (OCP)
 * UML Relationship: Realization of Payment Interface
 */
public class CardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("[Gateway] Charging $" + amount + " to Credit/Debit Card processor...");
    }
}