package schoolManagement;
import java.util.*;
/**
 * Payment
 */
 interface Payment {
    void makePayment(double amount);
}

/**
 * OnlinePayment
 */
public class OnlinePayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Done: " + amount + " (Online)");
    }
}