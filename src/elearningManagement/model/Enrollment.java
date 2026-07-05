package elearningManagement.model;

import elearningManagement.payment.Payment;

/**
 * SOLID Principle: Dependency Inversion Principle (DIP)
 * Depends on the Payment interface abstraction, not concrete processing classes.
 * UML Relationship: Composition with Progress.
 */
public class Enrollment {
    private Course course;
    private Progress progress; // Composition: Owned entirely by this enrollment
    private boolean isPaid;

    public Enrollment(Course course) {
        this.course = course;
        this.progress = new Progress();
        this.isPaid = false;
    }

    // DIP Demonstration: Points to Payment interface
    public void processTuition(double amount, Payment paymentEngine) {
        if (amount >= course.getPrice()) {
            paymentEngine.makePayment(amount);
            this.isPaid = true;
            System.out.println("Payment verified! Access granted to: " + course.getTitle());
        } else {
            System.out.println("Payment Rejected: Insufficient balance.");
        }
    }

    public Course getCourse() { return course; }
    public Progress getProgress() { return progress; }
    public boolean isPaid() { return isPaid; }
}