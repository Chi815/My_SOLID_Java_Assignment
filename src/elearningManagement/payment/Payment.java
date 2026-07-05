package elearningManagement.payment;

/**
 * SOLID Principle: Interface Segregation Principle (ISP)
 * Lean interface containing only one responsibility. No unused bulk methods.
 * OOP Concept: Abstraction (Interface)
 */
public interface Payment {
    void makePayment(double amount);
}