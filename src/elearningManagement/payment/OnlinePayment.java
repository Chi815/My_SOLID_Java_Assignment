package elearningManagement.payment;

/**
 * SOLID Principle: Open/Closed Principle (OCP)
 * UML Relationship: Realization of Payment Interface
 */
public class OnlinePayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("[Gateway] Processing $" + amount + " via NetBanking Online Portal...");
    }
}